package com.kishore;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	
	public static void main(String[] args) {
		Queue<String> myqueue= new PriorityQueue<>();
		myqueue.add("apple");
		myqueue.add("offer");
		myqueue.add("cat");
		myqueue.add("dog");
		
		myqueue.add("buffalo");
		
		myqueue.add("pot");
		
		myqueue.add("yak");
		
		for(Iterator<String> iterator = myqueue.iterator();
		iterator.hasNext();){
		
			myqueue.poll();
			
			if(myqueue.size()==2)
			{
				break;
				
			}
			
		}
	    
	    System.out.println(myqueue);
	}
}
