package com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager;
import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class G1_Employee_Info_ViewController
{
    @javafx.fxml.FXML
    private TextField FilterEmployeeIDTextField;
    @javafx.fxml.FXML
    private TableView<EmployeeInfo> Employee_Information_TableView;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfo,String> NameColumn;
    @javafx.fxml.FXML
    private TableColumn <EmployeeInfo,String>ContactInformationColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfo,String> DesignationColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeInfo,Integer> EmployeeIDColumn;
    @javafx.fxml.FXML
    private Label EmployeeDirectoryLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HandleBackToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(

                "/com/summer26/section1/group3/badc/Srabani_Akter/HR_Manager/G0_HR Manager_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void HandleViewAllEmployeesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleSearchFilterButton(ActionEvent actionEvent) {
    }
}