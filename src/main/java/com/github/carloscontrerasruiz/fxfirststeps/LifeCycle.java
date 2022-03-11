package com.github.carloscontrerasruiz.fxfirststeps;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LifeCycle extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Init the app");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Life Cycle");
        final FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPane.setAlignment(Pos.CENTER);
        final Scene scene = new Scene(flowPane, 700, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stopping app");
    }

    public static void main(String[] args) {
        launch();
    }
}
