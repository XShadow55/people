package com.example.peoples;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String mess){
        super(mess);
    }

}
