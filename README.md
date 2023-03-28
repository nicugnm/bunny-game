# bunny-game

Fiecare o sa faca fork la acest repository si la final dupa ce termina o sa faca un **PULL REQUEST**.

Codul trebuie sa fie citet, curat si sa respecte aceeasi structura!
Nu aveti voie sa modificati structura.

La final, codul va fi analizat de mine, la fiecare pull request in parte. Nu ma uit peste rezolvarile din
repository-urile voastre, decat peste pull request. O sa las comentarii la fiecare dintre voi care faceti pull request.

## Cerinte

- Rezolvati toate cerintele din Main.java
- Trebuie sa va treaca toate testele. Rulati `mvn clean test`
- Nu aveti voie sa modificati signatura metodelor fara sa ma intrebati.
- Nu rezolvati task-urile in Main.java. Fiecare o sa lucreze cerintele pe aceeasi structura:
-
    - in domain se afla clasele definite, fiecare in fisierul ei specific
-
    - in service se afla clasele care contin metodele care trebuie implementate
-
    - se va lucra cu interfetele, nu cu clasele implementate de interfete.
-
    - fiecare metoda din clasa menu va apela metodele din clasele service
-
    - abstractizarea este obligatorie, la fel si incapsularea. fara campuri publice, faceti nivelul de acces cat mai
      restrictiv! nu folositi mai mare de private decat daca este nevoie!