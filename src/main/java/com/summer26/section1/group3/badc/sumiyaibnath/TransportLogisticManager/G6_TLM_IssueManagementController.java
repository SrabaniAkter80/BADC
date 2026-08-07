package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class G6_TLM_IssueManagementController
{
    @javafx.fxml.FXML
    private ComboBox<String> issuetype;
    @javafx.fxml.FXML
    private TextField transportid;
    @javafx.fxml.FXML
    private TableColumn<TransportIssue, String> colissuetype;
    @javafx.fxml.FXML
    private TableView<TransportIssue> tableview;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<TransportIssue, String> coltransportid;
    @javafx.fxml.FXML
    private TableColumn<TransportIssue, LocalDate> colreporteddate;
    @javafx.fxml.FXML
    private TextField issueid;
    @javafx.fxml.FXML
    private TableColumn<TransportIssue, String> colissuestatus;
    @javafx.fxml.FXML
    private DatePicker reporteddate;
    @javafx.fxml.FXML
    private TableColumn<TransportIssue, String> colissueid;
    @javafx.fxml.FXML
    private ComboBox<String> issuestatus;

    private TransportIssue selectedIssue;

    @javafx.fxml.FXML
    public void initialize() {
        issuetype.getItems().addAll("Vehicle Breakdown", "Fuel Leakage", "Engine Failure", "Accident", "Flat Tire", "Late Delivery");

        issuestatus.getItems().addAll("Pending", "In Progress", "Resolved");

        colissueid.setCellValueFactory(new PropertyValueFactory<>("issueId"));
        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colissuetype.setCellValueFactory(new PropertyValueFactory<>("issueType"));
        colissuestatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colreporteddate.setCellValueFactory(new PropertyValueFactory<>("reportedDate"));

        tableview.getItems().addAll(TransportIssueManager.getIssueList());

        tableview.getSelectionModel().selectedItemProperty().addListener((obs, oldIssue, newIssue) -> {

            if (newIssue != null) {
                selectedIssue = newIssue;

                issueid.setText(newIssue.getIssueId());
                transportid.setText(newIssue.getTransportId());
                issuetype.setValue(newIssue.getIssueType());
                issuestatus.setValue(newIssue.getStatus());
                reporteddate.setValue(newIssue.getReportedDate());
            }

        });
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        if (selectedIssue == null) {
            label.setText("Select an issue from the table.");
            return;
        }
        if (issuestatus.getValue() == null) {
            label.setText("Select issue status.");
            return;
        }
        selectedIssue.setStatus(issuestatus.getValue());
        TransportIssueManager.updateIssues();
        tableview.refresh();
        clearFields();
        selectedIssue = null;
        label.setText("Issue status updated successfully.");
    }

    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        if (transportid.getText().trim().isEmpty()) {
            label.setText("Enter Transport ID.");
            return;
        }
        if (!TransportManager.canTrackShipment(transportid.getText())) {
            label.setText("Transport has not been dispatched.");
            return;
        }
        tableview.getItems().clear();
        tableview.getItems().addAll(
                TransportIssueManager.getIssuesByTransport(transportid.getText())
        );

        label.setText("Transport found.");
    }

    @javafx.fxml.FXML
    public void report(ActionEvent actionEvent) {
        if (issueid.getText().trim().isEmpty()
                || transportid.getText().trim().isEmpty()
                || issuetype.getValue() == null
                || issuestatus.getValue() == null
                || reporteddate.getValue() == null) {
            label.setText("Please fill up all the fields.");
            return;
        }
        TransportIssue issue = new TransportIssue(
                issueid.getText(),
                transportid.getText(),
                issuetype.getValue(),
                "",
                issuestatus.getValue(),
                reporteddate.getValue()
        );

        TransportIssueManager.addIssue(issue);
        tableview.getItems().clear();
        tableview.getItems().addAll(TransportIssueManager.getIssueList());
        clearFields();
        label.setText("Issue reported successfully.");
    }

    private void clearFields() {
        issueid.clear();
        transportid.clear();
        issuetype.setValue(null);
        issuestatus.setValue(null);
        reporteddate.setValue(null);
    }
}