package projekt;

import java.util.Scanner;


public class Isik {
    public String nimi = "";
    public String sugu = "";
    public Küsimused küsimused;

    public int a;
    public int b;
    public int c;
    public int d;

    public Isik() { //Küsitakse isiku atribuute. Lisaks kontrollitakse, kas vastus on ootuspärane.
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Palun sisesta enda nimi: ");
        this.nimi = myObj.nextLine();
        boolean onMees = false;
        boolean onNaine = false;
        String valitudSugu;
        while (!onMees && !onNaine) {
            System.out.println("Palun sisesta enda sugu: ");
            valitudSugu  = myObj.nextLine();
            if (valitudSugu.equalsIgnoreCase("M")) {
                onMees = true;
                break;
            }
            else if (valitudSugu.equalsIgnoreCase("N")) {
                onNaine = true;
                break;
            }
        }

        Küsimused küsimused; // valitakse küsimused vastavalt soole
        if (onMees)
            küsimused = new KüsimusedM();
        else if (onNaine)
            küsimused = new KüsimusedN();
        else
            küsimused = new Küsimused();
        this.küsimused = küsimused;

        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public Küsimused getKüsimused() {
        return küsimused;
    } //tagastab küsimused

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void suurendaA(){
        a++;
    } //suurendab a-d ühe võrra
    public void suurendaB(){
        b++;
    } //suuendab b-d ühe võrra
    public void suurendaC(){
        c++;
    }//suurendab c-d ühe võrra
    public void suurendaD(){
        d++;
    }//suurendab d-d ühe võrra
    @Override
    public String toString() {
        return "Isik{" +
                "nimi='" + nimi + '\'' +
                ", sugu='" + sugu + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }




}
