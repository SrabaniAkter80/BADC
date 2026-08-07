package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import com.summer26.section1.group3.badc.utils.BinaryFileUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class G1_Employee_Info_ViewController {

    @FXML
    private ComboBox<String> DesignationComboBox;

    @FXML
    private TableView<Employee> Employee_Information_TableView;

    @FXML
    private TableColumn<Employee, String> EmployeeIDColumn;

    @FXML
    private TableColumn<Employee, String> NameColumn;

    @FXML
    private TableColumn<Employee, String> DesignationColumn;

    @FXML
    private TableColumn<Employee, String> ContactInformationColumn;

    @FXML
    private Label EmployeeDirectoryLabel;

    private final ObservableList<Employee> employeeList =
            FXCollections.observableArrayList();
    @FXML
    private TextField FilterEmployeeIDTextField;

    @FXML
    public void initialize() {

        EmployeeIDColumn.setCellValueFactory(new PropertyValueFactory<>("employeeID"));

        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        DesignationColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));

        ContactInformationColumn.setCellValueFactory(new PropertyValueFactory<>("contactInformation"));

        DesignationComboBox.getItems().addAll("Account Officer", "Field Officer", "Procurement Officer", "Transport and Logistic Manager");
        loadEmployees();

        Employee_Information_TableView.setItems(employeeList);
    }

    private void loadEmployees() {

        employeeList.clear();

        employeeList.addAll(
                BinaryFileUtil.readObjects("data/accountofficer.bin"));

        employeeList.addAll(
                BinaryFileUtil.readObjects("data/fieldofficer.bin"));

        employeeList.addAll(
                BinaryFileUtil.readObjects("data/procurementofficer.bin"));

        employeeList.addAll(
                BinaryFileUtil.readObjects("data/transportlogisticmanager.bin"));
    }

    @FXML
    public void HandleViewAllEmployeesButton(ActionEvent actionEvent) {

        loadEmployees();
        Employee_Information_TableView.setItems(employeeList);
    }

    @FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {
        String employeeID = FilterEmployeeIDTextField.getText().trim();
        String designation = DesignationComboBox.getValue();

        ObservableList<Employee> filteredList =
                FXCollections.observableArrayList();

        for (Employee employee : employeeList) {

            boolean idMatch =
                    employeeID.isEmpty()
                            || employee.getEmployeeID().equalsIgnoreCase(employeeID);

            boolean designationMatch =
                    designation == null
                            || employee.getDesignation().equalsIgnoreCase(designation);

            if (idMatch || designationMatch) {
                filteredList.add(employee);
            }
        }

        Employee_Information_TableView.setItems(filteredList);
    }
    @FXML
    public void HandleBackToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");
    }
}
