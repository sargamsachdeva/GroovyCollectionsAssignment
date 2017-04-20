package com.demo.groovy

class Ques4 {

    static findCommonElements() {

        List list1 = [11,12,13,14];
        List list2 = [15,16];

        println(list1.intersect(list2));

        if(list1.disjoint(list2))
           println("Both lists does not have common elements");

        else
          println("Both lists have common elements");
    }


    static void main(String[] args) {

        findCommonElements();
    }
}
