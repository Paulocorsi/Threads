package controller;

public class ThreadSapo extends Thread{

	private int TamanhoPulo;
	private int TamanhoCorrida;
	static int colocacao=0;
	
	
	public ThreadSapo(int TamanhoPulo, int TamanhoCorrida){
		this.TamanhoPulo = TamanhoPulo;
		this.TamanhoCorrida = TamanhoCorrida;
	}
	
	
	@Override
	public void run() {
		Corrida();
	}


	private void Corrida() {

		int qtdPulados=0;
		
		while(qtdPulados < TamanhoCorrida){
			int Pulou=(int) (Math.random() * TamanhoPulo + 1);
			qtdPulados += Pulou;
			System.out.println("O sapo " + getId()+ " pulou " + Pulou + " e percorreu " + qtdPulados + " metros");
		}
		colocacao++;
		System.out.println("O sapo " + getId() + " finalizou na posição: " + colocacao);
	}
	
	
	
}