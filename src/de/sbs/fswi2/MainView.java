package de.sbs.fswi2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 1. Schritt, um FXML Datei bereitzustellen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("./mainview.fxml"));

        // 2. Schritt: Root-Objekt-Typ der GUI setzen
        loader.setRoot(new BorderPane());

        // 3. Schritt: rootNode erzeugen
        Parent rootNode = loader.load();

        // 4. Schritt: Scene erzeugen
        Scene scene = new Scene(rootNode);

        // 5. Schritt: Scene und Stage verbinden
        primaryStage.setScene(scene);

        // 6. Schritt: Stage anzeigen
        primaryStage.show();
    }
}
