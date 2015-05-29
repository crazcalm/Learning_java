package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

/**
 * Created by marcuswillock on 5/25/15.
 */
public class Problem20 {
    public static void main(String[] args){
        for(int i=0; i < 30; i++){
            System.out.print("case" + i + ": ");
            System.out.println(Problem20.stirling((double)i));
        }
    }
    public static double stirling(double n){
        if(n <= 1 ){
            return Math.log(1);
        }
        return Problem20.stirling(Math.log(n-1.0)) + Math.log(n);
    }
}
