package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class G5_Employee_Attendance_ViewController {

    @javafx.fxml.FXML
    private TableColumn<EmployeeAttendance, String> attendanceRecordColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAttendance, String> workingStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAttendance, String> employeeIDColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAttendance, String> employeeNameColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAttendance, ?> DateColumn;
    @javafx.fxml.FXML
    private TableView<EmployeeAttendance> Employee_Attendance_TableView;
    @javafx.fxml.FXML
    private TextField employeeIDTextField;
    @javafx.fxml.FXML
    private Label employeeAttendanceLabel;

    private final String FILE_NAME = "data/EmployeeAttendance.bin";

    private ObservableList<EmployeeAttendance> attendanceList =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        employeeIDColumn.setCellValueFactory(
                new PropertyValueFactory<>("employeeID"));

        employeeNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("employeeName"));

        attendanceRecordColumn.setCellValueFactory(
                new PropertyValueFactory<>("attendanceRecord"));

        workingStatusColumn.setCellValueFactory(
                new PropertyValueFactory<>("workingStatus"));

        DateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        loadAttendanceData();
    }

    private void loadAttendanceData() {

        attendanceList.clear();

        ArrayList<EmployeeAttendance> list =
                BinaryFileUtil.readObjects(FILE_NAME);

        attendanceList.addAll(list);

        Employee_Attendance_TableView.setItems(attendanceList);
    }

    @javafx.fxml.FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {

        String id = employeeIDTextField.getText().trim();

        if (id.isEmpty()) {
            Employee_Attendance_TableView.setItems(attendanceList);
            return;
        }

        ObservableList<EmployeeAttendance> filteredList =
                FXCollections.observableArrayList();

        for (EmployeeAttendance attendance : attendanceList) {

            if (attendance.getEmployeeID().equalsIgnoreCase(id)) {
                filteredList.add(attendance);
            }
        }

        Employee_Attendance_TableView.setItems(filteredList);
    }

    @javafx.fxml.FXML
    public void HandleBacktoDashboardButton(ActionEvent actionEvent)throws IOException {

        SceneSwitcher.switchTo(
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");

    }
}