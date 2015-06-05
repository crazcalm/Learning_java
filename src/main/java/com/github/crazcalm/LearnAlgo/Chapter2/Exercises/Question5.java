package com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import com.github.crazcalm.LearnAlgo.Chapter2.Exercises.Stack;

/**
 * Created by marcus on 6/5/15.
 */
public class Question5 {

    public static void main(String[] args){

        Question5 test = new Question5();
        test.codeSnippet(50);
    }

    public void codeSnippet(int N){

        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0){
            stack.push(N % 2);
            N = N / 2;
        }
        for( int i: stack){
            System.out.print(i);
        }
        System.out.println();
    }

}
