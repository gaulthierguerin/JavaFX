package org.gaulthier.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController {

    @FXML
    private TableView<Client> lst_clients;
    @FXML
    private TableColumn<Client, String> col_prenom;
    @FXML
    private TableColumn<Client, String> col_nom;
    @FXML
    private TableColumn<Client, String> col_ville;
    public TextField txt_prenom;
    public TextField txt_ville;
    public TextField txt_nom;
    public Button btn_save;
    public Button btn_cancel;
    public Button btn_delete;


    ObservableList<Client> model = FXCollections.observableArrayList();

    public void initialize() {
        //initialisation du modèle
        model.add(new Client("Josh", "Homme", "Joshua Tree"));
        model.add(new Client("Dave", "Grohl", "Warren"));
        model.add(new Client("Krist", "Novoselic", "Compton"));
        model.add(new Client("Robert", "Trujilo", "Joshua Tree"));

        //On rend le tableau non-éditable
        lst_clients.setEditable(false);

        //Jonction du tableau avec les données
        col_prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        col_nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        col_ville.setCellValueFactory(new PropertyValueFactory<>("ville"));

        //On indique au TableauView quel modèle observer pour trouver les données
        lst_clients.setItems(model);

    }

    @FXML
    public void sauver(MouseEvent mouseEvent) {
        model.add(new Client(txt_prenom.getText(),txt_nom.getText(), txt_ville.getText()));
        txt_nom.clear();
        txt_prenom.clear();
        txt_ville.clear();
    }

    @FXML
    public void annuler(MouseEvent mouseEvent) {
        txt_nom.clear();
        txt_prenom.clear();
        txt_ville.clear();
    }

    @FXML
    public void supprimer(MouseEvent mouseEvent) {

        int indexToDelete;

        indexToDelete = lst_clients.getSelectionModel().getSelectedIndex();

        lst_clients.getItems().remove(indexToDelete);
    }
}


