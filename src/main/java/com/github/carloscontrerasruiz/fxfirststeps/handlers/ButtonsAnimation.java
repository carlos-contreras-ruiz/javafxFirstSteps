package com.github.carloscontrerasruiz.fxfirststeps.handlers;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;

public class ButtonsAnimation implements EventHandler {

    private Button rotateBtn;
    private Button blurBtn;
    private Button scaleBtn;

    private Rotate rotate;
    private double angle = 0.0;
    private double blurVal = 1.0;
    private BoxBlur blur;
    private double scaleFactor = 0.4;
    private Scale scale;

    public ButtonsAnimation(Button rotateBtn, Button blurBtn, Button scaleBtn) {
        this.rotateBtn = rotateBtn;
        this.blurBtn = blurBtn;
        this.scaleBtn = scaleBtn;

        this.rotate = new Rotate();
        this.blur = new BoxBlur(1.0, 1.0, 1);
        this.scale = new Scale(scaleFactor, scaleFactor);
        //set the transformation
        this.rotateBtn.getTransforms().add(rotate);
        this.scaleBtn.getTransforms().add(scale);
    }

    @Override
    public void handle(Event event) {
        if (event.getSource().equals(rotateBtn)) {
            System.out.println("Rotate button");
            angle += 15.0;
            rotate.setAngle(angle);
            rotate.setPivotX(rotateBtn.getWidth() / 2);
            rotate.setPivotY(rotateBtn.getHeight() / 2);
        }
        if (event.getSource().equals(blurBtn)) {
            System.out.println("Blur button");
            //cada vez que el boton se a presionado el blur cambiara
            if (blurVal == 10.0) {
                blurVal = 1.0;
                blurBtn.setEffect(null);
                blurBtn.setText("Blur off");
            } else {
                blurVal++;
                blurBtn.setEffect(blur);
                blurBtn.setText("Blur on");
            }
            blur.setWidth(blurVal);
            blur.setHeight(blurVal);
        }
        if (event.getSource().equals(scaleBtn)) {
            System.out.println("Scale button");
            scaleFactor += 0.1;
            if (scaleFactor > 2.0) {
                scaleFactor = 0.4;
            }
            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
        }
    }
}
