package Obligatorio;

public class Sistema {
	private Ficha [] fichasAzules;
	private Ficha [] fichasRojas;

	public Sistema(){
		fichasAzules = new Ficha[9];
		fichasRojas = new Ficha[9];
		for(int i = 0; i<8 ;i++) {
			fichasAzules[i] = new Ficha(Integer.toString(i+1), i+1, 1);
			fichasRojas[fichasRojas.length-1-i]= new Ficha(Integer.toString(i+1), 1, 2);
		}
	}
}
