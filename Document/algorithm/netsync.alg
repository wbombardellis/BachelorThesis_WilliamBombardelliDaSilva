algorithm netsync ((V0,E0), s0, s1, ds)
  (Vi,Ei) := (V0 \ s0 U s1, E0) //New net with first modification
    for each ni := asyncN(s0) do
      (ni_new,dn) := sync(s0, s1, ds, ni) //Update neighbor
      //If modified the neighbor
      if (dn not empty) then
        //then update net starting from it
        (Vi,Ei) := neysync((Vi,Ei), ni, ni_new, dn)
      endif
    endfor
    return (Vi,Ei)
end
    
