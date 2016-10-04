package com.java.assignmentfive.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle extends Shape {
	
	private static double dimension2 , dimension3 ; 
	private static BufferedReader br ;
	private static String input ;
	public static Triangle shape ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		shape = new Triangle(); 
		input();
		shape.findArea() ;
		shape.findPerimeter();
	}

	private static void input() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter side1 : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		
		input = br.readLine();
		dimension = Double.parseDouble(input);
		System.out.println("Enter side2 : ");
		input = br.readLine();
		dimension2 = Double.parseDouble(input);
		System.out.println("Enter side3 : ");
		input = br.readLine();
		dimension3 = Double.parseDouble(input);
		
	}

	@Override
	public void findArea() throws IOException {
		// TODO Auto-generated method stub		
		System.out.println("Triangle Area : ");
		System.out.println(Math.sqrt(((dimension+dimension2+dimension3)/2)*
				(((dimension+dimension2+dimension3)/2) - dimension ) * 
				(((dimension+dimension2+dimension3)/2) - dimension2 ) * 
				(((dimension+dimension2+dimension3)/2) - dimension3 )));
		
		
	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		
		System.out.println("Triangle Perimeter : ");
		System.out.println((dimension+dimension2+dimension3));
		
	}

}
