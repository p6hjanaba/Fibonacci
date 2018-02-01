package fibonacci;

import java.math.*;
import java.io.*;

// Recursion is good, but for this specific assignment tail recursion is better.
// Recursion fills up the memory too fast and slows down around at number 30.
// Tail recursion doesn't use that much memory and and you can go for 300k with little effort.
// I'm not sure if it is cause of my pc or just because the numbers are over 3k digits long,
// getting to 100k takes some time.

public class Main {
	
	public static void main(String[] args) throws IOException{
		System.out.println("How many numbers do you wish to see?");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String temp = read.readLine();
		int count = Integer.parseInt(temp);
		for (int i = 0; i <= count; i++){
			System.out.println(i + ": " + fibonacci(i));
		}
	}
	
	// Tail recursion that doesn't use memmory and can give out big numbers in little time.
	public static BigInteger fibonacci(int f){
		if (f == 0 || f == 1){
			return BigInteger.ONE;
		}
		for (int i = 0; i <= f; i++){
			BigInteger f3 = f1.add(f2);
			f1 = f2;
			f2 = f3;
		}
		return f2;
		
	}
	
	// Initial recursion that slowed down around number 30.
	// Problem is that it uses too much memory.
	/*
	public static BigInteger fibonacci(int f){
		if (f == 0 || f == 1){
			return BigInteger.ONE;
		}
		return fibonacci(f-2).add(fibonacci(f-1));
	}*/

}
