package looping;

import java.util.Scanner;

public class If {
	
	void m7()
	{
	     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18)
		System.out.println("You are eligible to vote");
		else
	    System.out.println("You are not eligible to vote");		
			
	}
	public static void main(String[] args)
	{
		If  obj1=new If();
		obj1.m7();
		 System.out.println("Hai");
	}	

}
