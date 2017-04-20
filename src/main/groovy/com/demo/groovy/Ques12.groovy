package com.demo.groovy

class Ques12 {

    static void printAlphabets() {

        def range = 'a'..'z';

        println(range.subList(10,25));
    }


    static void main(String[] args) {

        printAlphabets();
    }
}
