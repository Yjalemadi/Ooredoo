package com.yousuf.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Form {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="userId")
    private String userId;
    @Column(name="firstName")
    private String firstName;
    @Column(name="dob")
    private String dob;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name="exp")
    private String exp;
    @Column(name="interest")
    private String interest;
    @Column(name="invest")
    private String invest;
    @Column(name="location")
    private String location;
    @Column(name="notes")
    private String notes;

    public Form() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getInvest() {
        return invest;
    }

    public void setInvest(String invest) {
        this.invest = invest;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
