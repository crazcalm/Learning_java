package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

/**
 * Created by marcuswillock on 5/25/15.
 */
public class Problem18 {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.print("case" + i + "; ");
            System.out.println(Problem18.mystery(3,i));
        }
    }
    public static int mystery(int a, int b){
        if(b == 0){
            return 0;
        }if(b%2 == 0){
            return mystery(a+a, b/2);
        }
        return mystery(a+a, b/2) + a;
    }
}
