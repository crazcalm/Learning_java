package main.java.com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

/**
 * Created by marcus on 5/31/15.
 */
public class FixedCapacityStackOfStrings<Item> {

    Item [] a;
    int N;

    public FixedCapacityStackOfStrings(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){ return N == 0; }

    public void push(Item item){
        if(N == a.length){
            reSize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

    public int size(){ return N; }

    public boolean isFull(){ return a.length == N; }

    public void reSize(int max){
        Item[] temp = (Item[]) new Object[max];
        for(int i=0; i<N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public static void main(String[] args){
        FixedCapacityStackOfStrings<String> s;
        s = new FixedCapacityStackOfStrings<String>(5);
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
        System.out.println("isFull: " + s.isFull());
    }
}
