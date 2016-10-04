package com.java.assignmentfive.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends Shape {
 
	private static BufferedReader br ;
	private static String input ;
	public static Circle shape ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    shape = new Circle(); 
	    input();
		shape.findArea() ;
		shape.findPerimeter();

	}

	private static void input() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter radius : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		
		Circle.dimension = Double.parseDouble(input);
		
	}

	@Override
	public void findArea() throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Cirle Area : ");
		System.out.println((22/7)*(dimension)*(dimension));
	}

	@Override
	public void findPerimeter() throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Cirle Perimeter : ");
		System.out.println((22/7)*(dimension)*2);
		
	}

}
