package main.java.com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Created by marcuswillock on 5/29/15.
 */
public class Stack <Item> implements Iterable<Item> {

    public static void main(String[] args){
        Stack <Integer> test = new Stack<Integer>();

        System.out.println("empty?" + test.isEmpty());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        System.out.println("add 1,2,3,4,5");

        System.out.println("pop: " + test.pop());

        for(Integer i: test){
            System.out.println("size: " + test.size());
            System.out.println("current node: " + i);
        }

        int limit = test.size();
        for(int z=0; z<limit; z++){
            System.out.println("pop: " + test.pop());
            System.out.println("size: " + test.size());
        }

    }

    private class Node{
        // nested class to define nodes
        Item item;
        Node next;
    }

    private Node first; // Top of the stack (most recently added node)
    private int N;  // Number of items

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        // Add item to the top of the stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        // Remove item from top of stack
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator()  { return new ListIterator();  }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    // See pages 155 for iterator() implementation
    // See page 147 for test client main().

}
