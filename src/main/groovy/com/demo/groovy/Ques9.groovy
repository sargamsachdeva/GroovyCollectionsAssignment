package com.demo.groovy

class Ques9 {

    static void splitAndTokenize() {

        String string = "this string needs to-be split";

        println(string.tokenize());
        println(string.tokenize("-"));

        println(string.split());
        println(string.split("-"))

        String str = "are.you.trying.to.split.me.mister?"
        println str.tokenize(".")
        println str.split(".")

    }


    static void main(String[] args) {

        splitAndTokenize();
    }
}
