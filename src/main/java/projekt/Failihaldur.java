package projekt;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Failihaldur {
    public Failihaldur() {
        File a = new File("a.txt");
        File b = new File("b.txt");
        File c = new File("c.txt");
        File d = new File("d.txt");
        a.delete();
        b.delete();
        c.delete();
        d.delete();
    }
    public int tagastabVäärtust(String failinimi){
        File file = new File(failinimi);

        int number=0;
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file, "UTF-8")) {
                number = scanner.nextBigInteger().intValue();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }return number*10;
    }

    public void kogubTähti(String failinimi){
        File file = new File(failinimi);

        int number=0;
        if (file.exists()){
            try (Scanner scanner = new Scanner(file, "UTF-8")) {
                number = scanner.nextBigInteger().intValue();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }number+=1;
        try {
            FileWriter myWriter = new FileWriter(failinimi);
            myWriter.write(number+"");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
