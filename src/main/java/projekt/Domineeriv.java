package projekt;

public class Domineeriv implements Isiksus {

    //kasutajale väljastatakse domineeriva isiksuse kirjeldus

    @Override
    public void teavitaKasutajat(int tähis){
        System.out.println("\nOled "+ tähis + "% domineeriv isiksuse tüüp. " +
                "\nSa eelistad olla meeskonna juht ning ei lase teistel väga oma arvamust või seisukohta muuta. " +
                "\nSulle tundub, et sind saadab edu ainult korralikul ettevalmistusel ning piisava info omamisel. " +
                "\nSa oled järjekindel ja edukas, sa tead täpselt, mis on sinu järgmine samm ning sa ei jäta kunagi muljet, " +
                "\nnagu sa ei saaks aru, mis toimub. Sulle meeldib võta vastutuse enda peale isegi siis, kui ei näe endas süüd. " +
                "\nSinuga ei tasu kunagi vaielda, sest isegi ku isul pole õigus, sa ei saa lubada, et sinu autoriteet teiste seal langeks." );
    }
}
