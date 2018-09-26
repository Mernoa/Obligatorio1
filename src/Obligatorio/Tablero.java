package Obligatorio;

public class Tablero {
	Ficha[][] matriz;
	public Tablero() {
		matriz = new Ficha[8][9];
	}
	public Ficha[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(Ficha[][] matriz) {
		this.matriz = matriz;
	}
	
}
