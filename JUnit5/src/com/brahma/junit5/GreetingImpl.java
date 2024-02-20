package com.brahma.junit5;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {

		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

	@Override
	public Integer addNumbers(int a, int b) {
		int c = a+b;
		return c;
	}
	
	
}
