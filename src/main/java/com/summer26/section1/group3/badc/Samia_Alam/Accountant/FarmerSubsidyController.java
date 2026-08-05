package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class FarmerSubsidyController
{
    @javafx.fxml.FXML
    private TableColumn <FarmerSubsidy, String> nameTableCol;
    @javafx.fxml.FXML
    private TableView <FarmerSubsidy> farmerSubsidyTableView;
    @javafx.fxml.FXML
    private TableColumn <FarmerSubsidy, String> farmerIdTableCol;
    @javafx.fxml.FXML
    private TableColumn <FarmerSubsidy, String> landAreaTableCol;
    @javafx.fxml.FXML
    private TextField subsidyAmountTF;

    @javafx.fxml.FXML
    public void initialize() {
        farmerIdTableCol.setCellValueFactory(new PropertyValueFactory<>("farmerId"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        landAreaTableCol.setCellValueFactory(new PropertyValueFactory<>("landArea"));
    }

    @javafx.fxml.FXML
    public void disburseButton(ActionEvent actionEvent) {
        if (farmerSubsidyTableView.getSelectionModel().getSelectedItem() == null ||
                subsidyAmountTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a farmer and enter subsidy amount.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Subsidy disbursed successfully.");
        alert.showAndWait();

        subsidyAmountTF.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }
}