package com.github.crazcalm.LearnAlgo.Chapter1.Excercises.Section1;

/**
 * Created by marcuswillock on 5/25/15.
 */
public class Problem11 {
    public static void main(String[] args){
        /*
        Question: Write a code fragment that prints the contents of a two dimensional boolean
        array using * to represent true and a space to represent false. Include row and column numbers.
         */
        boolean [][] test = {{true, false, true}, {false, false, false}, {true, true, true}};

        System.out.println(Problem11.booleanString(test));
    }
    public static String booleanString(boolean[][] list){

        for(int i=0; i < list.length; i++){
            for(int j=0; j < list[i].length; j++){
                System.out.print("row/column: (" + i + "," + j + "): ");

                if(list[i][j]){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
        }

        return "";
    }
}
