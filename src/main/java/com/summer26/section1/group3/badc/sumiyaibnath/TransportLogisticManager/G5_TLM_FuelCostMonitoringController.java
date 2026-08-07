package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G5_TLM_FuelCostMonitoringController
{
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private TableView<FuelRecord> tableview;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, String> coltransportid;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, Double> coldistance;
    @javafx.fxml.FXML
    private TextField distance;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, String> colrecordid;
    @javafx.fxml.FXML
    private TextField fuelcost;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private DatePicker recorddate;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, Double> colfuelcost;
    @javafx.fxml.FXML
    private TextField recordid;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, Double> colmaintenancecost;
    @javafx.fxml.FXML
    private TextField maintenancecost;
    @javafx.fxml.FXML
    private TableColumn<FuelRecord, LocalDate> coldate;

    @javafx.fxml.FXML
    public void initialize() {
        colrecordid.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colfuelcost.setCellValueFactory(new PropertyValueFactory<>("fuelCost"));
        colmaintenancecost.setCellValueFactory(new PropertyValueFactory<>("maintenanceCost"));
        coldistance.setCellValueFactory(new PropertyValueFactory<>("distanceTravelled"));
        coldate.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableview.getItems().addAll(FuelRecordManager.getFuelRecordList());
    }

    @javafx.fxml.FXML
    public void search(ActionEvent event) {
        if (transportid.getText().trim().isEmpty()) {
            label.setText("Enter Transport ID.");
            return;
        }
        if (!TransportManager.canTrackShipment(transportid.getText())) {
            label.setText("Transport has not been dispatched.");
            return;
        }
        tableview.getItems().clear();
        tableview.getItems().addAll(FuelRecordManager.getRecordsByTransport(transportid.getText()));
        label.setText("Transport found.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void save(ActionEvent event) {
        if (recordid.getText().trim().isEmpty()
                || fuelcost.getText().trim().isEmpty()
                || maintenancecost.getText().trim().isEmpty()
                || distance.getText().trim().isEmpty()
                || recorddate.getValue() == null) {
            label.setText("Please fill up all the fields.");
            return;
        }
        if (!TransportManager.canTrackShipment(transportid.getText())) {
            label.setText("Search and select a valid Transport ID first.");
            return;
        }
        try {
            FuelRecord record = new FuelRecord(
                    recordid.getText(),
                    transportid.getText(),
                    Double.parseDouble(fuelcost.getText()),
                    Double.parseDouble(maintenancecost.getText()),
                    Double.parseDouble(distance.getText()),
                    recorddate.getValue()
            );
            FuelRecordManager.addFuelRecord(record);
            tableview.getItems().clear();
            tableview.getItems().addAll(FuelRecordManager.getFuelRecordList());
            recordid.clear();
            fuelcost.clear();
            maintenancecost.clear();
            distance.clear();
            recorddate.setValue(null);
            label.setText("Fuel record saved successfully.");
        } catch (NumberFormatException e) {
            label.setText("Fuel Cost, Maintenance Cost and Distance must be numbers.");
        }
    }
}