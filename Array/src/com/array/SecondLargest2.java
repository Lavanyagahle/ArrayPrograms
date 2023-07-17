package com.array;

public class SecondLargest2 {
public int secondLargest(int [] arr) {
	if(arr.length<2) {
		throw new IllegalArgumentException("Array must contain at least two elements");
	}
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondLargest=largest;
			largest=arr[i];
		}else if(arr[i]>largest && arr[i]!=largest) {
			secondLargest=arr[i];
		}
	}
	if(secondLargest==Integer.MIN_VALUE) {
		throw new IllegalArgumentException("No second Largest element found");
	}
	return secondLargest;
}
public static void main(String[] args) {
	int [] arr= {23,45,67,78,98};
	SecondLargest2 sl=new SecondLargest2();
	int secondLargest=sl.secondLargest(arr);
	System.out.println(secondLargest);
}
}
