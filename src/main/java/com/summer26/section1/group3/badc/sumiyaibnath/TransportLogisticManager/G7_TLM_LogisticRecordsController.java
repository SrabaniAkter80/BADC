package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G7_TLM_LogisticRecordsController
{
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colvehicle;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coldriver;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> coldispatchdate;
    @javafx.fxml.FXML
    private DatePicker dispatchdate;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private ComboBox<String> status;

    @javafx.fxml.FXML
    public void initialize() {
        status.getItems().addAll("Dispatched", "In Transit", "Delivered");

        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colvehicle.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        coldriver.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        coldispatchdate.setCellValueFactory(new PropertyValueFactory<>("dispatchDate"));

        refreshTable();
    }

    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
        tableview.getItems().clear();
        for (Transport transport : TransportManager.getTransportList()) {
            if (!TransportManager.canTrackShipment(transport.getTransportId())) {
                continue;
            }
            boolean transportMatch =
                    transportid.getText().isEmpty() ||
                            transport.getTransportId().equalsIgnoreCase(transportid.getText());
            boolean statusMatch =
                    status.getValue() == null ||
                            transport.getStatus().equalsIgnoreCase(status.getValue());
            boolean dateMatch =
                    dispatchdate.getValue() == null ||
                            transport.getDispatchDate().equals(dispatchdate.getValue());
            if (transportMatch && statusMatch && dateMatch) {
                tableview.getItems().add(transport);
            }
        }
        transportid.clear();
        status.setValue(null);
        dispatchdate.setValue(null);
        label.setText("Filter applied.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {
        refreshTable();
        label.setText("Records refreshed.");

    }

    private void refreshTable() {
        tableview.getItems().clear();
        for (Transport transport : TransportManager.getTransportList()) {
            if (TransportManager.canTrackShipment(transport.getTransportId())) {
                tableview.getItems().add(transport);
            }
        }
    }
}