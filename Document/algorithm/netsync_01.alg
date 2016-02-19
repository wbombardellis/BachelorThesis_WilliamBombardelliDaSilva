algorithm netsync ((V0,E0), s0, s1)
  (Vi,Ei) := (V0 \ s0 U s1, E0) //New net with first modification
  si := s1
    for each ni := N(s0) do
      ni_new := sync(s0, si, si-s0, ni) //Update neighbor
      //If modified the neighbor
      if (ni_new <> ni) then
        //then update net starting from it
        (Vi,Ei) := neysync((Vi,Ei), ni, ni_new)
      endif
    endfor
    return (Vi,Ei)
end
    
