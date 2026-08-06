package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void budgetPlanningButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/BudgetPlanning.fxml");
    }

    @javafx.fxml.FXML
    public void dealerDepositeButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/DealerDeposit.fxml");
    }

    @javafx.fxml.FXML
    public void tnxHistoryButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/TransactionHistory.fxml");
    }

    @javafx.fxml.FXML
    public void payrollButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/Payroll.fxml");
    }

    @javafx.fxml.FXML
    public void supplierInvoiceButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/SupplierInvoice.fxml");
    }

    @javafx.fxml.FXML
    public void officeExpenseButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/OfficeExpense.fxml");
    }


    @javafx.fxml.FXML
    public void financialReportButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/FinancialReport.fxml");
    }

    @javafx.fxml.FXML
    public void farmerSubsidyButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Samia_Alam/Accountant/FarmerSubsidy.fxml");
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/common/login.fxml");
    }
}