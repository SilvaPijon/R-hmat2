package projekt;

public class PäevaMõttetera {

    private static String [] mõtteterad= { //päeva mõtteterade massiiv
            "Ära lase pead longu kui oled kaelani sita sees", "Katkine kell näitab päevas kaks korda õiget aega",
            "Kus viga näed laita, seal mine ja aita laita", "Pole sellist mörti, mida aeg ei lagundaks.", "Ära aja elus taga edu, vaid väärtusi",
            "Seal kus lõpeb soov, lõpeb ka inimene", "Kirjutage lühidalt ja ebaselgelt"
    };

    public static void  mõtteteraLeidija(){ //leiab kasutajale päeva mõttetera suvaliselt
        System.out.println(mõtteterad[(int)(Math.random()* mõtteterad.length)]);

    }
}