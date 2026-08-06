package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class G2_Farmer_Place_OrderController {

    @javafx.fxml.FXML
    private ComboBox<String> productCategoryComboBox;

    @javafx.fxml.FXML
    private Label placeOrderPageLabel;

    @javafx.fxml.FXML
    private Label confirmationMessageLabel;

    @javafx.fxml.FXML
    private TextField quantityTextField;


    private static final String PRODUCT_FILE =
            "data/products.bin";

    private static final String ORDER_FILE =
            "data/orders.bin";


    @javafx.fxml.FXML
    public void initialize() {

        loadProducts();

        confirmationMessageLabel.setText("");
    }


    private void loadProducts() {

        ArrayList<Product> products =
                BinaryFileUtil.readObjects(PRODUCT_FILE);

        ArrayList<String> productNames =
                new ArrayList<>();

        for (Product product : products) {

            productNames.add(
                    product.getProductName()
            );
        }

        productCategoryComboBox.setItems(
                FXCollections.observableArrayList(productNames)
        );
    }


    @javafx.fxml.FXML
    public void HandlePlaceOrderButton(ActionEvent actionEvent) {

        String selectedProduct =
                productCategoryComboBox.getValue();

        String quantityText =
                quantityTextField.getText().trim();


        if (selectedProduct == null ||
                selectedProduct.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please select a product."
            );

            return;
        }


        if (quantityText.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter required quantity."
            );

            return;
        }


        int quantity;

        try {

            quantity = Integer.parseInt(quantityText);

        } catch (NumberFormatException e) {

            confirmationMessageLabel.setText(
                    "Please enter a valid quantity."
            );

            return;
        }


        if (quantity <= 0) {

            confirmationMessageLabel.setText(
                    "Quantity must be greater than 0."
            );

            return;
        }


        Order order =
                new Order(
                        selectedProduct,
                        quantity
                );


        BinaryFileUtil.appendObject(
                ORDER_FILE,
                order
        );


        confirmationMessageLabel.setText(
                "Order placed successfully."
        );


        quantityTextField.clear();

        productCategoryComboBox.getSelectionModel()
                .clearSelection();
    }


    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");


    }
}