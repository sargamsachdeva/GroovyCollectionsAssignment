package com.demo.groovy

class Ques3 {


    static findNewList() {

        List list1 = [11,12,13,14];
        List list2 = [13,14,15];

        List newList = list1 - list2;

        println(newList);
    }


    static void main(String[] args) {

        findNewList();
    }
}
