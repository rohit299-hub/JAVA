package Collectionprg;

import java.util.LinkedList;

public class Linklistprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> ll=new LinkedList<String>();  
	      ll.add("A");  
	      ll.add("C");  
	      ll.add("B");  
	      System.out.println(ll);
	      System.out.println(ll.offer("T"));
	      System.out.println(ll);
	      System.out.println(ll.offerFirst("U"));
	      System.out.println(ll);
	      System.out.println(ll.offerLast("E"));
System.out.println(ll);
	      System.out.println(ll.peek());
	      System.out.println(ll.peekLast());
	      System.out.println(ll.poll());
	      System.out.println(ll);
	      System.out.println(ll.size());
	      System.out.println(ll.pollFirst());
	      System.out.println(ll);
	      System.out.println(ll.pollLast());
	      System.out.println(ll);

	}

}
