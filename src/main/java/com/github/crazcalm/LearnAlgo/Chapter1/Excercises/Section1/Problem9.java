package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

/**
 * Created by marcuswillock on 5/24/15.
 */
public class Problem9 {
    /*
    Question: Write a code fragment that puts the binary representation of a
    positive integer N into a String a.
     */
    public static void main(String[] args){
        /*
        Question: Write a code fragment that puts the binary representation
        of a positive integer N into a String a.
         */

        System.out.println(Integer.toBinaryString(3));
        System.out.println(Problem9.toBinaryString2(3));
    }
    public static String toBinaryString2(int n){
        if(n == 1){
            return "1";
        }else if(n == 0){
            return "0";
        }else{
            return Problem9.toBinaryString2(n / 2) + (n % 2) + "";
        }
    }
}
