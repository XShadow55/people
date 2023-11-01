package com.example.peoples;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException(String mess){
        super(mess);
    }
}
