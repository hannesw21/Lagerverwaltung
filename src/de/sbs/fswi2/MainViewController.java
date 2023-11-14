package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import de.sbs.fswi2.dao.DataAccessObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
    private DataAccessObject accessObject = new DataAccessObject();
	@FXML
	private void beenden(ActionEvent arg0) {
		System.exit(0);
    }
    @FXML
    private void addTabAdd(ActionEvent event){
        setAnzahlDaten();
    }

    @FXML
    private Label lblDatum;

    @Override
    public void initialize(URL location, ResourceBundle resources) {  
        lblDatum.setText(new java.text.SimpleDateFormat("dd.MM.yyyy").format(new java.util.Date())); 
        setAnzahlDaten();
    }

    private void setAnzahlDaten(){
        accessObject.getAll();
    }


    private Stage primaryStage;
    public void setStage (Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Beispielfenster");
    }


}