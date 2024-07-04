package com.soe.mit;

public class Employee implements Comparable<Employee> {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;
    public Employee(){
        super();
    }

    public Employee(String employeeName, int employeeId, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

//
//    @Override
//    public int compareTo(Employee e1) {
//        return this.getEmployeeId()-e1.getEmployeeId();
//    }

    @Override
    public int compareTo(Employee emp) {
        return this.getEmployeeName().compareTo(emp.getEmployeeName());
    }

}
