package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G3_TLM_TrackShipmentController
{
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colfarm;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colwarehouse;
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> coldispatcheddate;
    @javafx.fxml.FXML
    private ComboBox<String> status;

    private Transport selectedTransport;

    @javafx.fxml.FXML
    public void initialize() {
        status.getItems().addAll("In Transit", "Delivered");

        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colwarehouse.setCellValueFactory(new PropertyValueFactory<>("warehouse"));
        colfarm.setCellValueFactory(new PropertyValueFactory<>("farm"));
        coldispatcheddate.setCellValueFactory(new PropertyValueFactory<>("dispatchDate"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        if (selectedTransport == null) {
            label.setText("Track a shipment first.");
            return;
        }
        if (status.getValue() == null) {
            label.setText("Select a status.");
            return;
        }
        selectedTransport.setStatus(status.getValue());
        TransportManager.updateTransport();
        tableview.refresh();
        label.setText("Shipment status updated successfully.");
        transportid.clear();
        status.setValue(null);
        selectedTransport = null;
    }

    @javafx.fxml.FXML
    public void trackshipment(ActionEvent actionEvent) {
        if (transportid.getText().trim().isEmpty()) {
            label.setText("Enter Transport ID.");
            return;
        }

        selectedTransport = TransportManager.findTransport(transportid.getText());

        if (selectedTransport == null) {
            label.setText("Transport ID not found.");
            return;
        }

        if (!TransportManager.canTrackShipment(transportid.getText())) {
            label.setText("Transport has not been dispatched yet.");
            selectedTransport = null;
            return;
        }

        tableview.getItems().clear();
        tableview.getItems().add(selectedTransport);
        label.setText("Shipment found.");
    }
}