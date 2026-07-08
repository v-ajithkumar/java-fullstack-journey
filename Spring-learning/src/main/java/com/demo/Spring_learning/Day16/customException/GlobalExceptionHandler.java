package com.demo.Spring_learning.Day16.customException;
import com.demo.Spring_learning.Day16.DTO.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<ApiResponse<Void>> handleEmployeeNotFound(EmployeeNotFound employeeNotFound){
        ApiResponse<Void> response =  new ApiResponse<>(
                false,
                employeeNotFound.getMessage(),
                null

        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}
