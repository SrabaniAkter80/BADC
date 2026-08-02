package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class G1_SupplyProposalController
{
    @javafx.fxml.FXML
    private TextField ProposalDetailsTextField;
    @javafx.fxml.FXML
    private TextField QuantityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ProductCategoryComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        ProductCategoryComboBox.getItems().addAll(
                "Seeds",
                "Fertilizers",
                "Agricultural Products"
        );

    }

    @javafx.fxml.FXML
    public void ProposalSubmitButton(ActionEvent actionEvent) {
        String category = ProductCategoryComboBox.getValue();
        String quantity = QuantityTextField.getText();
        String details = ProposalDetailsTextField.getText();
        }


        @javafx.fxml.FXML
        public void BackButton (ActionEvent actionEvent){

        }
    }