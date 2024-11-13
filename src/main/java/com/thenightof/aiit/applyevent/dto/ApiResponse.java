package com.thenightof.aiit.applyevent.dto;

public class ApiResponse {
    private String message;
    private Object data;

    // 메시지만 포함하는 생성자
    public ApiResponse(String message) {
        this.message = message;
    }

    // 메시지와 데이터를 포함하는 생성자
    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
