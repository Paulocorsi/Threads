package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		int [] vet = new int [1000];
		
		Random r = new Random();
		
		for (int i = 0; i<100; i++){
			vet[i] = r.nextInt(10)+1;
		}
		
		for (int op = 0; op < 2; op++){
			Thread CalcTemp = new ThreadVetor(op, vet);
			CalcTemp.start();
		}
	}
}
