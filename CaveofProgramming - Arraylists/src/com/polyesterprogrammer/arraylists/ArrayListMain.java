package com.polyesterprogrammer.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {
		String choice = null;
		String foodChoice = null;
		int i;
		Scanner input = new Scanner(System.in);
		//an array list needs to be of some type that can be counter: int, String, double, and objects
		ArrayList<String> myArrayList = new ArrayList<>();
		do{
		System.out.println("Would you like to add something to the grocery list?");
		choice = input.nextLine();
		if(choice.equals("yes")){
			System.out.println("What would you like to add?");
			foodChoice = input.nextLine();
			myArrayList.add(foodChoice);
			
		}else{
			System.out.println("Ok, then I'll go to the store now. Bye!");
		}
		
		}while(choice.equals("yes"));
		input.close();
		System.out.println("I'm back! I got what you wanted. Here's some:");
		//in order to do this particular way I wanted to, I had to use a for loop not a for-each loop. so sad =[
		for(i =0; i < myArrayList.size();i++){
			
			if(i == (myArrayList.size()-1)){
				break;
				
			}
				System.out.println(myArrayList.get(i));
		}
		System.out.println("I couldn't find any " + myArrayList.get(i)+ " though. Sorry kid.");
		
		

	}

}
