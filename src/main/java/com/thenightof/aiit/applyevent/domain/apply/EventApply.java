package com.thenightof.aiit.applyevent.domain.apply;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "event_apply")
public class EventApply {

    @Id
    @Column(name = "userid", length = 7)
    private String userid;

    @Column(name = "name", length = 5, nullable = false)
    private String name;

    @Column(name = "phonenum", length = 15, nullable = false)
    private String phonenum;

    @Column(name = "birthdate", length = 15, nullable = false)
    private String birthdate;

    @Column(name = "membership_fee", nullable = false)
    private Boolean membership_fee;

    @Column(name = "is_vegan", nullable = false)
    private Boolean is_vegan;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    // Getters and Setters
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
