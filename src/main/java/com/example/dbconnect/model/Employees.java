//package com.example.dbconnect.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "employee")
//public class Employees {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Column(name = "first_name", nullable = false)
//    private String firstName;
//    @Column(name = "last_name", nullable = false)
//    private String lastName;
//    @Column(name = "email_address", nullable = false)
//    private String emailId;
//
//    public Employees() {
//
//    }
//
//    public Employees(String firstName, String lastName, String emailId) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.emailId = emailId;
//    }
//    //getter/setter methods
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmailId() {
//        return emailId;
//    }
//
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
//}