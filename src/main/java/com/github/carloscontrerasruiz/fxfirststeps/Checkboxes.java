package com.github.carloscontrerasruiz.fxfirststeps;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Checkboxes extends Application implements EventHandler {

    CheckBox bananaCB = new CheckBox("Banana");
    CheckBox mangoCB = new CheckBox("Mango");
    CheckBox papayaCB = new CheckBox("Papaya");
    CheckBox grapefruitCB = new CheckBox("Grapefruit");
    Label response = new Label("sdss");

    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Favorite Fruit");
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPane.setAlignment(Pos.CENTER);

        Label title = new Label("What fruits do you like?");

        Label selected = new Label("");



        bananaCB.setOnAction((actionEvent) -> {
            System.out.println("Banana");
        });

        flowPane.getChildren().add(title);
        flowPane.getChildren().addAll(bananaCB, mangoCB, papayaCB, grapefruitCB);
        flowPane.getChildren().add(response);

        Scene scene = new Scene(flowPane, 250, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(Event event) {
        response.setText("xdfdfdf");
        Object friutChecked = event.getSource();
        if (bananaCB.equals(friutChecked)){
            response.setText(
                    bananaCB.isSelected()?
                            "Banana Selected":
                            "Banana NOT Selected"
            );
        }
    }
}
