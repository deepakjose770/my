package com.deepak.common;

public class TestException {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "deepak";
        employee.age = 20;
        employee.address = "abcd";

        aMethod(employee);
        employee.toString();

        //System.out.println("The employee is " + employee.toString());

    }

    private static void aMethod(Employee employee) {
        employee.name = "jose";
        employee.age = 40;
        employee.address = "xyz";
        try {
            bMethod(employee);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    private static void bMethod(Employee employee) {
        employee.name = "diya";
        employee.age = 60;
        employee.address = "yhn";
        int b = 6/0;
    }
}
