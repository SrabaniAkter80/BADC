package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G5_PO_RestockingRequestController
{
    @javafx.fxml.FXML
    private TextField quantity;
    @javafx.fxml.FXML
    private TableColumn<RestockingRequest, String> colproductname;
    @javafx.fxml.FXML
    private TextField productname;
    @javafx.fxml.FXML
    private TableView<RestockingRequest> tableview;
    @javafx.fxml.FXML
    private TableColumn<RestockingRequest, String> colquantity;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextField stockstatus;
    @javafx.fxml.FXML
    private TableColumn<RestockingRequest, String> coldemand;
    @javafx.fxml.FXML
    private TableColumn<RestockingRequest, String> colstockstatus;
    @javafx.fxml.FXML
    private ComboBox<String> demand;
    @javafx.fxml.FXML
    private TableColumn<RestockingRequest, String> colrestockstatus;
    @javafx.fxml.FXML
    private ComboBox<String> restockstatus;

    @javafx.fxml.FXML
    public void initialize() {

        demand.getItems().addAll("Low", "Medium", "High");

        restockstatus.getItems().addAll("Pending", "Approved", "Completed");

        colproductname.setCellValueFactory(new PropertyValueFactory<>("productName"));
        colstockstatus.setCellValueFactory(new PropertyValueFactory<>("stockStatus"));
        colquantity.setCellValueFactory(new PropertyValueFactory<>("requestedQuantity"));
        coldemand.setCellValueFactory(new PropertyValueFactory<>("demand"));
        colrestockstatus.setCellValueFactory(new PropertyValueFactory<>("restockStatus"));

        tableview.setItems(FXCollections.observableArrayList(RestockingRequestManager.getRequestList()));
    }

    @javafx.fxml.FXML
    public void confirm(ActionEvent actionEvent) {

        if (productname.getText().isEmpty()
                || stockstatus.getText().isEmpty()
                || quantity.getText().isEmpty()
                || demand.getValue() == null
                || restockstatus.getValue() == null) {

            label.setText("Please fill up all fields.");
            return;
        }

        RestockingRequest request = new RestockingRequest(

                productname.getText(),
                stockstatus.getText(),
                quantity.getText(),
                demand.getValue(),
                restockstatus.getValue()

        );

        RestockingRequestManager.addRequest(request);

        tableview.setItems(
                FXCollections.observableArrayList(
                        RestockingRequestManager.getRequestList()
                )
        );

        productname.clear();
        stockstatus.clear();
        quantity.clear();
        demand.setValue(null);
        restockstatus.setValue(null);

        label.setText("Restocking request submitted.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {

        RestockingRequest request =
                tableview.getSelectionModel().getSelectedItem();

        if (request == null) {
            label.setText("Please select a request.");
            return;
        }
        RestockingRequestManager.deleteRequest(request);
        tableview.setItems(
                FXCollections.observableArrayList(
                        RestockingRequestManager.getRequestList()
                )
        );
        label.setText("Request deleted.");
    }
    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        String product = productname.getText();

        for (Inventory inventory : InventoryManager.getInventoryList()) {
            if (inventory.getProductName().equalsIgnoreCase(product)) {
                stockstatus.setText(inventory.getStockStatus());
                demand.setValue(inventory.getDemand());
                label.setText("Product found.");
                return;
            }
        }
        label.setText("Product not found.");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {
        tableview.setItems(
                FXCollections.observableArrayList(
                        RestockingRequestManager.getRequestList()
                )
        );
        label.setText("Table refreshed.");
    }
}