package com.accenture.bars.entity;

import java.time.LocalDate;

public class Billing {

    private int billingId;
    private int billingCycle;
    private String billingMonth;
    private double amount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String lastEdited;
    private Account accountId;

    //empty Constructor
    public Billing() {
    }

    //Getters and Setters

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }


}
