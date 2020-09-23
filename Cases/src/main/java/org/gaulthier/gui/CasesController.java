package org.gaulthier.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class CasesController {
    public TitledPane choicePane;
    public CheckBox backgroundCheck;
    public CheckBox caseCheck;
    public CheckBox textCheck;
    public TitledPane backgroundPane;
    public RadioButton backgroundColorRed;
    public RadioButton backgroundColorGreen;
    public RadioButton backgrounColorBlue;
    public TitledPane textPane;
    public RadioButton textColorRed;
    public RadioButton textColorWhite;
    public RadioButton textColorBlack;
    public TitledPane casePane;
    public RadioButton lowercase;
    public RadioButton uppercase;
    public TextField input;
    public Label textDisplay;

    public void textTyped(KeyEvent keyEvent) { // si le champs est vide ou contient juste un espace, le panneau des choix ne s'active pas
        if (!input.getText().equals("") && !input.getText().equals(" ")) { // structure 'if' pourrait être simplifié
            choicePane.setDisable(false);
            textDisplay.setText(input.getText());
        } else {
            choicePane.setDisable(true); // désactive le panneaux des choix si le champs est vidé et réinitialise le label
            textDisplay.setText("");
        }
    }


    public void choiceChecked(ActionEvent actionEvent) {

        if (backgroundCheck.isSelected()) {
            backgroundPane.setDisable(false);
        } else {
            backgroundPane.setDisable(true);
        }

        if (textCheck.isSelected()) {
            textPane.setDisable(false);
        } else {
            textPane.setDisable(true);
        }

        if (caseCheck.isSelected()) {
            casePane.setDisable(false);
        } else {
            casePane.setDisable(true);
        }


    }

    public void colorChecked(ActionEvent actionEvent) {

        if (backgroundColorRed.isSelected()) {
            textDisplay.setStyle("-fx-background-color: red;");
        } else if (backgroundColorGreen.isSelected()) {
            textDisplay.setStyle("-fx-background-color: green;");
        } else if (backgrounColorBlue.isSelected()){
            textDisplay.setStyle("-fx-background-color: blue;");
        }


    }

    public void textChecked(ActionEvent actionEvent) {
    }

    public void caseChecked(ActionEvent actionEvent) {
    }
}
