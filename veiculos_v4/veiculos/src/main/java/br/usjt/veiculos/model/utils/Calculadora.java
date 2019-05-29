package br.usjt.veiculos.model.utils;

public class Calculadora {
	public double calculaCombustivel (double...valores) {
		double ac = 0;
		for(Double d : valores) {
			ac += d;
		}
		return ac / valores.length;
	}
}
