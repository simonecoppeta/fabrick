package com.test_fabrick.fabrick.model;

public class StatusResponseObj {

    private String code;
    private String description;

    public StatusResponseObj(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public StatusResponseObj() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
