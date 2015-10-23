package org.elsysbg.ip.java;

import java.util.Scanner;

public class CommandHandler {

	public static void main(String[] args) {
		// input
		System.out.print("Enter command");
		final Scanner in= new Scanner(System.in);
		final String command= in.next();
		//proccess
		final CommandHandler handler= execute (command);
		final int result=handler.run();
		System.out.println("Result: "+ result);
	}

	private static CommandHandler execute(String command) {
		// TODO Auto-generated method stub
		final String[] split=command.split(":");
		if(("sum").equals (split[0])){
			return new CommandHandler(){
				@Override
				public int run(){
					return Integer.valueOf(split[1]) +Integer.valueOf(split[2]);
				}
			};
		}
		throw new IllegalArgumentException("Unknown command: " + command);
	}
	public int run(){
		return 0;
	}
}
