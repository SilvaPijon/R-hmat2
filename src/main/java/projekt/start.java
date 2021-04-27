package projekt;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class start extends Application {
    Failihaldur failihaldur = new Failihaldur();
    @Override
    public void start(Stage peaLava) {


        küsiKüsimus("Kui piim läheb maha, kuidas käitud:", "a) Pühin sokiga ära\n", "b) Äkki kuivab ise ära\n", "c) Võtan paberi ja pühin ära\n", "d) Kutsun naise koristama\n", true);
        küsiKüsimus("Kõik puhtad särgid on kapist otsa saanud:", "a) Võtan pesukorvist suvaliselt ühe, äkki ei haise\n", "b) Olen ilma särgita siis\n", "c) Panen pesu pesema\n", "d) Pahandan naisega, et pesu on pesematta\n",false);
        küsiKüsimus("Ärkad hommikul ülesse ja tunned, et oled näljane:", "a) Tellid kulleriga toitu\n", "b) Lähed tühja kõhuga oma päevaga edasi\n", "c) Valmistad ise süüa sellest, mida külmikus leidub\n", "d)Helistad emale ja küsid, kas tal on midagi valmistatud\n",  false);
        küsiKüsimus("Kui näed kuskil kogemata oma peegeldust:", "a) Sätid kiiresti juukseid ühe käe liigutusega\n", "b) Teed näo, et sa ei näinud ning ei tea, kes see isik seal on\n", "c) Lähed lähemale ja vaatad, kas näed piisavalt hea välja\n", "d) Teed koleda näo, et ennast või teisi naerma ajada\n",false);
        küsiKüsimus("Jäid tööle hiljaks: ", "a) Tuled kohale ja loodad, et keegi ei pannud tähele\n", "b) Helistad tööandjale ja teeskled, et oled haige\n", "c) Tuled tööle ning püüad selgitada kõiki hilinemist põhjustanud aspekte\n", "d) Lihtsalt vabandad tööandja ees ning lubad, et enam ei kordu\n", false);
        küsiKüsimus("Sinu lemmik filmižanr:", "a) Õudukad \n", "b) Komöödiad\n", "c) Seiklusfilmid\n", "d) Draamad\n",false);
        küsiKüsimus("Millest sa unistad kõige rohkem:", "a) Palju raha\n", "b) Suur ja ilus kodu\n", "c) Kiire ja kallis auto\n", "d) Amet, mis mulle meeldib\n", false);
        küsiKüsimus("Mis on sinu foobia", "a) Ämblikud, maod, putukad\n", "b) Kõrgus\n", "c) Sügav vesi\n", "d) Tulevikukartus\n",  false);
        küsiKüsimus("Milline aine meeldis sulle koolis kõige rohkem:", "a) Matemaatika\n", "b) Muusikaõpetus\n", "c) Kehaline kasvatus\n", "d) Inglise keel\n", false);
        küsiKüsimus("Milline värv nendest meeldib sulle rohkem:", "a) Sinine\n", "b) Punane\n", "c) Kollane\n", "d) Roheline\n", false);

    }

    private void küsiKüsimus(String küsimus, String a, String b, String c, String d, boolean viimane) {
        ObservableList<String> items2 = FXCollections.
                observableArrayList(a, b, c, d);
        Stage kusimus = new Stage();
        BorderPane piir = new BorderPane();
        ListView<String> list = new ListView<String>();
        list.setItems(items2);
        list.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        if (newValue.equals(a)) {
                            failihaldur.kogubTähti("a.txt");

                        }
                        if (newValue.equals(b)) {
                            failihaldur.kogubTähti("b.txt");

                        }
                        if (newValue.equals(c)) {
                            failihaldur.kogubTähti("c.txt");

                        }
                        if (newValue.equals(d)) {
                            failihaldur.kogubTähti("d.txt");

                        }
                        kusimus.hide();
                        if (viimane) {
                            kuvaTulemus();
                        }
                    }
                }
        );
        piir.setCenter(list);
        Label label = new Label(küsimus);
        piir.setTop(label);
        Scene stseen1 = new Scene(piir, 300, 150, Color.SNOW);
        kusimus.setTitle("Küsimused");
        kusimus.setResizable(false);
        kusimus.setScene(stseen1);
        kusimus.show();
    }

    private void kuvaTulemus() {
        FlowPane pane = new FlowPane(10, 10);
        Stage kusimus = new Stage();
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        Label label = new Label("Stabiilne: "+failihaldur.tagastabVäärtust("A.txt")+"%  "  +
                "Analüüsiv: "+failihaldur.tagastabVäärtust("B.txt") +"%  " +
                "Domineeriv: "+failihaldur.tagastabVäärtust("C.txt")+"%  " +
                "Sotsiaalne: "+failihaldur.tagastabVäärtust("D.txt")+"%  " );
        vBox.getChildren().addAll(label, pane);
        Scene stseen2 = new Scene(vBox);
        kusimus.setScene(stseen2);
        kusimus.show();
    }

}

