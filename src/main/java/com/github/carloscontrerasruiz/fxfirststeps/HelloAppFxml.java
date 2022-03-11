package com.github.carloscontrerasruiz.fxfirststeps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloAppFxml extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final Parent pane = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Hello Scene builder");
        stage.setScene(new Scene(pane,400,700));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
