package com.array;

	import java.util.Scanner;

	  class Arr2 { 
		  int sum=0;
		  int max=0;
		  int[] a=new int[5]; 
		   void input() {  
		  Scanner sc= new Scanner(System.in); 
		  System.out.println("enter array elements");
		  for(int i=0;i<a.length;i++) {
			  a[i]=sc.nextInt();
		  } 
	    }
	       void display(){
	    	 for(int i=0;i<a.length;i++) {
	    		 System.out.println(a[i]);
	    	 }
	     }
	     void sum() {
	    	 for(int i=0;i<a.length;i++) {
	    		 sum=sum+a[i]; 
	    		 System.out.println("sum of elements is"+sum);
	    	 }
	    	  
	     }
	     void average() {
	    	 float avg=sum/5;
	    	 System.out.println("average of elements is"+avg);
	     }
	     void largest() {
	    	 for(int i=0;i<a.length;i++) {
	    		 if(a[i]>max) max=a[i];
	    		 System.out.println("Greatest element is"+max);
	    	 } 
	     }
	      

	  }

	public class ArrayOperations {

		public static void main(String[] args) {
			 Arr2 o1=new Arr2();
			 o1.input();
             o1.average();
             o1.largest();
		}

	}


