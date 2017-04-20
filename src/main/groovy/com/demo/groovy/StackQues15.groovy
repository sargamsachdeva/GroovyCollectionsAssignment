package com.demo.groovy

class StackQues15 {

    static void stackOperations() {

        List<Stack> list = new ArrayList<>();

        list.push(new Stack("aa",23));
        list.push(new Stack("bb",21));
        list.push(new Stack("dd",54));
        list.push(new Stack("ee",30));

        println("List after pushing elements: "+list);

        println("=======================")

        list.pop();
        println("List after popping an element: "+list);

        println("=======================");

        println ("Retrieving top element: " +list.last());


    }


    static void main(String[] args) {

        stackOperations();
    }
}
