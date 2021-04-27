package projekt;

public class Sotsiaalne implements Isiksus {

    @Override
    public void teavitaKasutajat(int tähis){ //kasutajale väljastatakse sotsiaalse isiksuse kirjeldus
        System.out.println("\nOled "+ tähis + "% sotsiaalne isiksuse tüüp. " +
                "\nInimesed on sinu energiaallikas. Sa ei suuda veeta ühtegi päeva inimkontaktita ning sellepärast oled sa esimene inimene, " +
                "\nkeda peole kaasa kustutakse. Sa ei karda kedagi ega midagi ning oled alati truu ja avatud teiste inimestega. " +
                "\nSa oskad rääkida oma elust ning oled inspiratsiooniks inimestele, kes mingil põhjusel ei oma samasugust julgust. " +
                "\nSul on alati olemas arvamus ning sa ei karda seda väljendada. Sa oskad anda inimestele konstruktiivset tagasisidet ning sinust " +
                "\nsaadakse aru. Isegi siis, kui sa mõnda asja ei oska, sinu peamine supervõim on olla kameeleon ning inimeste arvates oled multitalent, sest " +
                "\nmida sa ka ei teeks, saadab sind alati teatud sarm ja positiivsus.");
    }
}
