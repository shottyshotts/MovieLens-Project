Select S.FirstName, S.LastName from Student S, Guardian G 
where (S.GuardianID = G.GuardianID or S.GuardianID2 = G.GuardianID)
and G.Relation like "Grand%"
Group by StudentID
