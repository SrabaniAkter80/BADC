package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FinancialReportController {

    @javafx.fxml.FXML
    private TextArea reportTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> quarterComboBox;

    File file = new File("financial_report.bin");

    @javafx.fxml.FXML
    public void initialize() {
        quarterComboBox.getItems().addAll(
                "Q1",
                "Q2",
                "Q3",
                "Q4"
        );

        reportTextArea.setEditable(false);
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        if (quarterComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a quarter.");
            alert.showAndWait();
            return;
        }

        String reportContent =
                "Financial Report\n\n" +
                        "Quarter: " + quarterComboBox.getValue() +
                        "\nTotal Revenue: 500,000 BDT" +
                        "\nTotal Expense: 320,000 BDT" +
                        "\nNet Profit: 180,000 BDT";

        FinancialReport financialReport = new FinancialReport(
                quarterComboBox.getValue(),
                reportContent
        );

        saveReport(financialReport);

        reportTextArea.setText(financialReport.getReport());
    }

    @javafx.fxml.FXML
    public void downloadButton(ActionEvent actionEvent) {
        if (reportTextArea.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Generate the report first.");
            alert.showAndWait();
            return;
        }

        String fileName = "FinancialReport_" + quarterComboBox.getValue() + ".txt";

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(fileName))) {

            writer.write(reportTextArea.getText());

        } catch (IOException e) {
            e.printStackTrace();

            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Failed to download the report.");
            errorAlert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Report downloaded successfully as " + fileName);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/AccountantDashboard.fxml");
    }

    private void saveReport(FinancialReport newReport) {

        List<FinancialReport> reportList = loadAllReports();
        reportList.add(newReport);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            for (FinancialReport fr : reportList) {
                oos.writeObject(fr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<FinancialReport> loadAllReports() {

        List<FinancialReport> reportList = new ArrayList<>();

        if (!file.exists()) {
            return reportList;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                FinancialReport fr = (FinancialReport) ois.readObject();
                reportList.add(fr);
            }

        } catch (EOFException e) {
            // End of File, expected

        } catch (Exception e) {
            e.printStackTrace();
        }

        return reportList;
    }
}