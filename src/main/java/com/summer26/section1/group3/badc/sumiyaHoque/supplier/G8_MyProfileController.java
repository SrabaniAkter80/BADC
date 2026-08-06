package com.summer26.section1.group3.badc.sumiyaHoque.supplier;

import com.summer26.section1.group3.badc.common.HelloApplication;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class G8_MyProfileController
{
    @javafx.fxml.FXML
    private TextField phonetextfield;
    @javafx.fxml.FXML
    private TextField addresstextfield;
    @javafx.fxml.FXML
    private TextField emailtextfield;
    @javafx.fxml.FXML
    private TextField nametextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nametextfield.setText("Sumiya Hoque");
        phonetextfield.setText("01712345678");
        emailtextfield.setText("supplier@gmail.com");
        addresstextfield.setText("Dhaka, Bangladesh");
    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaHoque/supplier/SP_Dashboard.fxml");

    }

    @javafx.fxml.FXML
    public void editbutton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/summer26/section1/group3/badc/sumiyaHoque/supplier/G8_EditProfile.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void refreshbutton(ActionEvent actionEvent)throws IOException {
        nametextfield.setText("Sumiya Hoque");
        phonetextfield.setText("01712345678");
        emailtextfield.setText("supplier@gmail.com");
        addresstextfield.setText("Dhaka, Bangladesh");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Profile refreshed successfully.");
        alert.showAndWait();
    }
}