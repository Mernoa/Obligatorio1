package Obligatorio;

public class Ficha {
	String id;
	int valor;
	int fila;
	int columna;
	
	public Ficha(String id, int valor) {
		this.id = id;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return id;
	}
	
}
