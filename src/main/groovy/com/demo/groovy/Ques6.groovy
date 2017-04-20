package com.demo.groovy

class Ques6 {

    static removeOddIndexedElements() {

        List list1 = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10]

        println(list1.get(0).getClass());
        println(list1.get(3).getClass());
        println(list1.get(5).getClass())
        println(list1.get(6).getClass())
    }


    static void main(String[] args) {

        removeOddIndexedElements();
    }

}