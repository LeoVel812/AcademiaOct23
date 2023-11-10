package com.sim0911.v3;

//What will the following code print?  
public class Test {
	public int luckyNumber(int seed) {
		if (seed > 10)
			return seed % 10;
		int x = 0;
		try {
			if (seed % 2 == 0)
				throw new Exception("No Even no.");
			else
				return x;
		} catch (Exception e) {
			return 3; 
		} finally {
			return 7;//<= 
		}
	}

	public static void main(String args[]) {
		int amount = 100, seed = 6;
		switch (new Test().luckyNumber(6)) {
		case 3:
			System.out.println("PASO POR 3");
			amount = amount * 2;
		case 7:
			System.out.println("PASO POR 7");
			amount = amount * 2;
		case 6:
			amount = amount + amount;
		default:
		}
		System.out.println(amount);
		//3 -> 800
		//7 -> 400
	}
}