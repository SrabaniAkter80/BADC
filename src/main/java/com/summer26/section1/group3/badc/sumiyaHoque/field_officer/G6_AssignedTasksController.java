package com.summer26.section1.group3.badc.sumiyaHoque.field_officer;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class G6_AssignedTasksController
{
    @javafx.fxml.FXML
    private TableView<AssignedTask> assignedTasksTableView;
    @javafx.fxml.FXML
    private TableColumn<AssignedTask,String> taskIdColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedTask,String> dueDateColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedTask,String> taskNameColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedTask,String> statusColumn;

    @javafx.fxml.FXML
    public void initialize() {

        taskIdColumn.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        taskNameColumn.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}