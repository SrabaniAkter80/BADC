package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.HelloApplication;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class G8_MyProfileController
{
    @javafx.fxml.FXML
    private TextArea profileInfoTextArea;

    @javafx.fxml.FXML
    public void initialize() {

        profileInfoTextArea.setEditable(false);

        profileInfoTextArea.setText(
                "Name : Rahim Uddin\n" +
                        "Email : rahim@gmail.com\n" +
                        "Phone : 01712345678\n" +
                        "Address : Dhaka, Bangladesh\n" +
                        "Designation : Field Officer"
        );
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
        profileInfoTextArea.setText(
                "Name : Rahim Uddin\n" +
                        "Email : rahim@gmail.com\n" +
                        "Phone : 01712345678\n" +
                        "Address : Dhaka, Bangladesh\n" +
                        "Designation : Field Officer"
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Profile refreshed successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent)throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/G8_EditProfile.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml");
    }
}