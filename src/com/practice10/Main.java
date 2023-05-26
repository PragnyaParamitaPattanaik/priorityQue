package com.practice10;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PriorityQueue<String>queue=new PriorityQueue<String>();
        queue.add("Ama");
        queue.add("Vid");
        queue.add("san");
        queue.add("deb");
        System.out.println("head"+queue.element());
        System.out.println("head"+queue.peek());
        System.out.println("Iterating the queue elements");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements");
        Iterator<String>itr2= queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
