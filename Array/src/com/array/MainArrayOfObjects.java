package com.array;

import java.util.Scanner;

class Student1{
	int age; 
	String name;
	//Student1(){
		//age=23;
		//name="Poovi";
	//}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		name=sc.nextLine();
		age=sc.nextInt();
	}
	void display() {
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}

public class MainArrayOfObjects {

	public static void main(String[] args) {
//		int i, j;
//		int ar[]=new int[2];
		//Student1 ob1=new Student1();
		//Student1 ob2=new Student1();
		
		Student1 sarr[]=new Student1[2];
		
		for(int i=0;i<sarr.length;i++) {
			sarr[i]=new Student1(); //sarr[0], sarr[1]
			sarr[i].input();
		}
		
		for(int i=0;i<sarr.length;i++) {
			
			sarr[i].display();   
		}

	}

}

