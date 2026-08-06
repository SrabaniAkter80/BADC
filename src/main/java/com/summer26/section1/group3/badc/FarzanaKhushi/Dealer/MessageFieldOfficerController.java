package com.summer26.section1.group3.badc.FarzanaKhushi.Dealer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MessageFieldOfficerController
{
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;

    private final ObservableList<MessageFieldOfficer> sentMessages = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        subjectTextField.clear();
        messageTextArea.clear();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/FarzanaKhushi/Dealer/DealerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) {
        String subject = subjectTextField.getText();
        String message = messageTextArea.getText();


        if (subject.isEmpty() || message.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Input Error");
            alert.setContentText("Please fill both subject and message.");
            alert.show();
            return;
        }


        MessageFieldOfficer newMessage = new MessageFieldOfficer(subject, message);
        sentMessages.add(newMessage);



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Message sent to Field Officer successfully.");
        alert.show();

        clearButton(actionEvent);
    }
}