package com.curso.calcV1;

public class Suma extends Operacion {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return x+y;
	}
	
}
