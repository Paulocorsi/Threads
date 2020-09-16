package controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadJogo extends Thread {

	private JLabel lblNewLabel;
	private JButton btnJogar;
	static int reset = 0;
	private int contador = 1;
	
	public ThreadJogo(JLabel lblNewLabel, JButton btnJogar){
		this.lblNewLabel = lblNewLabel;
		this.btnJogar = btnJogar;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		int NRodadas = r.nextInt(150)+1;
		for (int i=0; i<NRodadas; i++){
			Jogar();
			Sleep();
		}
		Reset();
	}
	
	public void Jogar(){
		btnJogar.setEnabled(false);
		String numero = "";
		
		switch(contador){
			case 1:
				numero = "1";
				break;
			case 2:
				numero = "2";
				break;
			case 3:
				numero = "3";
				break;
			case 4:
				numero = "4";
				break;
			case 5:
				numero = "5";
				break;
			case 6:
				numero = "6";
				break;
			case 7:
				numero = "7";
				break;
		}
		lblNewLabel.setText(numero);
		contador++;
		if (contador ==7){
			contador = 1;
		}
	}
	
	private void Sleep() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public void Reset(){
		reset++;
		if(reset == 3){
			reset=0;
			btnJogar.setEnabled(true);
		}
	}
}