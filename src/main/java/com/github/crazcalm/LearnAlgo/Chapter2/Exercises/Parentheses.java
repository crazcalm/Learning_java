package com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import com.github.crazcalm.LearnAlgo.Chapter2.Exercises.Stack;
/**
 * Created by marcus on 6/3/15.
 */
public class Parentheses {
    private static Stack<String> list = new Stack<String>();
    private static boolean match = true;

    public static void main(String[] args){
        String one = "(){}[]";
        String two = ")({}";
        String three = "({}[])";
        String four = "((()))))";

        String[] testsCases = {one, two, three, four};

        System.out.println("Are these string balanced?\n");
        for(String i: testsCases){
            System.out.println(i + ": " + Parentheses.isBalanced(i));
        }
        System.out.print(three + ": " + Parentheses.isBalanced(three));
    }

    public static boolean isBalanced(String testing){
        /**
        This is a static method that takes a String a returns whether or not the
         the brackets -- (), {}, [] -- are balanced.
         */
        int limit = testing.length();
        int index = 0;

        // Need to make sure that the match boolean is reset before this method is ran.
        Parentheses.reset();

        while(index < limit && match){
            String s = testing.substring(index, index + 1);
            if(s.equals("(")||
                    s.equals("{")||
                    s.equals("[")
                    ){
                list.push(s);
            }
            else if(s.equals(")") ||
                    s.equals("}") ||
                    s.equals("]")
                    ){
                Parentheses.check(s);
            }
            index++;
        }

        return Parentheses.answer();
    }

    private static void check(String item){
        if(list.isEmpty()){
            match = false;
        }
        else{
            String temp = list.pop();

            if(temp.equals("(") && item.equals(")")) {

            }
            else if(temp.equals("{") && item.equals("}")){

            }
            else if(temp.equals("[") && item.equals("]")){

            }
            else{
                match = false;
            }
        }

    }

    private static boolean answer(){
        boolean result = false;

        if(list.isEmpty() && match){
            result = true;
        }
        return result;
    }

    private static void reset(){
        match = true;
    }
}
