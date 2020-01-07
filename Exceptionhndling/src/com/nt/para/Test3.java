package com.nt.para;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args)  {
		int x=1,y=1,c=0;
		try{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	while(true)	
	{//Scanner sc= new Scanner(System.in);
	try
	{
		System.out.println("input 1st no.");
		//x=sc.nextInt();
		x=Integer.parseInt(br.readLine());
break;
	} 
	catch(NumberFormatException nfe)
	{
		//nfe.getMessage();
		//System.out.println(nfe);
	System.out.println("input only integer");	
	}}
	while(true)
	{
	try{
		System.out.println("input 2nd no.");
		//y=sc.nextInt();
		y=Integer.parseInt(br.readLine());
	
	try{
	c=x/y;
	System.out.println(c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("dont pass zero");
		continue;
	}
	break;
	}
	catch(NumberFormatException nfe)
	{
	System.out.println("catch");	
	}}}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally{

		//System.out.println(c);
	    System.out.println("hndle");
	}
	}}


