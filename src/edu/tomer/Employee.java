package edu.tomer;

import java.util.Date;

/**
 * Employee class describes an employee in our app
 */
public class Employee {
    public final static String className = "Employee";
    static int totalEmployeeCount;
    private String firstName;
    private String lastName;
    private String employeeID;
    private String socialID;
    //may describe as a class since it's a noun
    private String department;

    private String phone;

    private Date hiredDate;


    public Employee(String firstName, String lastName, String employeeID, String socialID, String department, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.socialID = socialID;
        this.department = department;
        this.phone = phone;
        this.hiredDate = new Date();
        totalEmployeeCount++;
    }

    public Employee() {
        this.firstName = IO.getString("Enter firstName:");
        this.lastName = IO.getString("Enter Last Name:");
        this.employeeID = IO.getString("Enter EmployeeID:");
        this.socialID = IO.getString("Enter socialID:");
        this.department = IO.getString("Enter department:");
        this.phone = IO.getString("Enter phone:");
        totalEmployeeCount++;
        hiredDate = new Date();
    }

    public void print() {
        System.out.printf("FirstName: %s\nLastName: %s\nphone:%s",
                firstName, lastName, phone);

    }

    public void askForRaise() {
        System.out.println("Will you give me a raise?");
        //long epochTime = hiredDate.getTime();
        Date now = new Date();
        long diff = (now.getTime() - hiredDate.getTime()) / 1000 / 60 / 60 / 24 / 365;
    }
}
