package com.thenightof.aiit.applyevent.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

public class EventApplyRequest {

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "User ID cannot be null")
    private String userId;

    @NotNull(message = "Phone number cannot be null")
    private String phonenum;

    @NotNull(message = "Birthdate cannot be null")
    private String birthdate;

    @NotNull(message = "Membership fee status cannot be null")
    private Boolean membership_fee;

    @NotNull(message = "Vegan status cannot be null")
    private Boolean is_vegan;

    @Email(message = "Email should be valid")
    private String email;

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

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getMembership_fee() {
        return membership_fee;
    }

    public void setMembership_fee(Boolean membership_fee) {
        this.membership_fee = membership_fee;
    }

    public Boolean getIs_vegan() {
        return is_vegan;
    }

    public void setIs_vegan(Boolean is_vegan) {
        this.is_vegan = is_vegan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
