valor_mano::[String] -> Int
valor_mano [] = 0
valor_mano (x:xs) =  if valor_carta x == 1 then hayAces (valor_carta x + valor_mano xs)
						 else valor_carta x + valor_mano xs

valor_carta:: String -> Int
valor_carta x = 
	if x == "J" then 10
	else if x == "Q" then 10
	else if x == "K" then 10
	else if x == "A" then 1
	else (read x :: Int) 

hay_aces::[String] -> Bool
hay_aces [] = False
hay_aces (x:xs) = if x == "A" then True
			else hay_aces xs


valor_aces::[(String,String)] -> Int
valor_aces[] = 0
valor_aces ((xv,xp):xs) = 
			if hay_aces (xv: == True && valor_mano  <= 10
				then 10 + valor_mano 
			else 
				valor_mano 
