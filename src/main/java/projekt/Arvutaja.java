package projekt;

public class Arvutaja {

   //siin arvutatakse välja isiksuse tüüpide protsendid

    public int[] protsent(Isik isik){
       int a= isik.getA();
       int b= isik.getB();
       int c= isik.getC();
       int d= isik.getD();
       a=a*10;
       b=b*10;
       c=c*10;
       d=d*10;
       int[] protsendid={a,b,c,d};
       return protsendid;
    }
}
