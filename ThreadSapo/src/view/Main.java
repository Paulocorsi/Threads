package view;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		
		int TamanhoPulo = 10;
		int TamanhoCorrida = 100;
		
		for(int i=0; i<5; i++){
			Thread Sapo = new ThreadSapo(TamanhoPulo, TamanhoCorrida);
			Sapo.start();
		}
	}

}
