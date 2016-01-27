package com.polyesterprogrammer1;

import java.io.IOException;
import java.util.Scanner;

public class BallMain {

	public static void main(String[] args) {
		String ballBrand;
		String Material = null;
		int continuE = 1;
		Double ballSize;
		Scanner input = new Scanner(System.in);
		System.out.println("What brand is the ball?");
		ballBrand = input.nextLine();
		do {
			try {
				System.out.println("What is the material of the ball?");
				Material = input.nextLine();
				switch (Material.toLowerCase()) {
				case "rubber":
					continuE = 0;
					break;
				case "metal":
					continuE = 0;
					break;
				case "graphene":
					continuE = 0;
					break;
				default:
					System.out.println(
							"I'm sorry what was that? The only materials we have are 'metal, ' rubber', and 'graphene'");
					break;
				}

			} catch (Exception e) {

			}
		} while (continuE == 1);
		
		System.out.println("How big is the ball?");
		ballSize = input.nextDouble();
		System.out.println("Ok the ball is " + ballSize + " inches in diameter.");
		input.close();
		Ball ball1 = new Ball(ballSize, ballBrand, Material);
		ball1.Bouncing();

	}

}
