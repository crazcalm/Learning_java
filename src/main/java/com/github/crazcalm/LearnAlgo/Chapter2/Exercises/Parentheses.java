package com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import com.github.crazcalm.LearnAlgo.Chapter2.Exercises.Stack;
/**
 * Created by marcus on 6/3/15.
 */
public class Parentheses {
    public static Stack<String> list = new Stack<String>();
    public static boolean match = true;

    public static void main(String[] args){

        Parentheses test = new Parentheses();
        String testing = "[()]{}{[()()]()}";
        int limit = testing.length();
        int index = 0;

        System.out.println();


        while(index < limit && match){
            String s = testing.substring(index, index + 1);
            if(s.equals("(")||
                    s.equals("{")||
                    s.equals("[")
                    ){
                list.push(s);
                System.out.print("\n\nPushed: " + s);
            }
            else if(s.equals(")") ||
                    s.equals("}") ||
                    s.equals("]")
                    ){
                test.check(s);
            }
            index++;
        }

        if(test.answer()){
            System.out.println("\n\nTrue");
        }else{
            System.out.println("\n\nFalse");
        }
    }

    public void check(String item){
        if(list.isEmpty()){
            match = false;
        }
        else{
            String temp = list.pop();
            System.out.println("\n\nPopped: " + temp);

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

    public boolean answer(){
        boolean result = false;

        if(list.isEmpty() && match){
            result = true;
        }
        return result;
    }
}
