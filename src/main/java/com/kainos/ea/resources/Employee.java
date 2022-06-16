package com.kainos.ea.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    //Setting variables for Employee Object
    int employeeID, departmentID;
    String employeeName, nationalInsurance, bankAccountNo, employeeAddress;
    float startingSalary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public float getStartingSalary() {
        return startingSalary;
    }

    public void setStartingSalary(float startingSalary) {
        this.startingSalary = startingSalary;
    }

    //Creating json
    @JsonCreator
    public Employee(@JsonProperty("EmployeeID") int employeeID, @JsonProperty("EmployeeName") String employeeName, @JsonProperty("DepartmentID") int departmentID,
                    @JsonProperty("NationInsuranceNumber") String nationalInsurance, @JsonProperty("BankAccountNumber") String bankAccountNumber, @JsonProperty("EmployeeAddress") String employeeAddress,
                    @JsonProperty("StartingSalary") float startingSalary) {
        this.setEmployeeID(employeeID);
        this.setEmployeeName(employeeName);
        this.setDepartmentID(departmentID);
        this.setNationalInsurance(nationalInsurance);
        this.setBankAccountNo(bankAccountNumber);
        this.setEmployeeAddress(employeeName);
        this.setStartingSalary(startingSalary);
    }
}
