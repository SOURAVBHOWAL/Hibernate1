package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.offer(2);
		pq.offer(7);
		pq.offer(8);
		pq.offer(9);
		pq.offer(10);
		pq.offer(3);
		
		System.out.println(pq);
		
	}

}
