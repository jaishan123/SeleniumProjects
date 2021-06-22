package jai_package;

import java.util.Scanner;


import java.math.*;
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter Loan Amount:");
		Scanner sc=new Scanner(System.in);
		int loan_Amount=(int)sc.nextInt();
		System.out.println("Enter the duration:");
		int loan_duration=(int)sc.nextInt();
		final float loan_Interest=7.9f;
	
	
	
	//formula EMI=[P*R*(1+R)N]/[(1+R)N-1]
	
	int N=loan_duration*12;
	float R=loan_Interest/(100*12);
	double EMI;
	int P=loan_Amount;
	double ret=pow((R+1),N);
	double ter=pow((R+1),(N-1));
	
	EMI=P/N+(P*R*ret)/ter;
	System.out.println(EMI+"is the EMI");
	}
	//EMI=(P*R*(1+R)
	private static double pow(float R,int N)
	{
		double temp=1;
		for (int i=0;i<N;i++) {
			
			temp=temp*R;
		}
			return temp;
	}
	
	
	}

	
