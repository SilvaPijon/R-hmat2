package projekt;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Meetod extends Application {
    @Override
    public void start(Stage peaLava) throws Exception {
        Stage kusimus = new Stage();
        // küsimuse ja nupu loomine
        Label label = new Label("Tere tulemast mängu isiksusetest! Kui oled valmis mängu alustama, vajuta nupule edasi!");
        Button okButton = new Button("EDASI");

        // sündmuse lisamine nupule Tubli
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText("Tubli! \n" +
                        "\n Järgnevalt kuvatakse sulle kümme küsimust, millele pead vastama valikvastustena, kas a,b,c või d");
            label.setAlignment(Pos.CENTER);

            }
        });

        // nuppude grupeerimine
        GridPane gridPane = new GridPane();
        for (int i = 0; i<5; i++)
            gridPane.getColumnConstraints().addAll(new ColumnConstraints(65));
        for (int i = 0; i<5; i++)
            gridPane.getRowConstraints().addAll(new RowConstraints(32));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.getChildren().addAll(okButton); //cancelButton);

        // küsimuse ja nuppude gruppi paigutamine
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label, gridPane);

        //stseeni loomine ja näitamine
        Scene stseen2 = new Scene(vBox);
        gridPane.getChildren().addAll(label);
        kusimus.setScene(stseen2);
        kusimus.show();
    }
}
