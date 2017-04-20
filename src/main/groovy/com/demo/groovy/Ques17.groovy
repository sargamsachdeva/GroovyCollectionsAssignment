package com.demo.groovy

class Ques17 {

    static void returnNewMap() {

        Map map1 = ['sargam':23, 'priya':25, 'ankit':32, 'rahul':21];

        Map map2 = [1:'aa',2:'bb'];

        Map map3 = map1+map2;

        println(map3);
    }

    static void main(String[] args) {

        returnNewMap();
    }
}
