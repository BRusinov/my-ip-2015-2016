package org.elsysbg.ip.java.commandshandling;

import java.util.Scanner;

public class CommandHandler {

	public static void main(String[] args) {
		// input
		System.out.print("Enter command");
		final Scanner in= new Scanner(System.in);
		final String command= in.next();
		//proccess
		final CommandsHandler handler= execute (command);
		//final int result=handler.run();
		//System.out.println("Result: "+ result);
		in.close();
	}

	private static CommandsHandler execute(String command) {
		// TODO Auto-generated method stub
		final String[] split=command.split(":");
		if(("sum").equals (split[0])){
			return new SumCommandHandler(split);
		}
		throw new IllegalArgumentException("Unknown command: " + command);
	}
	public int run(){
		return 0;
	}
}
