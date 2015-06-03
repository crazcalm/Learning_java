package com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by marcus on 5/29/15.
 */
public class Queue <Item> implements Iterable<Item> {

    private Node first; // Links the least recently added Node
    private Node last;  // links the most recently added Node
    private int N;  // Node count

    public static void main(String[] args){
        Queue<Integer> test = new Queue<Integer>();

        System.out.println("isEmpyt?: " + test.isEmpty());

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);

        System.out.println("size: " + test.size());
        System.out.println("dequeue: " + test.dequeue());

        for(Integer i: test){
            System.out.println("item: " + i.toString());
        }

        int limit = test.size();

        for(int z = 0; z<limit; z++){
            System.out.println("dequeue: " + test.dequeue());
            System.out.println("size: " + test.size());
            System.out.println("isEmpty: " + test.isEmpty());
        }
    }

    private class Node{
        // A private class for Nodes
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item){
        // Adds an item to the end of the list
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else
            oldlast.next = last;
        N++;
    }

    public Item dequeue(){
        // Removes an item from the beginning of the list
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
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
}
