package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G4_TLM_WarehouseTransportController
{
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colfarm;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colwarehouse;
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private TextField farm;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TextField warehouse;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> coldispatcheddate;
    @javafx.fxml.FXML
    private DatePicker dispatcheddate;
    @javafx.fxml.FXML
    private TextField status;

    private Transport selectedTransport;

    @javafx.fxml.FXML
    public void initialize() {

        status.setText("Dispatched");

        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colwarehouse.setCellValueFactory(new PropertyValueFactory<>("warehouse"));
        colfarm.setCellValueFactory(new PropertyValueFactory<>("farm"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        coldispatcheddate.setCellValueFactory(new PropertyValueFactory<>("dispatchDate"));

        for (Transport transport : TransportManager.getTransportList()) {
            if ("Dispatched".equalsIgnoreCase(transport.getStatus())) {
                tableview.getItems().add(transport);
            }
        }
    }


    @javafx.fxml.FXML
    public void confirm(ActionEvent event) {

        if (selectedTransport == null) {
            label.setText("Search for a valid Transport ID first.");
            return;
        }
        if (warehouse.getText().trim().isEmpty()
                || farm.getText().trim().isEmpty()
                || dispatcheddate.getValue() == null) {

            label.setText("Please fill up all the fields.");
            return;
        }

        selectedTransport.setWarehouse(warehouse.getText());
        selectedTransport.setFarm(farm.getText());
        selectedTransport.setDispatchDate(dispatcheddate.getValue());
        selectedTransport.setStatus("Dispatched");

        TransportManager.updateTransport();
        tableview.getItems().add(selectedTransport);

        transportid.clear();
        warehouse.clear();
        farm.clear();
        dispatcheddate.setValue(null);
        status.setText("Dispatched");
        selectedTransport = null;

        label.setText("Transport dispatched successfully.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void search(ActionEvent event) {

        if (transportid.getText().trim().isEmpty()) {
            label.setText("Enter Transport ID.");
            return;
        }
        selectedTransport = TransportManager.findTransport(transportid.getText());

        if (selectedTransport == null) {
            label.setText("Transport ID not found.");
            return;
        }
        if (TransportManager.isDispatched(transportid.getText())) {
            label.setText("Transport has already been dispatched.");
            selectedTransport = null;
            return;
        }
        if (!TransportManager.isAssigned(transportid.getText())) {
            label.setText("Transport is not available for dispatch.");
            selectedTransport = null;
            return;
        }
        label.setText("Transport found. Enter warehouse and farm details.");
    }
}