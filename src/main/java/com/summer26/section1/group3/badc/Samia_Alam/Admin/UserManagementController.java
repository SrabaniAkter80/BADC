package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManagementController {

    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private ComboBox<String> userroleCB;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> usernameTV;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> emailTV;
    @javafx.fxml.FXML
    private TextField fullnameTF;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> fullnameTV;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private TextField contactnumberTF;
    @javafx.fxml.FXML
    private TableView<UserManagement> tableview;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> contactTV;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> roleTV;

    File file = new File("user.bin");

    @javafx.fxml.FXML
    public void initialize() {
        userroleCB.getItems().addAll(
                "Admin",
                "Accountant",
                "Field Officer",
                "Dealer",
                "Farmer"
        );

        fullnameTV.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        usernameTV.setCellValueFactory(new PropertyValueFactory<>("username"));
        roleTV.setCellValueFactory(new PropertyValueFactory<>("role"));
        contactTV.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        emailTV.setCellValueFactory(new PropertyValueFactory<>("email"));

        loadTableData();
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        fullnameTF.clear();
        usernameTF.clear();
        passwordTF.clear();
        contactnumberTF.clear();
        emailTF.clear();
        userroleCB.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void createuserButton(ActionEvent actionEvent) {
        if (fullnameTF.getText().trim().isEmpty() ||
                usernameTF.getText().trim().isEmpty() ||
                passwordTF.getText().trim().isEmpty() ||
                userroleCB.getValue() == null ||
                contactnumberTF.getText().trim().isEmpty() ||
                emailTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }

        UserManagement user = new UserManagement(
                fullnameTF.getText().trim(),
                usernameTF.getText().trim(),
                passwordTF.getText().trim(),
                userroleCB.getValue(),
                contactnumberTF.getText().trim(),
                emailTF.getText().trim()
        );

        saveUser(user);
        loadTableData();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("User created successfully.");
        alert.showAndWait();

        clearButton(actionEvent);
    }

    private void saveUser(UserManagement newUser) {

        List<UserManagement> userList = loadAllUsers();
        userList.add(newUser);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            for (UserManagement u : userList) {
                oos.writeObject(u);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<UserManagement> loadAllUsers() {

        List<UserManagement> userList = new ArrayList<>();

        if (!file.exists()) {
            return userList;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                UserManagement u = (UserManagement) ois.readObject();
                userList.add(u);
            }

        } catch (EOFException e) {
            // End of File, expected

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userList;
    }

    private void loadTableData() {
        tableview.getItems().clear();
        tableview.getItems().addAll(loadAllUsers());
    }
}