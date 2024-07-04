package com.soe.mit;

import java.util.ArrayList;
import java.util.Collections;

public class DemoOnEmpList {
    public static void main(String[] args) {

        //create an arraylist of employees
        ArrayList<Employee> empList=new ArrayList<Employee>();

        // add emplyee objects
        Employee e1=new Employee("Kavita",205,90000);
        Employee e2=new Employee("Keya",202,85000);
        Employee e3=new Employee("Liz",203,70000);

        //add employee objects to arraylist
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        //enhanced for loop
        Collections.sort(empList);
        for(Employee emp:empList)
            System.out.println(emp);

    }
}
