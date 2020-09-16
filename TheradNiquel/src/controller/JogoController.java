package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JogoController implements ActionListener {

	private JLabel lblNewLabel;
	private JButton btnJogar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewlabel_2;
	

	public JogoController(JLabel lblNewLabel, JLabel lblNewLabel_1, JLabel lblNewLabel_2, JButton btnJogar){
		this.lblNewLabel = lblNewLabel;
		this.lblNewLabel_1 = lblNewLabel_1;
		this.lblNewlabel_2 = lblNewLabel_2;
		this.btnJogar = btnJogar;
	}
	
	public void Start(){
		
		Thread num1 = new ThreadJogo(lblNewLabel, btnJogar);
		Thread num2 = new ThreadJogo(lblNewLabel_1, btnJogar);
		Thread num3 = new ThreadJogo(lblNewlabel_2, btnJogar);
		num1.start();
		num2.start();
		num3.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Start();
	}
}