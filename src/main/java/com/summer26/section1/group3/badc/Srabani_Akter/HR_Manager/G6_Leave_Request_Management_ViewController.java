package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class G6_Leave_Request_Management_ViewController {

    @javafx.fxml.FXML
    private Label LeaveRequestLabel;
    @javafx.fxml.FXML
    private TableColumn<LeaveRequest, String> ApplicationStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<LeaveRequest, String> ApplicationIDColumn;
    @javafx.fxml.FXML
    private TableColumn<LeaveRequest, String> EmployeeIDColumn;
    @javafx.fxml.FXML
    private TableColumn<LeaveRequest, String> LeaveTypeColumn;
    @javafx.fxml.FXML
    private TableView<LeaveRequest> Leave_Request_Management_TableView;
    @javafx.fxml.FXML
    private ComboBox<String> FilterbyLeaveStatusComboBox;
    private final String FILE_NAME = "data/LeaveRequest.bin";
    private ObservableList<LeaveRequest> leaveList =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        FilterbyLeaveStatusComboBox.getItems().addAll(
                "Pending",
                "Approved",
                "Rejected"
        );

        ApplicationIDColumn.setCellValueFactory(
                new PropertyValueFactory<>("applicationID"));

        EmployeeIDColumn.setCellValueFactory(
                new PropertyValueFactory<>("employeeID"));

        LeaveTypeColumn.setCellValueFactory(
                new PropertyValueFactory<>("leaveType"));

        ApplicationStatusColumn.setCellValueFactory(
                new PropertyValueFactory<>("applicationStatus"));

        loadData();

        FilterbyLeaveStatusComboBox.setOnAction(e -> filterData());
    }

    private void loadData() {

        leaveList.clear();

        ArrayList<LeaveRequest> list =
                BinaryFileUtil.readObjects(FILE_NAME);

        leaveList.addAll(list);

        Leave_Request_Management_TableView.setItems(leaveList);
    }

    private void filterData() {

        String status = FilterbyLeaveStatusComboBox.getValue();

        if (status == null) {
            Leave_Request_Management_TableView.setItems(leaveList);
            return;
        }

        ObservableList<LeaveRequest> filtered =
                FXCollections.observableArrayList();

        for (LeaveRequest request : leaveList) {

            if (request.getApplicationStatus().equalsIgnoreCase(status)) {
                filtered.add(request);
            }
        }

        Leave_Request_Management_TableView.setItems(filtered);
    }

    @javafx.fxml.FXML
    public void HandleApproveButton(ActionEvent actionEvent) {

        LeaveRequest request =
                Leave_Request_Management_TableView.getSelectionModel().getSelectedItem();

        if (request == null) {
            LeaveRequestLabel.setText("Please select a leave request.");
            return;
        }

        request.setApplicationStatus("Approved");

        BinaryFileUtil.saveList(FILE_NAME,
                new ArrayList<>(leaveList));

        Leave_Request_Management_TableView.refresh();

        LeaveRequestLabel.setText("Leave request approved successfully.");
    }

    @javafx.fxml.FXML
    public void HandleRejectLeaveButton(ActionEvent actionEvent) {

        LeaveRequest request =
                Leave_Request_Management_TableView.getSelectionModel().getSelectedItem();

        if (request == null) {
            LeaveRequestLabel.setText("Please select a leave request.");
            return;
        }

        request.setApplicationStatus("Rejected");

        BinaryFileUtil.saveList(FILE_NAME,
                new ArrayList<>(leaveList));

        Leave_Request_Management_TableView.refresh();

        LeaveRequestLabel.setText("Leave request rejected successfully.");
    }

    @javafx.fxml.FXML
    public void HandleBackToDashboardButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo(
                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");

    }
}