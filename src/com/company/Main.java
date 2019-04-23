package com.company;

import com.sun.media.sound.SoftTuning;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> numArray = new ArrayList<Double>();
        Random ranNum = new Random();

        for (int i = 0; i< 50; i++) {
            double rannum = ranNum.nextInt(10);
            numArray.add(rannum);
        }

        double findMe;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(numArray);
        System.out.println("Lets search for your number:");
        System.out.println("Enter a number: ");
        findMe = keyboard.nextDouble();



            double searchIndex = Collections.binarySearch(numArray, findMe);
            if (searchIndex >= 0) {
                System.out.println("Index found: " + searchIndex);
            } else {


            }



}
}
