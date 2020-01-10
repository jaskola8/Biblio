package com.example.booker.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Getter
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ValidationException extends BaseException {

    private String field;
    private List<ValidationException> exceptions;

    public ValidationException(){}

    public ValidationException(String message) { setMessage(message); };

    public ValidationException(String field, String message) {
        this.field = field;
        setMessage(message);
    }

    public void addException(String field, String message) {addException(new ValidationException(field, message)); }

    public void addException(ValidationException e) {
        if(e == null) {
            return;
        }
        if(exceptions == null){
            exceptions = new ArrayList<>();
        }
        exceptions.add(e);
    }

}
