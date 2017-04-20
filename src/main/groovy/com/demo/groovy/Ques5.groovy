package com.demo.groovy

class Ques5 {

    static removeOddIndexedElements() {

        List list1 = [11, 12, 13, 14];
        List newList = [];

        list1.eachWithIndex { int element, int index ->


            if (index % 2 != 0) {

                newList.add(element);
            }
        }
        println(newList)
    }


    static void main(String[] args) {

        removeOddIndexedElements();
    }

}