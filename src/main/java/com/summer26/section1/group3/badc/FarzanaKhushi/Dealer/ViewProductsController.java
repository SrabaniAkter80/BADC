package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

//import javax.swing.text.View;
import java.io.IOException;

public class ViewProductsController
{
    @javafx.fxml.FXML
    private TableColumn <ViewProductsController, String>stockCol;
    @javafx.fxml.FXML
    private TableView<ViewProductsController> productsTable;
    @javafx.fxml.FXML
    private TableColumn<ViewProductsController, String>productIdCol;
    @javafx.fxml.FXML
    private TableColumn <ViewProductsController, String>productNameCol;
    @javafx.fxml.FXML
    private TableColumn <ViewProductsController, String> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/dealerDashboardController.java");
    }
}