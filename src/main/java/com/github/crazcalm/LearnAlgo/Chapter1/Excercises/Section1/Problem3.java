package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem3 {
    public static void main(String[] args){
        String question = "Write a program that takes three integers command-line arguments" +
                            "and prints equal if all the are equal and not equal otherwise";

        if (args.length < 3){
            StdOut.println("There is not enough args!");
        }else{
            StdOut.println("args list: ");
            for(String i: args){
                StdOut.println(i);
            }

            StdOut.print("\nAsnwer: ");
            if(args[0] == args[1] && args[1] == args[2]){
                StdOut.println("equal");
            }else{
                StdOut.println("not equal");
            }
        }


    }
}
