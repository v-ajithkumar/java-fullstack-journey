package com.demo.Spring_learning.Day16.DTO;

public class ApiResponse<T>{

    private boolean success;
    private String message;
    private T data;

    public ApiResponse(){}

    public ApiResponse(boolean success,String message , T data){
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
