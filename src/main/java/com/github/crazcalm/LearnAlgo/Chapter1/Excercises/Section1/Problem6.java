package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem6 {
    public static void main(String[] args){

        int f = 0;
        int g = 1;
        for(int i=0; i < 15; i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
