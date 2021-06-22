package jai_package;

import java.util.Scanner;

public class Reminder {

	public static void main(String[] args) {
		
		int s;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		if (s<1)
		System.out.println(s);
		else {
	 int i = Math.floorMod(s,5);
	 int j = Math.floorMod(s,3);
    if (i==0 && j==0)
    	System.out.println("fizzbizz");
    else
     if (j==0)
        System.out.println("bizz");
     else 
     if (i==0)
    	 System.out.println("fizz");
     else
    	 System.out.println(s);
	}
	}
}
