package main.java.com.github.crazcalm.LearnAlgo.Chapter2.Exercises;

import java.util.Iterator;
import java.util.NoSuchElementException

/**
 * Created by marcus on 5/29/15.
 */
public class Queue implements Iterator<Item> {

    private Node first; // Links the least recently added Node
    private Node last;  // links the most recently asdded Node
    private int N;  // Node count

    private class Node{
        // A private class for Nodes
        Item item;
        Node next;
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
