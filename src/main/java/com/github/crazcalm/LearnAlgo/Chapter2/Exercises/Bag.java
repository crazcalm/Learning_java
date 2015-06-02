package main.java.com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by marcus on 5/31/15.
 */
public class Bag <Item> implements Iterable<Item>{

    private class Node{
        Item item;
        Node next;
    }

    private Node first;
    private int N;

    public static void main(String[] args){
        Bag<Integer> test = new Bag<Integer>();

        System.out.println("isEmpty: "+ test.isEmpty());
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        for(Integer i: test){
            System.out.println("value: " + i);
        }

        System.out.println("size: " + test.size());
        System.out.println("isEmpty: "+ test.isEmpty());
    }

    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){ return first == null; }

    public Iterator<Item> iterator() {return new ListIterator();}

    public class ListIterator implements Iterator<Item>{
        private Node current = first;

        public boolean hasNext(){
            return current != null;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }

        public Item next(){
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
