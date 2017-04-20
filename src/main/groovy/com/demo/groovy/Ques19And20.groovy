package com.demo.groovy

class Ques19And20 {

    static void main(String[] args) {

        Map map = ['1' : 2, '2' : 3, '3' : 4, '2':5]

        println(map['2']);//overrides the previous value

        println map.containsKey('1')
        println map.containsKey('5')
    }
}
