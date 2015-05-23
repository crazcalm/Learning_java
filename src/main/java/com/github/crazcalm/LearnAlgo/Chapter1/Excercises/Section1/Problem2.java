package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem2 {
    public static void main(String[] args){

        String question = "Give the type an value of each of the following expressions:\n";

        String ex1 = "(1 + 2.236)/2";
        String ex2 = "1 + 2 + 3 + 4.0";
        String ex3 = "4.1 >= 4";
        String ex4 = "1 + 2 + \"3\"";

        String[] expressions = {ex1, ex2, ex3, ex4};

        for(int i=0; i<4; i++){
            StdOut.println(i + ": " + expressions[i]);
        }

        double answer1 = (1 + 2.236)/2;
        double answer2 = 1 + 2 + 3 + 4.0;
        boolean answer3 = 4.1 >= 4;
        String answer4 = 1 + 2 + "3";

        StdOut.println("\nAnswers:\n");
        StdOut.println("0: double (" + answer1 +")");
        StdOut.println("1: double (" + answer2 +")");
        StdOut.println("2: boolean (" + answer3 +")");
        StdOut.println("3: String (" + answer4 +")");
    }
}
