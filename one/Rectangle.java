package com.java.assignmentfive.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends Shape {
	
	private static double dimension2 ;
	private static BufferedReader br ;
	private static String input ;
	public static Rectangle shape ;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		shape = new Rectangle(); 
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
		
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area : ");
		System.out.println((dimension*dimension2));
		
	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Perimeter : ");
		System.out.println(2*(dimension+dimension2));
		
	}

}
