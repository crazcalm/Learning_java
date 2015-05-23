package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created by marcuswillock on 5/23/15.
 */
public class Problem5 {
    public static void main(String[] args){
        String question = "Write a code fragment that prints true if " +
                "the double variable x and y are both strictly between " +
                "0 and 1 and false otherwise.";

        int lowerBound = 0;
        int upperBound = 1;
        double[] nums = {0.0, 0.1, 0.9, 1.2, 1.0, 0.000001, 0.99999999, 0.5};

        for(int i=0; i < 7 - 1; i++){
            StdOut.print("doubles: ");
            StdOut.println("(" + nums[i] + ", " + nums[i+1] +  ")");

            StdOut.print("Answer: ");
            if(Problem5.isDoubleInInterval(nums[i], nums[i+1], lowerBound, upperBound)){
                StdOut.println("true\n");
            }else{
                StdOut.println("false\n");
            }
        }
    }

    public static boolean isDoubleInInterval(double a, double b, int lowBound, int upBound){
        boolean answer = false;

        if ((lowBound < a && a < upBound) &&
                (lowBound < b && b < upBound)){
            answer = true;
        }

        return answer;
    }
}
