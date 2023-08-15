package com.devsuperior.catalog.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FildMessage> errors = new ArrayList<>();

    public List<FildMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FildMessage(fieldName, message));
    }
}
