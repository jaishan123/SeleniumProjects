package jai_package;

import java.lang.reflect.Array;


public class IPaddress extends Message_Holder{
	

	
	 int[] ipaddress = new int[]{1,2,3,15,5,6,7,8,9};

	 Message_Holder m=new Message_Holder();
	public String getMessage()
			{
	int k=m.getAddress();
	int l=ipaddress.length;
	String h;
     int i=0;
     
     do 
		{
	
	if ((int)ipaddress[i]==k) {
		System.out.println("IP address found");
		m.setMessage("jai");
		h=m.getMessage();
	   System.out.println("the message is"+h);
	   return h;
	   
	}
	i++;}
	while (i<l);
		
		//System.out.println("The address is not found"+ipaddress[i]+k);
	
		
	return "Address not found";}
}
