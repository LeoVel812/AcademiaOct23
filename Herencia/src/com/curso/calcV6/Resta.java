package com.curso.calcV6;

public class Resta extends Operacion {
	
	public Resta(int x, int y) {
		super(x,y);
	}
	@Override
	int ejecuta() {
		return x-y;
	}
	
}
