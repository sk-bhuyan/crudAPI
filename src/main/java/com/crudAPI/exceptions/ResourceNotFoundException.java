package com.crudAPI.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public long id;
    public ResourceNotFoundException(long userId){
        super(String.format("user not found with id: '%s'",userId));
        this.id=userId;
    }
}
