package com.array;

import java.util.Scanner;

class A{
	int a[],size;
	int sum=0;
	float avg;
	//input array element
	void inputArrayElements() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of elements");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter "+a.length+ "elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		
		}}
	//Display
	void displayArrayElements() {
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//Sum of array
    void arraySum() {
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		
		}
		System.out.println("Sum of Array elements is "+sum);
	}
    
    
	//Average of an array
    void averageArray() {
    	 avg= (float)sum/a.length;
    	 System.out.println("Average of all elements is "+avg);
    }
    
    //smallest element in an array
    void arrayLeast() {
    	int min=a[0];
    	for(int i=0;i<a.length;i++) {
    		if(min>a[i]) {
    			min=a[i];
    		}
    	}
    	System.out.println("Least element of an array is "+min);
    }
    
    //Largest element in an array
    void arraylarge() {
    	int max=a[0];
    	for(int i=0;i<a.length;i++) {
    		if(max<a[i]) {
    			max= a[i];
    		}
    	}
    	System.out.println("Largest element of an array "+max);
    }
    //Search elements
    void searchelements() {
    	int s, pos=-1;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter element");
    	s= sc.nextInt();
    	for(int i=0;i<a.length;i++) {
    		if(a[i]==s) {
    			pos=i;
    			//break;
    			//for same element more than 1
    			System.out.println("Successful search");
    			System.out.println(s+" found at position "+(pos+1));

    			
    		}
    		
    	}
    	//if(pos>=0) {
		//	System.out.println("Successful search");
			//System.out.println(s+" found at position "+(pos+1));
		//}
    	if(pos==-1){
			System.out.println("Unsuccessfull search");
			System.out.println(s+ " is not found in an array ");
		}
    }
    
    
}
public class Array {
public static void main(String[] args) {
	A obj= new A();
	obj.inputArrayElements();
	obj.displayArrayElements();
	obj.arraySum();
	obj.averageArray();
	obj.arrayLeast();
	obj.arraylarge();
	obj.searchelements();
}
}
