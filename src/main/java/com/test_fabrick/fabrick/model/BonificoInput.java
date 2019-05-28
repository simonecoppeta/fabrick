package com.test_fabrick.fabrick.model;

public class BonificoInput {

    private String receiverName; //beneficiario del bonifico
    private String description; //descrizione del bonifico
    private String currency;
    private String amount;
    private String executionDate; //DD/MM/YYYY

    public BonificoInput() {
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    @Override
    public String toString() {
        return "BonificoInput{" +
                "receiverName='" + receiverName + '\'' +
                ", description='" + description + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", executionDate='" + executionDate + '\'' +
                '}';
    }
}
