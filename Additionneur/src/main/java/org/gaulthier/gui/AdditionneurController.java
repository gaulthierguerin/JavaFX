package org.gaulthier.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class AdditionneurController {

    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public TextArea display;
    public int result;


    public void add(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        display.appendText("+" + btn.getText());
        result += Integer.parseInt(btn.getText());
    }

    public void clear(ActionEvent actionEvent) {
        display.clear();
        result = 0;
    }

    public void calc(ActionEvent actionEvent) {
        display.setText("" + result);
    }
}

