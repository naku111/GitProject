package priorityQueue;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
	PriorityQueue<Integer> s=new PriorityQueue<>();
	s.add(1);
	s.add(8);
	s.add(5);
	System.out.println(s);
	s.remove();
	System.out.println(s);
	}
}
