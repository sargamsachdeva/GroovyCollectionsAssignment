package com.demo.groovy

class Ques7 {

    static sortInDescending() {

        List list1 = [14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35];

        println("Sorting list in descending order having distinct elements");
        println list1.sort().reverse().unique();
    }


    static void main(String[] args) {

        sortInDescending();
    }

}