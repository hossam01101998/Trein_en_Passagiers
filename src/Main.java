import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Conducteur conducteur1 = new Conducteur("Robin", 23 );
        Conducteur conducteur2 = new Conducteur("Klaas", 47 );
        conducteur2.setErvaring(5);
        conducteur1.setErvaring(1);

        Passagier passagier1 = new Passagier("Lode", 19);
        Passagier passagier2 = new Passagier("Ahmad", 24);
        Passagier passagier3 = new Passagier("Erica", 56);
        Passagier passagier4 = new Passagier("Josh", 8);
        Passagier passagier5 = new Passagier("Zoe", 79);
        Passagier passagier6 = new Passagier("Chantal", 37);


        passagier1.setTicket(true);
        passagier2.setTicket(true);
        passagier3.setTicket(true);
        passagier6.setTicket(true);

        Vrachttrein vrachttrein1 = new Vrachttrein("ROBIN EXPRESS");
        vrachttrein1.setConducteur(conducteur1);
        vrachttrein1.setLaadVermogen(50);
        vrachttrein1.setGeladen(40);
        System.out.println(vrachttrein1.toString());
        vrachttrein1.afladen("ROBIN EXPRESS");
        System.out.println(vrachttrein1.toString());

        Passagierstrein passagierstrein1 = new Passagierstrein("EHB EXPRESS");
        passagierstrein1.setConducteur(conducteur2);
        passagierstrein1.setHuidigeCapaciteit(0);
        passagierstrein1.setMaximumCapaciteit(20);

        








    }
}

//        TreeSet <Persoon> personen = new TreeSet<>();
////        ArrayList<Persoon> personas = new ArrayList<>();
//
//        Persoon p1 = new Persoon("jose", 25);
//        Persoon p2 = new Persoon("naroa", 17);
//        Persoon p3 = new Persoon("fifi", 29);
//        Persoon p4 = new Persoon("lucia", 14);
//        Persoon p5 = new Persoon("ana", 36);
//
//
//        personen.add(p1);
//        personen.add(p2);
//        personen.add(p3);
//        personen.add(p4);
//        personen.add(p5);
//
////        personas.add(p1);
////        personas.add(p2);
////        personas.add(p3);
////        personen.add(p4);
////        personen.add(p5);
//  //      System.out.println(personen.size());
//
//        //Collections.sort(Persoon);
//        for (Persoon p : personen) {
//            System.out.println(personen);
//
//        }
  //  }



