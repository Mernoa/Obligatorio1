package Obligatorio;

import java.util.*;

public class Juego {
	public static void main(String[] args) {
		
		Sistema respaldo = new Sistema();
		Tablero tab = new Tablero();
		tab.matriz[0]= respaldo.fichasUno;
		tab.matriz[7] = respaldo.fichasDos;
		for(int i = 0; i<tab.matriz.length;i++) {
			for(int j = 0; j<tab.matriz[0].length;j++) {
				if(tab.matriz[i][j]==null) {
					System.out.print(" ");
				}else {
					System.out.print(tab.matriz[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}
}
