package com.sim0711.v0;

class Super {
	static String ID = "QBANK";
}

class Sub extends Super {
	static {
		System.out.print("In Sub");
	}
	
}

public class Test {
	public static void main(String[] args) {
		System.out.println(Sub.ID);
	}
}