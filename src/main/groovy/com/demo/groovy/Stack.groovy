package com.demo.groovy

class Stack {

    String name;
    int age;

    Stack(String name, int age) {

        this.name = name
        this.age = age
    }


    @Override
    public String toString() {
        return "Stack{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
