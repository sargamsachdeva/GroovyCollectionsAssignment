package com.demo.groovy

class EmployeeQues22 {

    int EmployeeNumber
    String Name
    int Age
    String DepartmentName
    Double Salary

    EmployeeQues22(int employeeNumber, String name, int age, String departmentName, Double salary) {
        EmployeeNumber = employeeNumber
        Name = name
        Age = age
        DepartmentName = departmentName
        Salary = salary
    }


    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeNumber=" + EmployeeNumber +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
