package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class G4_Task_Assignment_ViewController {

    @javafx.fxml.FXML
    private TextArea taskDescriptionTextArea;
    @javafx.fxml.FXML
    private Label MessageLabel;
    @javafx.fxml.FXML
    private Label taskAssignmentLabel;
    @javafx.fxml.FXML
    private DatePicker dueDateDatePicker;
    @javafx.fxml.FXML
    private TextField employeeIDTextField;
    private final String FILE_NAME = "data/TaskAssignment.bin";

    @javafx.fxml.FXML
    public void initialize() {
        MessageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void HandleBackToDashBoardButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void HandleAssignTaskButton(ActionEvent actionEvent) {

        String employeeID = employeeIDTextField.getText().trim();
        String taskDescription = taskDescriptionTextArea.getText().trim();
        LocalDate dueDate = dueDateDatePicker.getValue();

        if (employeeID.isEmpty()) {
            MessageLabel.setText("Please enter Employee ID.");
            return;
        }

        if (taskDescription.isEmpty()) {
            MessageLabel.setText("Please enter Task Description.");
            return;
        }
        if (dueDate == null) {
            MessageLabel.setText("Please select Due Date.");
            return;
        }
        TaskAssignment task = new TaskAssignment(employeeID, taskDescription, dueDate);
        BinaryFileUtil.appendObject(FILE_NAME, task);
        MessageLabel.setText("Task successfully assigned.");
        employeeIDTextField.clear();
        taskDescriptionTextArea.clear();
        dueDateDatePicker.setValue(null);
    }
}