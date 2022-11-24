package com.agilityplan.agilityplan.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String description;
    private Map<String, String> errorsValidation;

    public ExceptionResponse() {}

    public ExceptionResponse(Date timestamp, String message, String description){
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public ExceptionResponse(Date timestamp, String message, String description, Map<String, String> errorsValidation) {
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
        this.errorsValidation = errorsValidation;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getErrorsValidation() {
        return errorsValidation;
    }

    public void setErrorsValidation(Map<String, String> errorsValidation) {
        this.errorsValidation = errorsValidation;
    }
}

