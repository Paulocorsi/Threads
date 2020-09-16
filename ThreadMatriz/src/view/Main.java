package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		
		int Mat [][] = new int [3][5];
		
		Random r = new Random();
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				Mat[i][j]=r.nextInt(10)+1;
			}
		}
		
		for (int i = 0; i < 3; i++){
			Thread CalcSoma = new ThreadMatriz(Mat[i], i);
			CalcSoma.start();
		}
	}
}
