package Collectionprg;

import java.util.LinkedList;

public class Linklisremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>();  
	      ll.add("Ajay");  
	      ll.add("Chitaz");  
	      ll.add("Bintu"); 
	      ll.add("Bintu");
	      ll.add("Binu");
	      System.out.println(ll);
	      System.out.println(ll.remove());
	      System.out.println(ll);
	      System.out.println(ll.remove(0));
	      System.out.println(ll);
          System.out.println(ll.removeAll(ll));
	      System.out.println(ll);
	      System.out.println(ll.add("Jaya"));
	      System.out.println(ll.add("Aniket"));
	      System.out.println(ll.add("Suyash"));
	      System.out.println(ll.add("Jaya"));
	      System.out.println(ll);
	      System.out.println(ll.removeFirst());
	      System.out.println(ll);
	      System.out.println(ll.removeFirstOccurrence("Jaya"));
	      System.out.println(ll);
	      System.out.println(ll.removeLast());
          System.out.println(ll);
	      System.out.println("List="+ll.removeLastOccurrence("Jaya"));
	      System.out.println("List="+ll);

	}

}
