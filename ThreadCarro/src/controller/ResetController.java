package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ResetController implements ActionListener{
	
	private JLabel lblCarro1;
	private JLabel lblCarro2;
	private JButton btnCorrer;
	private JLabel txtVencedor;
	private JLabel txtPerdedor;
	private JButton btnReset;
	
	public ResetController(JLabel lblCarro1,JLabel lblCarro2, JButton btnCorrer, JLabel txtVencedor, 
			JLabel txtPerdedor, JButton btnReset) {
		this.lblCarro1 = lblCarro1;
		this.lblCarro2 = lblCarro2;
		this.btnCorrer = btnCorrer;
		this.txtVencedor = txtVencedor;
		this.txtPerdedor = txtPerdedor;
		this.btnReset = btnReset;
	}
	
	private void arrumaPosicao() {
		btnReset.setEnabled(false);
		btnCorrer.setEnabled(true);
		lblCarro1.setBounds(10, 11, 46, 14);
		lblCarro2.setBounds(10, 60, 46, 14);
		txtPerdedor.setText("");
		txtVencedor.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		arrumaPosicao();
	}

}