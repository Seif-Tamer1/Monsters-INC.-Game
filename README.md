# Monsters-INC.-Game
DooR DasH: Scare vs Laugh Touchdown is a competitive board game set in the world of Monsters Inc., where the city of Monstropolis runs on energy collected from children. In this thrilling race, two monsters compete to prove who can collect the most energy while navigating the dangerous Floor. 

Notes to work on till now:
no brackets means for everyone
1- monsters variable boundaries: position, energy,confusion turns,momentumTurns in Dasher, normalSpeedTurns in MultiTasker  (abousa)
   same thing with me in convoyer belts effect must be positve and contimination socks effect must be negative
   (suggestion by gemini is math manipulation(always positive use abs for example))
   use constant min if do not work. ex: this.energy=energy min, energymin=0
   
2- compareto mechanism (90% already correct) (abousa)

3-he didnt specify doing a method in interface why did we do it?is it fine? he said add if you want (problem in contimination socks and door cells)
I added the method in the file to avoid error for now. we either can:
1)put method in interface and putting it in door cell as it implements it to avoid error(which we are doing now) depending on the fact he said add methods if you want
2)do not put methods and depend on fact that logic is for milestone 2 but it would leave interface empty so idk if it would cause any problems in test phase
(After inspection 95% option 1 is the right one as description: Interface containing the method available to all objects that can modify a monster’s
energy (canister) within the game)

4-take care even though the classes are public and can be seen from all packes not only its own package you have to import it so java can know its place.

5-mohab setters and getters inside constructor (kinda fine ig)
