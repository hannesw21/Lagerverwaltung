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
    private DataAccessObject dao = new DataAccessObject();
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
    @FXML 
    Label lblAnzahlDaten;

    @Override
    public void initialize(URL location, ResourceBundle resources) {  
        lblDatum.setText(new java.text.SimpleDateFormat("dd.MM.yyyy").format(new java.util.Date())); 
        lblAnzahlDaten.setText(String.valueOf(dao.getAll().size()));
        //setAnzahlDaten();
        
    }

    private void setAnzahlDaten(){
        Thread getDataThread = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dao.getAll();
        });
        getDataThread.start();

    }


    private Stage primaryStage;
    public void setStage (Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Beispielfenster");
    }


}