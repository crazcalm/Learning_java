package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.*;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem1 {

    public static void main(String[] args){
        String question = "Give the value of each of the following expressions:";
        StdOut.println(question + "\n");

        String ex1 = "(0 + 15)/2";
        String ex2 = "2.0e-6 * 100000000000.1";
        String ex3 = "true && false || true && true";

        String[] questions = {ex1, ex2, ex3};

        for(int i=0; i < 3; i++) {
            StdOut.println(i + ": " + questions[i]);
        }

        int answer1 = (0 + 15)/2;
        double answer2 = 2.0e-6 * 100000000000.1;
        boolean answer3 = true && false || true && true;

        StdOut.println("Answers: " + "\n");

        StdOut.println("0: int ("+ answer1 + ")");
        StdOut.println("1: double (" + answer2 + ")");
        StdOut.println("2: boolean (" + answer3 + ")");
    }
}
