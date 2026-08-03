package com.summer26.section1.group3.badc.Samia_Alam.Admin;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class PerformanceAnalyticsController
{
    @javafx.fxml.FXML
    private BarChart performanceBarChart;
    @javafx.fxml.FXML
    private CategoryAxis categoryAxis;
    @javafx.fxml.FXML
    private ComboBox monthYearComboBox;
    @javafx.fxml.FXML
    private TextArea summaryLabel;
    @javafx.fxml.FXML
    private NumberAxis numberAxis;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadAnalyticsButton(ActionEvent actionEvent) {
    }
}