package com.array;

import java.util.Scanner;

public class Arr {
	
	int a[] =new int[5];
	public static void main(String[] args) {
		//int a[] = {23,45,67,56,34};
		
        
		//for(int i=0; i<a.length;i++) {
			//System.out.println(a[i]);
		//}
		//int a[] =new int[5];
		//a[0]=20;
		//a[1]=30;
		//a[2]=40;
		//a[3]=50;
		//a[4]=60;
		//for(int i=0;i<a.length;i++) {
			//System.out.println("Element of an array are "+a[i]);
		//}
		
		//Print last a[]5 to first a[0]
		//for(int i=a.length-1;i>=0;i--) {
	    //		System.out.println(a[i]);
		//}
		
		
		//For input
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter elements of an array");
		//for(int i=0;i<a.length;i++) {
			//a[i]=scanner.nextInt();
			
		//}
		//for(int i=0;i<a.length;i++) {
			//System.out.println("Elements of an array "+a[i]);
			
		//}
		
		
		//For taking size from user
		int a[], size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Elements of an array are "+a[i]);
		}
}
       
}
