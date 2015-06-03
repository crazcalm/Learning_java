package com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import com.github.crazcalm.LearnAlgo.Chapter2.Exercises.Stack;
/**
 * Created by marcus on 6/3/15.
 */
public class Parentheses {
    private Stack<String> list;
    private boolean match = true;

    public static void main(String[] args){

        Parentheses test = new Parentheses();
        int limit = args.length;
        int index = 0

        while(index < limit && match){
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
                test.check(s);
            }
        }
    }

    public void check(String item){
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

    public boolean answer(){
        return true;
    }
}
