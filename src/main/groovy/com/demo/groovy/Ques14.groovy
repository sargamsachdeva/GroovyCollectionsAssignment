package com.demo.groovy

class Ques14 {

    static void printNumbers() {

        def range = 1..100;

        range.findAll{ element ->

            if(element % 3 == 0 && element % 5 == 0)
                element="fizzBuzz"

            else if(element % 3 == 0)
                element="fizz"

            else if(element % 5 == 0)
                element = "buzz"
            println(element)
        }

    }


    static void main(String[] args) {

        printNumbers();
    }
}
