package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class G1SupplyProposalController
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

    @Deprecated
    public void submitButton(ActionEvent actionEvent) {

        try {

            String category = ProductCategoryComboBox.getValue();
            int quantity = Integer.parseInt(QuantityTextField.getText());
            String details = ProposalDetailsTextField.getText();

            SupplyProposal proposal = new SupplyProposal(
                    "P001",
                    category,
                    quantity,
                    details,
                    "Pending"
            );

            FileOutputStream fos = new FileOutputStream("SupplyProposal.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(proposal);

            oos.close();
            fos.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Proposal submitted successfully.");
            alert.showAndWait();

            ProductCategoryComboBox.setValue(null);
            QuantityTextField.clear();
            ProposalDetailsTextField.clear();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



        @javafx.fxml.FXML
        public void BackButton (ActionEvent actionEvent)throws IOException {
            SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");



        }

    @javafx.fxml.FXML
    public void ProposalSubmitButton(ActionEvent actionEvent) {
    }
}