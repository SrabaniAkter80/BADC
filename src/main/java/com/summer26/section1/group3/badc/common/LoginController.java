package com.summer26.section1.group3.badc.common;

import com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager.G0_TML_DashboardController;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
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
    public void signuplink(ActionEvent ActionEvent ) throws IOException {
        SceneSwitcher.switchTo("signup.fxml");
    }

    @javafx.fxml.FXML
    public void login(ActionEvent actionEvent) throws IOException {
        String username = usernamelogin.getText();
        String password = passwordlogin.getText();
        String role = rolelogin.getValue();

        if (role == null) {
            label.setText("Please select a role.");
            return;
        }

        List<User> userList = UserManager.getUserList();

        for (User user : userList) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)
                    && user.getRole().equals(role)) {
                System.out.println("Login successful!");
                System.out.println("Role = " + role);
                switch (role) {
                    case "Admin":
                        SceneSwitcher.switchTo("adminDashboard.fxml");
                        break;
                    case "HR Manager":
                        SceneSwitcher.switchTo("G0_HR Manager_Dashboard.fxml");
                        break;
                    case "Procurement Officer":
                        System.out.println("Opening Procurement Dashboard...");
                        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
                        break;
                    case "Account Officer":
                        SceneSwitcher.switchTo("accountOfficerDashboard.fxml");
                        break;
                    case "Warehouse & Inventory Officer":
                        SceneSwitcher.switchTo("warehouseDashboard.fxml");
                        break;
                    case "Field Officer":
                        SceneSwitcher.switchTo("fieldOfficerDashboard.fxml");
                        break;
                    case "Transport & Logistic Manager":
                        System.out.println("Opening Transport & Logistic Manager Dashboard...");
                        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
                        break;
                    case "Supplier":
                        System.out.println("Opening Supplier Dashboard...");
                        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");
                        break;
                    case "Dealer":
                        SceneSwitcher.switchTo("dealerDashboard.fxml");
                        break;
                    case "Farmer":
                        SceneSwitcher.switchTo("G0_Farmer_Dashboard.fxml");
                        break;
                    default:
                        label.setText("No dashboard found.");
                }
                return;
            }
        }
        label.setText("Invalid username, password or role.");
    }
}