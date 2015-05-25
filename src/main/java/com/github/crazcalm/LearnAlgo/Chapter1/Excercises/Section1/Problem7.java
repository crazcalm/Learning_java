package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem7 {
    public static void main(String[] args){
        Problem7.code1();
        Problem7.code2();
        Problem7.code3();
    }

    public static void code1(){
        StdOut.print("code1 answer: ");
        double t = 9.0;

        while (Math.abs(t - 9.0/t) > .001){

            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    public static void code2(){
        StdOut.print("code2 answer: ");
        int sum = 0;

        for(int i=0; i < 5; i++){
            for(int j=0; j <  i; j++){

                sum++;
            }
        }

        StdOut.println(sum);
    }

    public static void code3(){
        StdOut.print("code3 answer: ");
        int sum = 0;
        for(int i=1; i < 17; i *=2){
            for(int j=0; j < 1000; j++){
                sum++;
            }
        }

        StdOut.println(sum);
    }

}
