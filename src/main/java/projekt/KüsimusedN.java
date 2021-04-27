package projekt;

public class KüsimusedN extends Küsimused {

    KüsimusedN() {
        super();
        loeKüsimusedSisseN();
    }

    public void loeKüsimusedSisseN() { //lisab küsimused super klassi järjendile
        getKüsimusteNimekiri().add(") Kui su püksid rebenevad keset tänaval kõndimist:\n a) Tellid takso ja sõidad koheselt koju\n b) Kõnnid sihtkohta edasi nagu polekski midagi olnud\n c) Satud paanikasse ja hakkad nutma\n d) Katad kinni ja jooksed lähimasse riidepoodi\n");
        getKüsimusteNimekiri().add(") Kui oled dieedil ning tuttav pakub sulle brownie´t:\n a) Mulle ei maitse šokolaad\n b) Mis dieet?\n c) Sööd ära ja küsid, kas kuskil on neid veel\n d) Proovid väikese tükikese\n");
        getKüsimusteNimekiri().add(") Jäid bussist maha:\n a) Jooksed talle järgi ja karjud, et jääks seisma\n b) Ootad ära järgmise\n c) Lööd käega ja lähed jala\n d) Sa ei jää kunagi bussidest maha\n");
        getKüsimusteNimekiri().add(") Riigis kehtestati eriolukord, kuidas lahutad meelt?:\n a) Loed läbi kõik raamatud, mis kodus olemas\n b) Proovid uusi retsepte\n c) Vaatad filme\n d) Lähed jalutama või teed trenni\n");
        getKüsimusteNimekiri().add(") Millist puhkusetüüpi sooviksid hetkel:\n a) Rand, vesi ja palmipuud\n b) Loodus ja loomad\n c) Mäed ja talvesport\n d) Linnad ja kultuur\n");
    }

}
