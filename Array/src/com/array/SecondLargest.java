package com.array;

import java.util.Scanner;

public class SecondLargest {
public static void bubbleSort(int []arr) {
	     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr.length-i-1;j++) {
    		 if(arr[j]>arr[j+1]) {
    			 int temp=arr[j];
    			 arr[j]= arr[j+1];
    			 arr[j+1]=temp;
    		 }
    	 }
    	      }
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array");
	int n=sc.nextInt();
	int []arr= new int[n];
	System.out.println("Enter elements in an array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	bubbleSort(arr);
	if(n<2) {
		 System.out.println("Array does not have a second largest number");
	 }else {
		 System.out.println("The second largest number is: "+arr[n-2]);
	 }


}
	 
	
}
	
     
