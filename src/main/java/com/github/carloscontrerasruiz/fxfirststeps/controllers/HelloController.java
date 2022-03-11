package com.github.carloscontrerasruiz.fxfirststeps.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    @FXML
    private Button helloBtn;

    @FXML
    private Button raisedBtn;

    @FXML
    private TextField materialTextField;

    @FXML
    protected void onHelloButtonClick() {
        helloBtn.setDisable(true);
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onActionTextField() {
        System.out.println("Algo " + textField.getText());
        helloBtn.setDisable(false);
        welcomeText.setText(textField.getText());
    }

    @FXML
    public void onActionTextMaterial(ActionEvent actionEvent) {
        System.out.println("Desde text material " + materialTextField.getText());
        raisedBtn.setDisable(false);
        welcomeText.setText(materialTextField.getText());
    }

    @FXML
    public void onRaisedBtnAction(ActionEvent actionEvent) {
        raisedBtn.setDisable(true);
        welcomeText.setText("Welcome to JavaFX Application MATERIAL");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Metodo initialize controller");
    }


}