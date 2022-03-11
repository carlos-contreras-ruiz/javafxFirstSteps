package com.github.carloscontrerasruiz.fxfirststeps;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onActionTextField(){
        System.out.println("Algo "+textField.getText());
        welcomeText.setText(textField.getText());
    }
}