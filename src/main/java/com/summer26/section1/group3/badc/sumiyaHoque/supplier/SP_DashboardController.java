package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class SP_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PaymentNotifications(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G6_PaymentNotifications.fxml");
    }

    @javafx.fxml.FXML
    public void UploadDocuments(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G2_UploadDocuments.fxml");
    }

    @javafx.fxml.FXML
    public void SupplyProposal(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G5_SupplyProposal.fxml");

    }

    @javafx.fxml.FXML
    public void DeliverySchedule(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G4_DeliverySchedule.fxml");
    }

    @javafx.fxml.FXML
    public void SupplyStatus(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G3_SupplyStatus.fxml");
    }

    @javafx.fxml.FXML
    public void LogOut(ActionEvent actionEvent) throws IOException {


    }



    @javafx.fxml.FXML
    public void Contracts(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G7_Contracts.fxml");

    }

    @javafx.fxml.FXML
    public void SupplyReports(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G5_SupplyReports.fxml");
    }

    @javafx.fxml.FXML
    public void editbuttonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G8_editbuttonOnAction.fxml");
    }

    @javafx.fxml.FXML
    public void myprofileOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G8_myprofileOnActio.fxml");
    }
}