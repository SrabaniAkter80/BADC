package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class PerformanceAnalyticsController
{
    @javafx.fxml.FXML
    private BarChart <String, Number> performanceBarChart;
    @javafx.fxml.FXML
    private CategoryAxis categoryAxis;
    @javafx.fxml.FXML
    private ComboBox <String> monthYearComboBox;
    @javafx.fxml.FXML
    private TextArea summaryLabel;
    @javafx.fxml.FXML
    private NumberAxis numberAxis;

    @javafx.fxml.FXML
    public void initialize() {
        monthYearComboBox.getItems().addAll(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Admin/AdminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void loadAnalyticsButton(ActionEvent actionEvent) {
        if (monthYearComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a month.");
            alert.showAndWait();
            return;
        }

        performanceBarChart.getData().clear();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName(monthYearComboBox.getValue());

        series.getData().add(new XYChart.Data<>("Sales", 120));
        series.getData().add(new XYChart.Data<>("Subsidy", 80));
        series.getData().add(new XYChart.Data<>("Inventory", 150));

        performanceBarChart.getData().add(series);

        summaryLabel.setText(
                "Performance Summary\n\n" +
                        "Month: " + monthYearComboBox.getValue() +
                        "\nSales: 120" +
                        "\nSubsidy: 80" +
                        "\nInventory: 150"
        );
    }
}