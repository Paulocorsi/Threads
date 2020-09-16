package controller;

public class ThreadVetor extends Thread {

	private int x;
	private int [] vet = new int [1000];
	
	public ThreadVetor(int x, int vet[]){
		this.x = x;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		CalcTemp();
	}
	
	public void CalcTemp(){
		
		if((x % 2)==0){
			
			//TEMPO INICIAL
			double tempoInicial = System.nanoTime();
		
			//PROCESSO
			int soma = 0;
			for (int i = 0; i<vet.length; i++){
				soma = soma + vet[i];
			}
		
			//TEMPO FINAL
			double tempoFinal = System.nanoTime();
		
			//TEMPO TOTAL
			double tempoTotal = tempoFinal - tempoInicial;
		
			//CALCULO EM NANO SEGUNDOS nS = 10^-9
			tempoTotal = tempoTotal / Math.pow(10, 9);
		
			System.out.println("Tempo Total do vetor100(For) é: " + tempoTotal+"s.");
			}
		else{
			
			//TEMPO INICIAL
			double tempoInicial = System.nanoTime();
			
			//PROCESSO
			for (int valor : vet){
				int soma = valor;
			}
		
			//TEMPO FINAL
			double tempoFinal = System.nanoTime();
		
			//TEMPO TOTAL
			double tempoTotal = tempoFinal - tempoInicial;
		
			//CALCULO EM NANO SEGUNDOS nS = 10^-9
			tempoTotal = tempoTotal / Math.pow(10, 9);
		
			System.out.println("Tempo Total do vetor100(For Each) é: " + tempoTotal+"s.");
			}
		}	
	}
