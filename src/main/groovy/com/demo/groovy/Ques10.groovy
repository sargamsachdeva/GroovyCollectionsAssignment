package com.demo.groovy

class Ques10 {

    static void findElement() {

        def range = 1..10;

        println ("First element: "+range.from);
        println ("Last element: "+range.to);
        println ("Second element: "+range.from.next());
    }


    static void main(String[] args) {

        findElement();
    }
}
