package Collection_Framework.Que;

import java.util.PriorityQueue;

public class Priority_1 {

	public static void main(String[] args) {
		PriorityQueue pq1=new PriorityQueue();
		PriorityQueue pq2=new PriorityQueue();
		System.out.println(pq1.add("A"));
		System.out.println(pq1.add("B"));
		System.out.println(pq1.add("C"));
		
		System.out.println(pq2.peek());
		//System.out.println(pq2.element());
		System.out.println(pq1);
		System.out.println(pq2);

	}

}
