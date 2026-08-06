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

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PerformanceAnalyticsController {

    @javafx.fxml.FXML
    private BarChart<String, Number> performanceBarChart;
    @javafx.fxml.FXML
    private CategoryAxis categoryAxis;
    @javafx.fxml.FXML
    private ComboBox<String> monthYearComboBox;
    @javafx.fxml.FXML
    private TextArea summaryLabel;
    @javafx.fxml.FXML
    private NumberAxis numberAxis;

    File file = new File("performance.bin");

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

        if (!file.exists()) {
            writeSampleData();
        }
    }

    private void writeSampleData() {

        List<PerformanceAnalytics> sampleData = new ArrayList<>();
        sampleData.add(new PerformanceAnalytics("January", "Sales", 120));
        sampleData.add(new PerformanceAnalytics("January", "Subsidy", 80));
        sampleData.add(new PerformanceAnalytics("January", "Inventory", 150));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            for (PerformanceAnalytics pa : sampleData) {
                oos.writeObject(pa);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<PerformanceAnalytics> loadAllData() {

        List<PerformanceAnalytics> dataList = new ArrayList<>();

        if (!file.exists()) {
            return dataList;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                PerformanceAnalytics pa = (PerformanceAnalytics) ois.readObject();
                dataList.add(pa);
            }

        } catch (EOFException e) {
            // End of File, expected

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataList;
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

        String selectedMonth = monthYearComboBox.getValue();

        List<PerformanceAnalytics> allData = loadAllData();

        performanceBarChart.getData().clear();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName(selectedMonth);

        StringBuilder summary = new StringBuilder();
        summary.append("Performance Summary\n\n");
        summary.append("Month: ").append(selectedMonth).append("\n");

        boolean found = false;

        for (PerformanceAnalytics pa : allData) {
            if (pa.getMonth().equalsIgnoreCase(selectedMonth)) {
                series.getData().add(new XYChart.Data<>(pa.getCategory(), pa.getValue()));
                summary.append(pa.getCategory()).append(": ").append(pa.getValue()).append("\n");
                found = true;
            }
        }

        if (!found) {
            summary.append("No data available for this month.");
        }

        performanceBarChart.getData().add(series);
        summaryLabel.setText(summary.toString());
    }
}