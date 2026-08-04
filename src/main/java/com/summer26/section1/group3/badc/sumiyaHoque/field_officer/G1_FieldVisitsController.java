package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.HelloApplication;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class G1_FieldVisitsController
{
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> farmerNameColumn;
    @javafx.fxml.FXML
    private TableView<FieldVisit> assignedAreasTableView;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> areaNameColumn;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> areaIdColumn;
    @javafx.fxml.FXML
    private TextArea visitNotesTextArea;
    @javafx.fxml.FXML
    private TableColumn<FieldVisit,String> visitDateColumn;
    @javafx.fxml.FXML
    private Label fieldVisitLabel;

    @javafx.fxml.FXML
    public void initialize() {
        areaIdColumn.setCellValueFactory(new PropertyValueFactory<>("areaId"));
        areaNameColumn.setCellValueFactory(new PropertyValueFactory<>("areaName"));
        farmerNameColumn.setCellValueFactory(new PropertyValueFactory<>("farmerName"));
        visitDateColumn.setCellValueFactory(new PropertyValueFactory<>("visitDate"));


        ObservableList<FieldVisit> list = FXCollections.observableArrayList(
                new FieldVisit("A101", "Kaliganj", "Rahim", "03-Aug-2026"),
                new FieldVisit("A102", "Gazipur", "Karim", "04-Aug-2026"),
                new FieldVisit("A103", "Tangail", "Salam", "05-Aug-2026")
        );

        assignedAreasTableView.setItems(list);




    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Button button = (Button) actionEvent.getSource();
        Stage stage = (Stage) button.getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    @javafx.fxml.FXML
    public void submitVisitReportButton(ActionEvent actionEvent) {

        FieldVisit selectedVisit = assignedAreasTableView.getSelectionModel().getSelectedItem();

        if (selectedVisit == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select an assigned area first.");
            alert.showAndWait();
            return;
        }

        if (visitNotesTextArea.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please enter visit notes.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Visit report submitted successfully.");
        alert.showAndWait();

        visitNotesTextArea.clear();
    }
}





