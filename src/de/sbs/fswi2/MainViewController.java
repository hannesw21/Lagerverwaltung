package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainViewController implements Initializable {


	@FXML
	private void beenden(ActionEvent arg0) {
		Platform.exit();
}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}