package Collectionprg;

import java.util.ArrayList;

public class Arraylistprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating array list
		ArrayList<String> arrlist =new ArrayList<String>();
		System.out.println("size of arraylist  " +arrlist.size());
		
		arrlist.add("D");
		arrlist.add("U");
		arrlist.add("K");
		arrlist.add("E");
		//arrlist.add(100);
		
		System.out.println("size of arraylist after adding element " +arrlist.size());
		
		System.out.println("Elements added in array list are " +arrlist);
		
		arrlist.remove("D");
		
		System.out.println("Check Elements after removing from arrlist " +arrlist);
		
		//check if system containg any value
		System.out.println("check system having value  K : " +arrlist.contains("K") );
		System.out.println("add value R in array list :" +arrlist.add("R"));
		
		
		System.out.println("List of all elements after removing elements: " + arrlist);
		
	}

}
