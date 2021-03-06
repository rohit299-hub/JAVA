package Collectionprg;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hashst= new HashSet<String>();
		
		hashst.add("big data");
		hashst.add("Java");
		hashst.add("Python");
		hashst.add("AngularJS");
		hashst.add("Cobol");
		hashst.add("RPA");
		
		//Adding duplicate element wil be ignore
		hashst.add("big data");
		hashst.add("Java");
		
		System.out.println(hashst);
		
		//check hashset containg any specific elemment
		
		String hashst1="Python";
		if(hashst.contains(hashst1))
		{
			System.out.println(hashst1 + " is present in list");
		}else
		{
			System.out.println(hashst1 + " is not present in list");
		}
		
		//remove element from course
		
		hashst.remove("Java");
		
		System.out.println("list after removing the java:");
		Iterator<String> i = hashst.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//creating another object of hashset
		
		HashSet<String> hashstnew = new HashSet<String>();
		
		hashstnew.add("Machine learning");
		hashstnew.add("test1");
		hashstnew.add("test2");
		hashstnew.add("test3");
		hashstnew.add("test4");
		hashst.add("test5");
		
		System.out.println(hashstnew);
		
		hashst.removeAll(hashstnew);
		
		System.out.println("after invoking removeall method course left"  + hashst);
		
		System.out.println(hashst);
		
		//retain all element  from hashst which are specified in hashstnew
		hashst.retainAll(hashstnew);
	
		
		System.out.println("Hashset after "+ " retainAll() operation : " + hashstnew);
		System.out.println(hashst);
		System.out.println(hashstnew	);
	
		
		
		//remove all the set 
		/*hashst.clear();
		System.out.println("after invoking clr methods " +hashst);*/
		
		
		
		
		
		
		
	}

}
