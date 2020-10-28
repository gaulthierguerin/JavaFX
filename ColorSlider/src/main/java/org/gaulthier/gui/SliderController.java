package org.gaulthier.gui;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class SliderController {
    public Slider sliderRed;
    public Slider sliderGreen;
    public Slider sliderBlue;
    public Label redLabel;
    public Label greenLabel;
    public Label blueLabel;
    public Label colorResult;
    public double redValue;
    public double greenValue;
    public double blueValue;



    public void initialize() {

        redLabel.setStyle("-fx-background-color : red");
        greenLabel.setStyle("-fx-background-color : green");
        blueLabel.setStyle("-fx-background-color : blue");
        colorResult.setStyle("-fx-background-color : black");

    }

    public void colorChange(MouseEvent mouseEvent) {

        redValue = sliderRed.getValue();
        greenValue = sliderGreen.getValue();
        blueValue = sliderBlue.getValue();

        colorResult.setStyle("-fx-background-color: rgb("+(int)redValue+","+(int)greenValue+","+(int)blueValue+")");

    }
}
