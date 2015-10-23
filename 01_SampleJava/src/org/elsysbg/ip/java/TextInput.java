package org.elsysbg.ip.java;

import java.util.Scanner;

public class TextInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your name: ");
		// standard input is held by System.in
		final Scanner in= new Scanner(System.in);
		/*
		 get text from STDIN
		 scanner is used
		 */
		final String name= in.next();
		// instead of Scanner you can just use Buffered Reader
		System.out.printf("Hello, %s", name);
		// always close resources!
		in.close();
	}
}
