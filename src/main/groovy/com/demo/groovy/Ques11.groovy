package com.demo.groovy

class Ques11 {

    static void printTable() {

        println("Table of 2")
        (1..10).each {num -> println( "$num * 2 = ${num*2}" )}

        println("======================================")
        println("Table of 12")
        (1..10).each {num -> println( "$num * 12 = ${num*12}" )}

    }

    static void main(String[] args) {

        printTable();
    }
}
