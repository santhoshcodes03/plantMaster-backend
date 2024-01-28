package com.keydraftproject.plant.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("no data found for"+" "+id);
    }
}

