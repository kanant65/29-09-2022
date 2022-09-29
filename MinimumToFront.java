package com.collection_test.bll;
import java.util.ArrayList;

public class MinimumToFront extends MinimumFront{

	public static void main(String[] args) {
		//{3, 8, 92, 4, 2, 17, 9} 
		
			    ArrayList<Integer> origList = new ArrayList<Integer>(); //creating an integer list 
			    
			    //adding the values in the list
			    origList.add(3);
			    origList.add(8);
			    origList.add(92);
			    origList.add(4);
			    origList.add(2);
			    origList.add(17);
			    origList.add(9);
			    
			    //printing the original list
			    System.out.println("Original List :-");
			    System.out.println(origList);
			   
			    //printing the list after performing minToFront() method
			    System.out.println("List after performing minToFront method :-");
			    minToFront(origList); //applying minToFront() method
			    System.out.println(origList);
			    	    
	 }

}
