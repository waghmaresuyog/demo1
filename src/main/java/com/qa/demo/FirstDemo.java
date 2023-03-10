package com.qa.demo;

public class FirstDemo {

	public static void main(String[] args) {
		
				
		String input = "abacbca";
		  char search1 = 'a';             // Character to search is 'a'.
		  char search2 = 'b';
		  char search3 = 'c';
		  int count=0;
		  int i=0;
		  for( i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search1 )
		    	  count++;
		  }
		 
		  
		  if (count==2)
	      {
	    	  System.out.println("All Characters Have Equal Number of Occurrences");
	      }
	      else
	      {
	    	  System.out.println("All Characters Have Deffrent  Number of Occurrences");
	      }
		  System.out.println("The Character '"+search1+"' appears "+count+" times.");
		  System.out.println("The Character '"+search2+"' appears "+count+" times.");
		  System.out.println("The Character '"+search3+"' appears "+count+" times.");
	  }   
        
}

