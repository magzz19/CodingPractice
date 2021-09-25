package com.accenture.bars.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

public class Account {

    private int accountId;
    private String accountName;
    private LocalDateTime dateCreated;
    private String isActive;
    private String lastEdited;
    private Customer customerId;
//    private Set<Billing> billing = new Billing();

    //empty Constructor

    public Account() {
    }

    //Getters and Setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
