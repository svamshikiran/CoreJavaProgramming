package com.java.basic;
import java.util.Scanner;

public class LargestandSmallest {

	public static void main(String[] args) {
		  int smallest = 0;
		    int large = 0;
		    int num;
		    System.out.println("enter the number");
		    Scanner input = new Scanner(System.in);
		    int n = input.nextInt();
		    System.out.println("enter the list");
		    
		    for (int i = 0; i < n; i++) {
		        num = input.nextInt();
		        //smallest = num;//
		        if (num > large) {
		            large = num;
		        }
		        if (num < smallest) {
		            smallest = num;
		        }
		    }
		    System.out.println("the largest is:" + large);
		    System.out.println("Smallest no is : " + smallest);
		}
	}


