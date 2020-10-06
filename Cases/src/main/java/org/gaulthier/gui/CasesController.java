package org.gaulthier.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class CasesController {
    public TitledPane choicePane;
    public CheckBox backgroundCheck;
    public CheckBox caseCheck;
    public CheckBox textCheck;
    public TitledPane backgroundPane;
    public RadioButton backgroundColorRed;
    public RadioButton backgroundColorGreen;
    public RadioButton backgroundColorBlue;
    public TitledPane textPane;
    public RadioButton textColorRed;
    public RadioButton textColorWhite;
    public RadioButton textColorBlack;
    public TitledPane casePane;
    public RadioButton lowercase;
    public RadioButton uppercase;
    public TextField input;
    public Label textDisplay;
    public ToggleGroup Texte;
    public ToggleGroup Fond;
    public ToggleGroup Casse;

    public void textTyped(KeyEvent keyEvent) { // si le champs est vide ou contient juste un espace, le panneau des choix ne s'active pas
        if (!input.getText().equals("") && !input.getText().equals(" ")) { // structure 'if' pourrait être simplifié
            choicePane.setDisable(false);
            textDisplay.setText(input.getText());
        } else {
            choicePane.setDisable(true); // désactive le panneaux des choix si le champs est vidé et réinitialise le label
            textDisplay.setText("");
            textDisplay.setStyle("-fx-background-color: none;");

        }
    }


    public void choiceChecked(ActionEvent actionEvent) {

        if (backgroundCheck.isSelected()) {
            backgroundPane.setDisable(false);
        } else {
            backgroundPane.setDisable(true);
            backgroundColorBlue.setSelected(false);
            backgroundColorGreen.setSelected(false);
            backgroundColorRed.setSelected(false);
            textDisplay.setStyle("-fx-background-color: none;");
        }

        if (textCheck.isSelected()) {
            textPane.setDisable(false);
        } else {
            textPane.setDisable(true);
            textColorWhite.setSelected(false);
            textColorBlack.setSelected(false);
            textColorRed.setSelected(false);
            textDisplay.setTextFill(Color.web("black"));
        }

        if (caseCheck.isSelected()) {
            casePane.setDisable(false);
        } else {
            casePane.setDisable(true);
            lowercase.setSelected(false);
            uppercase.setSelected(false);
            textDisplay.setText(input.getText());
        }


    }

    public void colorChecked(ActionEvent actionEvent) {

        if (backgroundColorRed.isSelected()) {
            textDisplay.setStyle("-fx-background-color: red;");
        } else if (backgroundColorGreen.isSelected()) {
            textDisplay.setStyle("-fx-background-color: green;");
        } else if (backgroundColorBlue.isSelected()){
            textDisplay.setStyle("-fx-background-color: blue;");
        }


    }

    public void textChecked(ActionEvent actionEvent) {

        if (textColorRed.isSelected()) {
            textDisplay.setTextFill(Color.web("red"));
        } else if (textColorBlack.isSelected()) {
            textDisplay.setTextFill(Color.web("black"));
        } else if (textColorWhite.isSelected()) {
            textDisplay.setTextFill(Color.web("white"));
        }
    }

    public void caseChecked(ActionEvent actionEvent) {

        if (lowercase.isSelected()) {
            textDisplay.setText(input.getText().toLowerCase());
        } else if (uppercase.isSelected()) {
            textDisplay.setText(input.getText().toUpperCase());
        }
    }
}
