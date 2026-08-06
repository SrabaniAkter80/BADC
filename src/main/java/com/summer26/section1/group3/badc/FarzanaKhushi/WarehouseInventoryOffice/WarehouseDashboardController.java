package com.summer26.section1.group3.badc.FarzanaKhushi.WarehouseInventoryOffice;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class WarehouseDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyProductsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/VerifyProducts.fxml");
    }

    @javafx.fxml.FXML
    public void securityButton(ActionEvent actionEvent)throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/WarehouseSecurity.fxml");
    }

    @javafx.fxml.FXML
    public void inventoryReportButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/InventoryReport.fxml");
    }

    @javafx.fxml.FXML
    public void updateStockButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/UpdateStock.fxml");
    }

    @javafx.fxml.FXML
    public void searchProdutButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/SearchProduct.fxml")
        ;
    }


    @javafx.fxml.FXML
    public void viewStockButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/ViewStock.fxml");
    }

    @javafx.fxml.FXML
    public void damagedProductButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/DamagedProducts.fxml");
    }

    @javafx.fxml.FXML
    public void productDistributionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/WarehouseInventoryOffice/ProductDistribution.fxml");
    }
}