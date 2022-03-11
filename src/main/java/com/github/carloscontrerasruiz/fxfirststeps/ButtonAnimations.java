package com.github.carloscontrerasruiz.fxfirststeps;

import com.github.carloscontrerasruiz.fxfirststeps.handlers.ButtonsAnimation;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAnimations extends Application {

    private Button rotateBtn;
    private Button blurBtn;
    private Button scaleBtn;


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Life Cycle");
        FlowPane flowPane = new FlowPane(5, 5);
        flowPane.setAlignment(Pos.CENTER);

        rotateBtn = new Button("Rotate");
        blurBtn = new Button("Blur off");
        scaleBtn = new Button("Scale");

        ButtonsAnimation btnAnimation = new ButtonsAnimation(
                rotateBtn, blurBtn, scaleBtn
        );
        rotateBtn.setOnAction(btnAnimation);
        blurBtn.setOnAction(btnAnimation);
        scaleBtn.setOnAction(btnAnimation);


        Label reflect = new Label("Reflection Adds Visual Sparkle");

        flowPane.getChildren().addAll(rotateBtn, blurBtn, scaleBtn, reflect);

        Scene scene = new Scene(flowPane, 250, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
