package com.demo.groovy

class Ques13 {

    static void main(String[] args) {

        String s = "abcdeaaaabbbbcccccdd"
        println getOccurences(s, 'a'.charAt(0))
    }

    static int getOccurences(String s, Character c){

        int counter=0;
        s.each { chrctr -> if(chrctr.charAt(0)==c) counter++ }
        return counter;
    }
}