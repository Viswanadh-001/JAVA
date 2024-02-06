package Collection_Framework.Que;

import java.util.PriorityQueue;

public class Priority_2 {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		PriorityQueue pq2=new PriorityQueue();
		
		pq1.add("A");
		pq1.add("B");
		pq1.add("C");
		pq1.add("D");
		System.out.println(pq1);
		System.out.println(pq2);

		pq2.add("A");
		pq2.add("B");
		pq2.add("C");
		pq2.add("D");
		System.out.println(pq2.poll());
		System.out.println(pq2);
	}
}
