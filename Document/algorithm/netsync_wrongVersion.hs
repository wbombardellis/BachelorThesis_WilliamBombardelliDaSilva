--A model
--We see a model as an integer, where its value represents the amount of elements it has.
type Model = Integer

--The modifications over a model
--We see the modifications as the amount of modified elements over a model
type DeltaM = Integer

--vertex id and its respective model
type Vertex = (Integer, Model)
--source vertex id and target vertex id
type Edge = (Integer, Integer)

{- sync takes the old version of the source model s0, the new version s1, the modifications over s0 ds, and the target unmodified model t0
	and performs forward synchronization from s to t, returning the new modified, synchronized version of t and the modifications performed over t0
	To simulate the synchronization we see a model as an integer, where its value represents the amount of elements it has.
	A synchronization adds therefore ds new elements to the target model dt.
	pre:
		s0 >= 0, s1 >= 0, ds >= 0, t0 >= 0
		ds = s1 - s0
	post:
		t1 = t0@pre + ds or t0 >= 1
		dt = ds or dt = 0
	exaples:
		sync 1 1 0 1 = (1, 0)
		sync 1 2 1 0 = (1, 0)
		sync 1 3 2 0 = (2, 2)
		sync 1 2 1 4 = (4, 0)
		sync 1 2 1 5 = (5, 0)
		sync 1 2 1 6 = (6, 0)
		sync 2 4 2 0 = (2, 2)
-}
sync :: Model -> Model -> DeltaM -> Model -> (Model,DeltaM)
sync s0 s1 0 t0 = (t0,0) --No changes in the source means no changes in the target
sync s0 s1 ds t0 = if t0 >= 1 then (t0,0) --Hypothetical convergence to avoid endless synchronizations
					else (t0 + ds, ds) 

{- Synchronize all target models in tl0 using the function sync (Forward synchronization from s to t).
	Returns a list of pairs containing the modified models and the respective modifications.
	See sync
	post:
		tl0.size = tl1.size, tl0.order = tl1.order
-}
syncall :: Model -> Model -> DeltaM -> [Model] -> [(Model,DeltaM)]
syncall s0 s1 ds [] = []
syncall s0 s1 ds tl0 = [sync s0 s1 ds (head tl0)] ++ syncall s0 s1 ds (tail tl0)

{- Synchronization of the network of models (v0,e), beginning from the vertex s0, given its updated version s1 and the modifications of its model ds
	Return a new version of the network (v1,e), with all models from v0 synchronized in their new versions v1.
	pre:
		s0 in v0
	post:
		v1.size = v0.size, e0 = e1
-}
netsync :: ([Vertex],[Edge]) -> Vertex -> Vertex -> DeltaM -> ([Vertex],[Edge])
netsync (v0,e) s0 s1 0 = (v0,e) --No changes on models implies no changes on the network
netsync (v0,e) s0 s1 ds = 
	let v1 = (update v0 s0 s1) in --update inital vertex s0 to s1
		let tl0 = (neighb (v0,e) s0) in --get direct neighbors of initial vertex s0
			let (tl1_models, dtl) = (split (syncall (snd s0) (snd s1) ds (map snd tl0))) in --synchronize direct neighbors. Get new versions of the models
				if all_zero dtl then (v1,e) --All deltas are equal to zero, no changes on the network (v0,e)
				else let tl1 = (merge (map fst tl0) tl1_models) in --pack each model into respective vertex				
					netsyncall (v1,e) tl0 tl1 dtl --synchronize the network starting from its direct neighbors

{- Performs a series of synchronizations over the network of models (v0,e). Synchronizes the network beginning from each vertex in sl0, 
	given their updated versions sl1 and their respective modifications of dsl
	Return a new version of the network (v1,e), with all models from v0 synchronized in their new versions v1.
	See netsync
	pre:
		sl0.size = sl1.size = dsl.size
	post:
		v1.size = v0.size, e0 = e1 
-}
netsyncall :: ([Vertex],[Edge]) -> [Vertex] -> [Vertex] -> [DeltaM] -> ([Vertex],[Edge])
netsyncall (v0,e0) [] [] [] = (v0,e0) --No vertices implies no changes on the network (v0,e)
netsyncall (v0,e0) sl0 sl1 dsl =
	let (v1,e1) = netsync (v0,e0) (head sl0) (head sl1) (head dsl) in --synchronize the network beginning from the first of vertices list sl0
		netsyncall (v1,e1) (tail sl0) (tail sl1) (tail dsl) --perform synchronization for the rest of vertices

neighb (v,[]) x = []
neighb (v,e) x =
	let cur_edge = (head e) in --current edge to be analysed
		if (fst x) == (fst cur_edge) then --if x is the origin of this edge
			[(find (snd cur_edge) v)] ++ (neighb (v,(tail e)) x) --then it is a neighbor
		else if (fst x) == (snd cur_edge) then --if x is the desitny of this edge
			[(find (fst cur_edge) v)] ++ (neighb (v,(tail e)) x) --then it is a neighbor
		else
			(neighb (v,(tail e)) x)

find i v = if (fst (head v)) == i then (head v) else (find i (tail v))

update [] x y = []
update l x y = 
	if (fst (head l)) == (fst x) then [y] ++ (tail l) --if id of current element equals to id of x, then change x for y
	else [(head l)] ++ (update (tail l) x y) --otherwise keep looking for x

merge [] [] = []
merge ids values = [((head ids), (head values))] ++ (merge (tail ids) (tail values))

split [] = ([],[])
split l = ((map fst l),(map snd l))

all_zero [] = False
all_zero l = foldr (&&) True (map (\x -> x == 0) l)

ga0 :: ([Vertex], [Edge])
ga0 = ([(1,0),(2,0)],
		[(1,2)]
	 )
--netsync ga0 (1,0) (1,1) 1 = ([(1,1),(2,1)],[(1,2)])
--netsync ga0 (2,0) (2,1) 1 = ([(1,1),(2,1)],[(1,2)])

gb0 :: ([Vertex], [Edge])
gb0 = ([(1,0),(2,0),(3,0),(4,0),(5,0),(6,0)],
		[(1,2),(1,3),(2,4),(3,5),(5,6)]
	 )
--netsync gb0 (1,0) (1,1) 1 = ([(1,1),(2,1),(3,1),(4,1),(5,1),(6,1)],
--								[(1,2),(1,3),(2,4),(3,5),(5,6)])
--netsync gb0 (4,0) (4,1) 1 = ([(1,1),(2,1),(3,1),(4,1),(5,1),(6,1)],
--								[(1,2),(1,3),(2,4),(3,5),(5,6)])

gc0 :: ([Vertex], [Edge])
gc0 = ([(1,0),(2,0),(3,0),(4,0),(5,0),(6,0),(7,0),(8,0)],
		[(1,2),(1,3),(2,4),(3,5),(5,6),(3,7),(5,7),(7,8)]
	 )
--netsync gc0 (1,0) (1,1) 1 = ([(1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1)],
--								[(1,2),(1,3),(2,4),(3,5),(5,6),(3,7),(5,7),(7,8)])
--netsync gc0 (5,0) (5,1) 1 = ([(1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1)],
--								[(1,2),(1,3),(2,4),(3,5),(5,6),(3,7),(5,7),(7,8)])