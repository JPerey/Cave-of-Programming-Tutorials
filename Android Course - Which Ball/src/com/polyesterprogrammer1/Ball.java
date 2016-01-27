package com.polyesterprogrammer1;

public class Ball {
	private double ballSize;
	private String ballBrand;
	private int bounceCoefficient;
	private int hole = 10;
	private double holeHeight = 15;
	private int i = 1;

	public Ball(double ballSize, String ballBrand, String Material ) {
		this.ballSize = ballSize;
		this.ballBrand = ballBrand;
		switch (Material.toLowerCase()) {
		case "rubber":
			this.bounceCoefficient = 5;
			break;
		case "metal":
			this.bounceCoefficient = 0;
			break;
		case "graphene":
			this.bounceCoefficient = 3;
			break;
		}

	}

	public void Bouncing(){
		System.out.println("Let's bounce the ball!");
		if(bounceCoefficient >0){
		while(bounceCoefficient <= holeHeight ){
			bounceCoefficient*=i;
			i++;
		}
		if(ballSize <= hole){
			System.out.println("The " + ballBrand + " Ball made it through! It only took " + (i-1) + " bounces!");
		}else{
			System.out.println("The " + ballBrand + "Ball didn't make it through.... It was " + (ballSize - (double)hole) + " inches to big");
		}
			
		}else{
			System.out.println("Ball couldn't bounce at all!");
			
			
		}
		
	}
}
