package controller;

public class ThreadMatriz extends Thread {

	private int [] Vet = new int [5];
	private int linha;
	
	public ThreadMatriz(int []Vet,int linha){
		this.Vet = Vet;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		CalcSoma();
	}

	private void CalcSoma() {
		int soma = 0;
		for (int i=0; i<5; i++){
			soma +=Vet[i];
		}
		System.out.println("LINHA "+linha+" RESULTA EM "+soma);		
	}
	
	
	
	
	
}
