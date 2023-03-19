# bunny-game
                        
Fiecare o sa faca fork la acest repository si la final dupa ce termina o sa faca un **PULL REQUEST**.

## Cerinte
- Rezolvati toate cerintele din Main.java
- Trebuie sa va treaca toate testele. Rulati `mvn clean test`
- Nu aveti voie sa modificati signatura metodelor fara sa ma intrebati.
- Nu rezolvati task-urile in Main.java. Fiecare o sa lucreze cerintele pe aceeasi structura:
- - in domain se afla clasele definite, fiecare in fisierul ei specific
- - in service se afla clasele care contin metodele care trebuie implementate
- - se va lucra cu interfetele, nu cu clasele implementate de interfete.
- - nu se va lucra cu clasele repository, ci cu clasele service.
- - fiecare clasa service va apela clasa repository.
- - abstractizarea este obligatorie, la fel si incapsularea. fara campuri publice, faceti nivelul de acces cat mai restrictiv! nu folositi mai mare de private decat daca este nevoie!