package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainViewController implements Initializable {


	@FXML
	private void beenden(ActionEvent arg0) {
		System.exit(0);
    }
    @FXML
    private void addTabAdd(ActionEvent event){
    }

    @FXML
    private Label lblDatum;

    @Override
    public void initialize(URL location, ResourceBundle resources) {  
        lblDatum.setText("Hallo"); 
    }
}