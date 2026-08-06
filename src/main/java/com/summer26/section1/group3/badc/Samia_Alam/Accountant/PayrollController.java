package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class PayrollController
{
    @javafx.fxml.FXML
    private TableColumn <Payroll, String> nameTableCol;
    @javafx.fxml.FXML
    private TableColumn <Payroll, Double> salaryTableCol;
    @javafx.fxml.FXML
    private TableView <Payroll> payrollTableView;
    @javafx.fxml.FXML
    private TableColumn <Payroll, String> staffTableCol;
    @javafx.fxml.FXML
    private ComboBox <String> monthComboBox;
    @javafx.fxml.FXML
    private TableColumn <Payroll, String> deptTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        monthComboBox.getItems().addAll(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );

        staffTableCol.setCellValueFactory(new PropertyValueFactory<>("staffId"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        deptTableCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        salaryTableCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        // TODO: এখানে ডাটাবেস থেকে actual ডেটা লোড করবে
        ObservableList<Payroll> staffList = FXCollections.observableArrayList(
                new Payroll("S001", "Nusrat Jahan", "Finance", 45000.0),
                new Payroll("S002", "Tanvir Ahmed", "HR", 38000.0),
                new Payroll("S003", "Mahmudul Hasan", "Accounts", 42000.0)
        );
        payrollTableView.setItems(staffList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void executePayrollButton(ActionEvent actionEvent) {

        if (monthComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a month.");
            alert.showAndWait();
            return;
        }

        if (payrollTableView.getSelectionModel().getSelectedItem() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select an employee.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Payroll executed successfully.");
        alert.showAndWait();
    }
}