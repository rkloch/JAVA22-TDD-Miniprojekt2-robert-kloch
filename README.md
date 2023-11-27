
# Miniproject 2

Det första testet jag gjorde var att bara få en korrekt lista som output när jag satte intervallet 0-10. Detta gav direkt fel resultat. När jag väl hade löst problemet så gick jag över till nästa test som var intervallet 5-10. Detta misslyckades också eftersom koden använder en lista för att spara primtalen men också validera dem. Ifall listan börjar med 5 så skippar man tal som går att dividera med 2 och 3.

Lösningen var att inte använda listan och istället bara utgå från ett inkrementerande värde.

Sedan gick jag över till edge cases och skrev tester för negativa tal, tal som är större än 1000 och när higher bound är lägre än lower bound.

Jag tyckte testerna var som mest givande när man försökte hitta fel i en fungerande algoritm. Tyckte inte något var svårt, det var en väldigt mysig uppgift.
