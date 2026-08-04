package com.summer26.section1.group3.badc.Samia_Alam.Accountant;

public class BudgetPlanning {
    private String department;
    private double currentBudget;
    private double proposedBudget;

    public BudgetPlanning(String department, double currentBudget, double proposedBudget) {
        this.department = department;
        this.currentBudget = currentBudget;
        this.proposedBudget = proposedBudget;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCurrentBudget() {
        return currentBudget;
    }

    public void setCurrentBudget(double currentBudget) {
        this.currentBudget = currentBudget;
    }

    public double getProposedBudget() {
        return proposedBudget;
    }

    public void setProposedBudget(double proposedBudget) {
        this.proposedBudget = proposedBudget;
    }

    @Override
    public String toString() {
        return "BudgetPlanning{" +
                "department='" + department + '\'' +
                ", currentBudget=" + currentBudget +
                ", proposedBudget=" + proposedBudget +
                '}';
    }
}
