package com.demo.groovy

class Employee {

    String name;
    int age;
    def salary;

    Employee(String name,int age,def  salary) {

        this.name=name;
        this.age=age;
        this.salary=salary;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
