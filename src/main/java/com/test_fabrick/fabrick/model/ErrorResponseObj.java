package com.test_fabrick.fabrick.model;

public class ErrorResponseObj {
    private String description;

    public ErrorResponseObj() {
    }

    public ErrorResponseObj(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
