package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class G0_TML_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void warehousetransport(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G4_TLM_WarehouseTransport.fxml");
    }

    @javafx.fxml.FXML
    public void issuemanagement(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G6_TLM_IssueManagement.fxml");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void records(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G7_TLM_LogisticRecords.fxml");
    }

    @javafx.fxml.FXML
    public void assignment(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G2_TLM_TransportAssignment.fxml");
    }

    @javafx.fxml.FXML
    public void report(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G8_TLM_PerformanceReport.fxml");
    }

    @javafx.fxml.FXML
    public void scheduling(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G1_TLM_TransportScheduling.fxml");
    }

    @javafx.fxml.FXML
    public void trackshipment(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G3_TLM_TrackShipment.fxml");
    }

    @javafx.fxml.FXML
    public void fuelcostmonitoring(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G5_TLM_FuelCostMonitoring.fxml");
    }
}