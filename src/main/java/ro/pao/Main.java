package ro.pao;

import ro.pao.domain.model.Egg;
import ro.pao.service.EggService;
import ro.pao.service.GeneralService;
import ro.pao.service.impl.EggServiceImpl;
import ro.pao.service.impl.GeneralServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final GeneralService generalService = new GeneralServiceImpl();
    private static final EggService eggService = new EggServiceImpl();

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /** NU MODIFICA IN SUS! **/

        while (true) {
            String intro = """
                Eu sunt iepurasul bunny si am nevoie de ajutorul tau.
                Daca vrei sa ma ajuti, trebuie sa stii cateva lucruri.
                
                Fiindca urmeaza perioada de paste, am nevoie de niste oua pe care trebuie sa le colorez.
                In momentul de fata, am nevoie de niste oua albe, dar nu stiu daca am suficiente. As avea nevoie de 5 oua. Ai putea sa ma ajuti te rog?
                S-ar putea sa-ti fie de ajutor faptul ca in repository exista deja metoda addEgg() :)
                """;
            System.out.println(intro);

            final List<Egg> eggs = eggService.getAllEggs();

            //TODO 1:
            generalService.addEggsTask1();
            System.out.println("Deocamdata astea sunt ouale pe care le am:");
            eggs.forEach(System.out::println);
            scanner.next();
            //FINISH TODO1

            //TODO 2:
            generalService.colorEggsTask2();
            System.out.println("Deocamdata astea sunt ouale pe care le am:");
            eggs.forEach(System.out::println);
            scanner.next();
            //FINISH TODO2

            //TODO 3:
            intro = """
                    Multumesc de ajutor!
                    Se poate sa faci ca toate campurile oualelor pe care le-ai adaugat sa nu fie nule?
                    """;
            System.out.println(intro);
            scanner.next();
            //FINISH TODO3

            //TODO 4:
            intro = """
                    Ops! Am uitat sa iti spun ca de data aceasta m-ar interesa mai multe culori. Ai putea sa adaugi mai multe?
                    Poate 'black' si 'white'? Sau 'blue'? Cum ar fi sa le adaugi pe toate?
                    """;
            System.out.println(intro);
            scanner.next();
            //FINISH TODO4

            //TODO 5:
            intro = """
                    Ops! Se poate ca am uitat sa iti spun ca de data aceasta am mai multe tipuri de oua. Ai putea sa implementezi asta?
                    Nu sunt doar oua de gaina, dar sunt si de prepelita!
                    """;
            System.out.println(intro);
            //FINISH TODO5
            scanner.next();


            //TODO 6:
            generalService.randomizeEggsTask();
            intro = """
                    Se pare ca spiridusul cel rau a fost pe aici! Mi-a adaugat prea multe oua de prea multe culori!
                    Ai putea sa imi faci o sumarizare a tuturor oualelor si afisand cate oua am de fiecare tip?
                    Bonus: Se poate sa faci asta cu un singur stream?
                    
                    Exemplu:
                    var ohMy = Stream.of("lions", "tigers", "bears");
                    Map<Integer, Long> map = ohMy.collect(
                       Collectors.groupingBy(
                          String::length,
                          Collectors.counting()));
                    System.out.println(map);    // {5=2, 6=1}
                    """;
            System.out.println(intro);
            //FINISH TODO6
            scanner.next();

            //TODO 7:
            intro = """
                    Uf! Ce multe am! Ai putea sa le salvezi pe toate intr-un record de tipul 'EggRecords'?
                    S-ar putea sa ai un fisier de test unde poti gasi un exemplu cum poti face asta!
                    Dar sa faci un record cu mai multe records ca sa ai cat mai multe date?:)
                    """;
            System.out.println(intro);
            //FINISH TODO7
            scanner.next();

            //TODO 8:
            intro = """
                    Ai putea sa partitionezi ouale folosind un predicate?
                    Ai aici un exemplu:
                    var ohMy = Stream.of("lions", "tigers", "bears");
                    Map<Boolean, List<String>> map = ohMy.collect(
                       Collectors.partitioningBy(s -> s.length() <= 7));
                    System.out.println(map);    // {false=[], true=[lions, tigers, bears]}
                    """;
            System.out.println(intro);
            //FINISH TODO8
            scanner.next();

            //TODO 8-bis:
            intro = """
                    Ai putea sa salvezi toate ouale intr-un HashMap?
                    As vrea sa am in functie de culoare, sa pot sa iau toate ouale in functie de culoare.
                    Adica: Map<EggColor, List<Egg>>
                    """;
            System.out.println(intro);
            //FINISH TODO8-bis
            scanner.next();

            //TODO 8-bis-2:
            intro = """
                    Vreau ca toate ouale mele sa fie sortate, by default, de catre structura de date folosita.
                    Oare ce structura de date as putea folosi ca sa le am sortate in mod implicit?
                    """;
            System.out.println(intro);
            //FINISH TODO8-bis-2
            scanner.next();

            //TODO 9:
            intro = """
                    Se pare ca iepurasul vrea ca de paste vrea sa faca cadou din preparate din oua.
                    Se poate sa implementezi metode de CREATE, UPDATE, DELETE si READ pentru preparate?
                    Te rog sa pastrezi aceeasi structura de cod ca la oua.
                    """;
            System.out.println(intro);
            //FINISH TODO9
            scanner.next();

            //TODO 10:
            intro = """
                    Se poate sa implementezi mai multe preparate din oua?
                    Niste placinte, niste omlete, niste prajituri?
                    Se pare ca adora prajiturile si doreste sa aiba mai multe tipuri de prajituri!
                    Tiramisu, tort de ciocolata, tort de fructe, brownie si gogosile ar fi niste prajituri care i-ar placea sa le imparta!
                    """;
            System.out.println(intro);
            //FINISH TODO10
            scanner.next();

            //TODO 10:
            intro = """
                    Prietenii iepurasului sunt Maria, Robert, Stefan, Andrei si Catalin.
                    Cam are nevoie de adresa de livrare, de numarul de telefon, mail.
                    Se poate sa implementezi clasele respective?
                    Fiecare prieten are un id, un nume si prenume, iar fiecare are o adresa de livrare diferita.
                    Se poate sa implementezi o metoda care afiseaza toti prietenii iepurasului?
                    """;
            System.out.println(intro);
            //FINISH TODO10
            scanner.next();

            //TODO 11:
            intro = """
                   Pentru a livra toate aceste bucate are nevoie de un cos. Ai putea sa implementezi un cos?
                   Cosul poate sa contina si prajituri si oua.
                   Cel mai important este ca iepurasul doreste sa spuna ca nimeni din prietenii lui nu vrea sa afle ce are fiecare in cos!
                   Asa ca incearca sa faci cosul o clasa imutabila :)
                    """;
            System.out.println(intro);
            //FINISH TODO11
            scanner.next();

            //TODO 12:
            intro = """
                   Fiecare din prietenii iepurasului sunt foarte fericiti pentru cadoul primit.
                   Si pentru acest lucru, ei doresc sa-i faca un serviciu, si anume doresc sa-i faca si la randul lui un cadou.
                   Cadoul iepurasului la fel, nu trebuie accesat de iepuras si trebuie sa faci cadoul iepurasului o clasa imutabila.
                   Cadoul poate sa fie ceva de paste, nu neaparat oua sau prajituri. Ce ai putea sa-i faci cadou unui iepuras?
                   Iepurasul o sa le multumeasca cu ceva in schimb, asa ca gandeste-te sa implementezi si o alta clasa ca fiind CadouPrieteni.
                   Lasa-te inspirat si implementeaza cadoul perfect, folosind UnaryOperator<Object> sau Function<Object, Object>!
                   Prima functie lambda o sa paseze obiectul dat iepurasului si a doua lambda function o sa cadoul dat prietenilor!
                   Incearca sa faci niste operatii pe obiecte si sa le folosesti in lambda function.
                    """;
            System.out.println(intro);
            //FINISH TODO12
            scanner.next();

            //TODO 13:
            intro = """
                   Toata lumea este fericita ca a ajuns la capat si de aceea, trebuie ca aplicatia noastra sa fie una completa.
                   Implementeaza teste pentru toate clasele implementate!
                    """;
            System.out.println(intro);
            //FINISH TODO13
            scanner.next();

            /** NU MODIFICA IN JOS! **/
            if ("exit".equals(scanner.next())) {
                break;
            }
        }
    }
}
