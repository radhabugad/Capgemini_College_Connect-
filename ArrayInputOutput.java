package com.edu.array;

import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
int a[]=new int[5]; //default values of array 0
		
		
	
		Scanner scanner = new Scanner(System.in);
		//input array elements
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		
		//Display
		System.out.println("Array elements are ");
		/*for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		for(int i : a) {
			System.out.println(i);
		}

	}

}

