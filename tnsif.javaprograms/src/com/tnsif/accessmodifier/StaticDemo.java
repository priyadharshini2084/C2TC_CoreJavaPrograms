package com.tnsif.accessmodifier;

public class StaticDemo {
	
	static int count;
	
	static {
		count =20;
		System.out.println("Shows the static"+ "count assigned:" +count);
	}
	
	static void show() {
		System.out.println("Method runs in static"+ " with count of:" +count);
		
	}
	
	public static void main(String[]args) {
		System.out.println("Static in main" +"method:"+count);
		show();
	}

} 
