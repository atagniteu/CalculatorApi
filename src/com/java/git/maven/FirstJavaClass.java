package com.java.git.maven;

public class FirstJavaClass {

    public static void main(String[] args) {
	System.out.println("My First Java Programm");

	int[] numbers = { 1, 2, 3, 4, 5 };
	int sum = 0;
	for (int number : numbers) {
	    sum += number;
	}
	System.out.println(sum);

    }

}
