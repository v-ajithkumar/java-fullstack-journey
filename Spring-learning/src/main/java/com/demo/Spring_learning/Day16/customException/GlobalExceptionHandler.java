package com.demo.Spring_learning.Day16.customException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFound employeeNotFound){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(employeeNotFound.getMessage());
    }
}
