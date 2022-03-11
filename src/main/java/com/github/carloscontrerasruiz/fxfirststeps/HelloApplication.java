package com.github.carloscontrerasruiz.fxfirststeps;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Label label;
    private TextField txtField;

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        stage.setTitle("Hello JavaFX");
        Button btn = new Button();
        btn.setText("Click me");
        btn.setOnAction((actionEvent) -> {
            System.out.println("Hello from the button");
            this.label.setText(this.txtField.getText());
            btn.setDisable(true);
        });

        label = new Label();
        label.setText("My label");
        this.label.setLabelFor(btn);

        this.txtField = new TextField();
        this.txtField.setPromptText("Hola");


        FlowPane flowRoot = new FlowPane(10, 10);
        flowRoot.setAlignment(Pos.CENTER);
        //StackPane root = new StackPane();

        flowRoot.getChildren().add(label);
        flowRoot.getChildren().add(btn);
        flowRoot.getChildren().add(txtField);

        Scene scene = new Scene(flowRoot, 250, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}