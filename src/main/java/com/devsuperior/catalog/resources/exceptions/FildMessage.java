package com.devsuperior.catalog.resources.exceptions;

import java.io.Serializable;

public class FildMessage implements Serializable {

    private String fieldName;
    private String message;

    FildMessage(){}

    FildMessage(String fieldName, String message){
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
