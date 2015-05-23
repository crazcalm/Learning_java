package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem4 {
    public static void main(String[] args){

        String question = "What (if anything) is wrong with each of the following statements";
        int a,b,c;
        a = 1;
        b = 2;

        // Statement 1
        //if(a > b) then c =0;
        String answer1 = "The if without brackets syntax is incorrect.";

        // Statement 2
        if(a > b){ c = 0;}
        String answer2 = "Correct";

        // Statement 3
        if(a > b) c = 0;
        String answer3 = "Correct";

        // Statement 4
        //if (a > b) c = 0 else b = 0;
        String answer4 = "if else construct should use brackets";

        StdOut.println(question);
        StdOut.println("\nSee source code for statements\n");
        StdOut.println("0: " + answer1);
        StdOut.println("1: " + answer2);
        StdOut.println("2: " + answer3);
        StdOut.println("3: " + answer4);

    }
}
