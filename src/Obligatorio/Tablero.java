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

	/*
	 * Se pasa la ficha que el jugador quiere mover y la dirección deseada. Se
	 * verifica que antes de mover la ficha, la posicion siguiente esté vacia (sea
	 * null) y que no se vaya del limite de la matriz.
	 */
	public void moverFichaArriba(String direccion, int ficha) {
		Ficha fichaSeleccionada = this.buscarFicha(ficha, "Azul");
		int filaFicha = fichaSeleccionada.getPosicionFila();
		int columnaFicha = fichaSeleccionada.getColumna();
		switch (direccion) {
		case "D":
			if (matriz[filaFicha - 1][columnaFicha - 1] == null && filaFicha - 1 < matriz.length
					&& columnaFicha - 1 < matriz[0].length) {
				matriz[filaFicha][columnaFicha] = null;
				matriz[filaFicha-1][columnaFicha-1] = fichaSeleccionada;
				fichaSeleccionada.setFila(filaFicha-1);
				fichaSeleccionada.setColumna(columnaFicha-1);
			}
		}
	}

	/*
	 * Pide el valor de la ficha y el numero de jugador para buscar la ficha deseada
	 * y que pertenezca al jugador que accede a dicha ficha. Retorna la ficha
	 * buscada
	 */
	public Ficha buscarFicha(int valor, String color) {
		Ficha ficha = null;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; i < matriz[0].length; j++) {
				if (matriz[i][j].getValor() == valor && matriz[i][j].getColor().equals(color)) {
					ficha = matriz[i][j];
					ficha.setFila(i);
					ficha.setColumna(j);
				}
			}
		}
		return ficha;
	}
}
