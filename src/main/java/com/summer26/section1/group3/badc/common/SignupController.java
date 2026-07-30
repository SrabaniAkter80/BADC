package com.summer26.section1.group3.badc.common;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignupController
{
    @javafx.fxml.FXML
    private TextField password;
    @javafx.fxml.FXML
    private ComboBox<String> role;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextField confirmpassword;
    @javafx.fxml.FXML
    private TextField username;

    @javafx.fxml.FXML
    public void initialize() {
        role.getItems().addAll("HR Manager", "Procurement Officer", "Account Officer", "Warehouse & Inventory Officer", "Field Officer","Admin","Transport & Logistic Manager","Supplier","Dealer","Farmer");
    }

    @javafx.fxml.FXML
    public void loginlink(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void signup(ActionEvent actionEvent) {
    }
}