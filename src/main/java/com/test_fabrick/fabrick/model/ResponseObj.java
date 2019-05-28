package com.test_fabrick.fabrick.model;

public class ResponseObj {
    private StatusResponseObj status;
    private ErrorResponseObj error;
    private Object payload;

    public ResponseObj() {
    }

    public ResponseObj(StatusResponseObj status, ErrorResponseObj error, Object payload) {
        this.status = status;
        this.error = error;
        this.payload = payload;
    }

    public StatusResponseObj getStatus() {
        return status;
    }

    public void setStatus(StatusResponseObj status) {
        this.status = status;
    }

    public ErrorResponseObj getError() {
        return error;
    }

    public void setError(ErrorResponseObj error) {
        this.error = error;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
