package main.java.com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

/**
 * Created by marcus on 5/31/15.
 */
public class FixedCapacityStackOfStrings {

    String[] a;
    int N;

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){ return N == 0; }

    public void push(String item){
        a[N++] = item;
    }

    public String pop(){
        return a[--N];
    }

    public int size(){ return N; }

    public static void main(String[] args){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        String[] test = {"to", "be", "or", "to", "-", "be",
                "-", "-", "that", "-", "-", "-", "is"};

        for(String item: test){
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                System.out.print(s.pop() + " ");
            }
        }

        System.out.println("(" + s.size() + " left on stack)");
    }
}
