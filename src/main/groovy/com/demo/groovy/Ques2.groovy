package com.demo.groovy

class Ques2 {

    static setToList() {

        def list=[1,2,3,4,4,5,6,1]

        //Both ways can be used to convert list to a set
        println(list.toSet());
        println(list as Set);

        println(list.unique()); //removing duplicate elements from list
    }


    static void main(String[] args) {

        setToList();
    }
}
