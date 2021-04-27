package projekt;

public class KüsimusedM extends Küsimused {

    KüsimusedM() {
        super();
        loeKüsimusedSisseM();
    }

    public void loeKüsimusedSisseM() { //lisab küsimused super klassi järjendile
        getKüsimusteNimekiri().add(") Kui piim läheb maha, kuidas käitud:\n a) Pühin sokiga ära\n b) Äkki kuivab ise ära\n c) Võtan paberi ja pühin ära\n d) Kutsun naise koristama\n");
        getKüsimusteNimekiri().add(") Kõik puhtad särgid on kapist otsa saanud:\n a)Võtan pesukorvist suvaliselt ühe, äkki ei haise\n b) Olen ilma särgita siis\n c) Panen pesu pesema\n d) Pahandan naisega, et pesu on pesematta\n");
        getKüsimusteNimekiri().add(") Ärkad hommikul ülesse ja tunned, et oled näljane:\n a) Tellid kulleriga toitu\n b) Lähed tühja kõhuga oma päevaga edasi\n c) Valmistad ise süüa sellest, mida külmikus leidub\n d) Helistad emale ja küsid, kas tal on midagi valmistatud\n");
        getKüsimusteNimekiri().add(") Kui näed kuskil kogemata oma peegeldust:\n a) Sätid kiiresti juukseid ühe käe liigutusega\n b) Teed näo, et sa ei näinud ning ei tea, kes see isik seal on\n c) Lähed lähemale ja vaatad, kas näed piisavalt hea välja\n d) Teed koleda näo, et ennast või teisi naerma ajada\n");
        getKüsimusteNimekiri().add(") Jäid tööle hiljaks:\n a) Tuled kohale ja loodad, et keegi ei pannud tähele\n b) Helistad tööandjale ja teeskled, et oled haige\n c) Tuled tööle ning püüad selgitada kõiki hilinemist põhjustanud aspekte\n d) Lihtsalt vabandad tööandja ees ning lubad, et enam ei kordu\n");
    }


}
