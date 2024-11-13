package com.thenightof.aiit.applyevent.dto;

public class EventApplyResponse {
    private String name;
    private String userId;

    public EventApplyResponse(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
