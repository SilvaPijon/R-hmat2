package projekt;

import java.util.ArrayList;
import java.util.Scanner;

public class Küsimused {

    private ArrayList<String> küsimusteNimekiri;
    private final String vastuseVariandid;
    private ArrayList<String> vastused;
    private int läbimiseIndeks;

    private String sisestuseViga = "Tekkis viga! Proovime uuesti!";

    Küsimused() { //loob küsimuse objekti
        this.küsimusteNimekiri = new ArrayList<String>();
        loeKüsimusedSisse();
        this.vastuseVariandid = "abcd";
        this.vastused = new ArrayList<String>();
        this.läbimiseIndeks = 0;

    }

    public void lisaTähed() { // väärtustab vastusevariantide listi
        for (int i = 0; i < this.vastuseVariandid.length(); i++) {
            String variant = Character.toString(this.vastuseVariandid.charAt(i));
            this.vastused.add(variant);
        }
    }

    public void loeKüsimusedSisse() { //lisab küsimuste listi viis küsimust
        this.küsimusteNimekiri.add(") Milline värv nendest meeldib sulle rohkem:\n a) Sinine\n b) Punane\n c) Kollane\n d) Roheline\n");
        this.küsimusteNimekiri.add(") Milline aine meeldis sulle koolis kõige rohkem:\n a) Matemaatika\n b) Muusikaõpetus\n c) Kehaline kasvatus\n d) Inglise keel\n");
        this.küsimusteNimekiri.add(") Mida on sinu foobia:\n a) Ämblikud, maod, putukad\n b) Kõrgus\n c) Sügav vesi\n d) TUlevikukartus\n");
        this.küsimusteNimekiri.add(") Millest sa unistad kõige rohkem:\n a) Palju raha\n b) Suur ja ilus kodu\n c) Kiire ja kallis auto\n d) Amet, mis mulle meeldib\n");
        this.küsimusteNimekiri.add(") Sinu lemmik filmižanr:\n a) Õudukad\n b) Komöödiad\n c) Seiklusfilmid\n d) Draamad\n");
    }

    public boolean variantSobib(String täht) { //vaatab kas kasutaja sisestus vastab ootustele
        if (this.vastused.contains(täht))
            return true;
        else return false;
    }

    public void lisaVastus(String vastus, Isik isik) { //Vaatab kas kasutaja vastus sobib ning suurenab  küsimuste indeksit või
        if (variantSobib(vastus)) {                     // või kuvab veateate
            võtaVastus(vastus, isik);
            läbimiseIndeks++;
        } else {
            System.out.println(this.sisestuseViga);
        }
    }

    public void küsiKüsimused(Isik isik){   // küsib kasutajalt küsimuse ja võtab vastuse
        if (läbimiseIndeks == 0)
            lisaTähed();
        Scanner myObj = new Scanner(System.in);
        String vastus;
        for (; läbimiseIndeks < küsimusteNimekiri.size();) {
            System.out.println((läbimiseIndeks+1)+küsimusteNimekiri.get(läbimiseIndeks));
            vastus = myObj.nextLine();
            lisaVastus(vastus, isik);
        }
    }

    public void võtaVastus(String vastus, Isik isik){ //suurendatakse vastavat tähte
        if (vastus.equalsIgnoreCase("a")){
            isik.suurendaA();
        }
        if (vastus.equalsIgnoreCase("b")){
            isik.suurendaB();
        }
        if (vastus.equalsIgnoreCase("c")){
            isik.suurendaC();
        }
        if (vastus.equalsIgnoreCase("d")){
            isik.suurendaD();
        }
    }

    public int getLäbimiseIndeks() {
        return läbimiseIndeks;
    }

    public ArrayList<String> getKüsimusteNimekiri() {
        return küsimusteNimekiri;
    }
}
