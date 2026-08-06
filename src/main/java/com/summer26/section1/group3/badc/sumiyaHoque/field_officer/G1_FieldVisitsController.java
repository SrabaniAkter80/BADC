package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import com.summer26.section1.group3.badc.common.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class G1_FieldVisitsController {

    private static final String FILE_NAME = "FieldVisit.bin";

    @FXML
    private TableColumn<FieldVisit, String> farmerNameColumn;
    @FXML
    private TableView<FieldVisit> assignedAreasTableView;
    @FXML
    private TableColumn<FieldVisit, String> areaNameColumn;
    @FXML
    private TableColumn<FieldVisit, String> areaIdColumn;
    @FXML
    private TextArea visitNotesTextArea;
    @FXML
    private TableColumn<FieldVisit, String> visitDateColumn;
    @FXML
    private Label fieldVisitLabel;

    @FXML
    public void initialize() {

        areaIdColumn.setCellValueFactory(new PropertyValueFactory<>("areaId"));
        areaNameColumn.setCellValueFactory(new PropertyValueFactory<>("areaName"));
        farmerNameColumn.setCellValueFactory(new PropertyValueFactory<>("farmerName"));
        visitDateColumn.setCellValueFactory(new PropertyValueFactory<>("visitNotes"));

        ObservableList<FieldVisit> list = FXCollections.observableArrayList(
                new FieldVisit("A101", "Kaliganj", "Rahim", "03-Aug-2026"),
                new FieldVisit("A102", "Gazipur", "Karim", "04-Aug-2026"),
                new FieldVisit("A103", "Tangail", "Salam", "05-Aug-2026")
        );

        assignedAreasTableView.setItems(list);
    }

    @FXML
    public void submitVisitReportButton(ActionEvent actionEvent) {

        FieldVisit selectedVisit = assignedAreasTableView.getSelectionModel().getSelectedItem();

        if (selectedVisit == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please select an assigned area first.");
            alert.showAndWait();
            return;
        }

        if (visitNotesTextArea.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Please enter visit notes.");
            alert.showAndWait();
            return;
        }

        selectedVisit.setVisitNotes(visitNotesTextArea.getText());

        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(selectedVisit);

            oos.close();
            fos.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Visit report submitted and saved successfully.");
            alert.showAndWait();

            visitNotesTextArea.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/com/summer26/section1/group3/badc/sumiyaHoque/field_officer/FieldOfficer_Dashboard.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}

