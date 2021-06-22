package jai_package;

import java.util.Arrays;



public class jai_class {

	
	public void status()
	{
	System.out.println("Hi this is Jai's class");
	}
	 
	
	public int firstandlast(int[] a)
	{
		int first;
		int last;
		first=a[0];
		return first;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] Array1;
		
		Array1=new int[] {1,2,3,4,5};
		
		String s="Blitzkrieng";
		
		s=s.concat(" super");
		s=s.replace('r','o');

		
		int l=Array1.length;
		jai_class jai= new jai_class();
		jai.status();
		
		int f=jai.firstandlast(Array1);
		 int last=Array1[l-1];
		 System.out.println("first element is"+f+"Last element is"+last);
		 
		 boolean bs=jai.binarySearch(Array1,3);
		 int[] Array2=Array1.clone();
		 bs=jai.binarySearch(Array2, 3);
		 boolean be=Array1==Array2;
		be=jai.isequal(Array1, Array2);
	System.out.println("Element found="+bs+ be);
	System.out.println("String output   "+s);
	
	}


	public boolean binarySearch(int[] array1, int i) {
		boolean b=false;
		
		for (int j=0;j<(array1.length-1)&&b==false;j++) {
			b=array1[j]==i;
		}
		return b;
	}
	
   public boolean isequal(int[] array1,int[] array2) {
	   boolean b=false;
	   if(array1.length==array2.length)
	   {
		   for (int j=0;j<(array1.length-1)&&b==false;j++) {
				 b=array1[j]==array2[j];
	   }
	   }
	   return b;
	   }
   }

