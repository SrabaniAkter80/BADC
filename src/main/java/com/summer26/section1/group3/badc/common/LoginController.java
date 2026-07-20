package com.summer26.section1.group3.badc.common;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField passwordlogin;
    @javafx.fxml.FXML
    private TextField usernamelogin;
    @javafx.fxml.FXML
    private ComboBox<String> rolelogin;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        rolelogin.getItems().addAll("HR Manager", "Procurement Officer", "Account Officer", "Warehouse & Inventory Officer", "Field Officer","Admin","Transport & Logistic Manager","Supplier","Dealer","Farmer");
    }

    @javafx.fxml.FXML
    public void signuplink(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void login(ActionEvent actionEvent) {
        String username = usernamelogin.getText();
        String password = passwordlogin.getText();

        List<User> userList = UserManager.getUserList();

        for(User u : userList) {
            if (username.equals(u.getUsername())
                    && password.equals(u.getPassword())) {
                label.setText("Log in successful");

                //SceneSwitcher.switchTo("user-admin.fxml");
                return;
            }
        }

        label.setText("Invalid username or password");
    }
}