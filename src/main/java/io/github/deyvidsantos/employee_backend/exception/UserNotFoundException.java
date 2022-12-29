package io.github.deyvidsantos.employee_backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException (String message){
        super(message);
    }
}
