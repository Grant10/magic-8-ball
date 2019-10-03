package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //declare faze
        Scanner Keyboard;
    int testing;
    String question;

    //initialization faze
    Keyboard = new Scanner(System.in);
        System.out.println("type a number 1-100 and give me a question");
    int firstNumber = Keyboard.nextInt();
    if(10>=firstNumber&&firstNumber >0) {
        System.out.println("the outlook looks very good");
    }
            if (20>=firstNumber&&firstNumber >11){
            System.out.println("The outlook doesn't look very good");
        }
     if(30>=firstNumber&&firstNumber >21) {
        System.out.println("yes");
     }
     if(40>=firstNumber&&firstNumber >31){
        System.out.println("That will happen in the near future");
     }
    if(50>= firstNumber&&firstNumber >41){
        System.out.println("That is very unlikely");
    }
    if(60>=firstNumber&&firstNumber >51){
        System.out.println("no");
    }
    if(70>=firstNumber&&firstNumber >61){
        System.out.println("probably");
    }
    if(80>=firstNumber&&firstNumber >71){
        System.out.println("probably not");
    }
    if(90>=firstNumber&&firstNumber >81){
        System.out.println("")
    }

    }
}
