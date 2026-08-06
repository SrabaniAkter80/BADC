package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class G7_Submit_ComplaintController {

    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;

    @javafx.fxml.FXML
    private Label confirmationMessageLabel;

    @javafx.fxml.FXML
    private ComboBox<String> complaintCategoryComboBox;


    private static final String FILE_NAME =
            "data/complaints.bin";


    @javafx.fxml.FXML
    public void initialize() {

        complaintCategoryComboBox.setItems(
                FXCollections.observableArrayList(
                        "Products",
                        "Services",
                        "Application Process"
                )
        );

        confirmationMessageLabel.setText("");
    }


    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {

        String category =
                complaintCategoryComboBox.getValue();

        String details =
                complaintDetailsTextArea.getText().trim();


        // Validate category
        if (category == null || category.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please select a complaint category."
            );

            return;
        }



        if (details.isEmpty()) {

            confirmationMessageLabel.setText(
                    "Please enter complaint details."
            );

            return;
        }


        // Create complaint object
        Complaint complaint =
                new Complaint(
                        category,
                        details
                );


        // Store complaint in complaints.bin
        BinaryFileUtil.appendObject(
                FILE_NAME,
                complaint
        );


        // Display confirmation
        confirmationMessageLabel.setText(
                "Complaint submitted successfully."
        );


        // Clear input fields
        complaintCategoryComboBox.getSelectionModel()
                .clearSelection();

        complaintDetailsTextArea.clear();
    }


    @javafx.fxml.FXML
    public void handleBacktoDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G0_Farmer_Dashboard.fxml");

    }
}