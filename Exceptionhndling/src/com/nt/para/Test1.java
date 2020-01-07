package com.nt.para;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=0,y=0,c=0;
		try
		{
			System.out.println("input 1st number");
			 try {
				x=Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("input 2nd number");
			 try {
				y=Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 c=x/y;
			System.out.println("inside try");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("not divided by zero");
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("inside another catch");
		}

	}

}
