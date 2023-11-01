package com.example.peoples;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String mess){
        super(mess);
    }
}
