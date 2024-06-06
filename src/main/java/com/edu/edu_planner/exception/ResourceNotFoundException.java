package com.edu.edu_planner.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String project_not_found) {

    }

    public String ResourceNotFoundException(String message){
        return(message);
    }
}
