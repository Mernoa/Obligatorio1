package Obligatorio;

public class Sistema {
	Ficha [] fichasUno;
	Ficha [] fichasDos;
	//comentario prueba-----
	public Sistema(){
		fichasUno = new Ficha[9];
		fichasDos = new Ficha[9];
		for(int i = 0; i<8 ;i++) {
			
			fichasUno[i] = new Ficha(Integer.toString(i+1), i+1);
			fichasDos[fichasDos.length-1-i]= new Ficha(Integer.toString(i+1), 1);
		}
	}
}
