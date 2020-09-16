
package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CorrerController;
import controller.ResetController;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(138, 251, 89, 23);
		contentPane.add(btnCorrer);
		
		JLabel lblCarro1 = new JLabel("Carro 1");
		lblCarro1.setBounds(10, 11, 46, 14);
		contentPane.add(lblCarro1);
		
		JLabel lblCarro2 = new JLabel("Carro 2");
		lblCarro2.setBounds(10, 60, 46, 14);
		contentPane.add(lblCarro2);
		
		JLabel lblTxtVencedor = new JLabel("");
		lblTxtVencedor.setBounds(103, 151, 65, 14);
		contentPane.add(lblTxtVencedor);
		
		JLabel lblTxtPerdedor = new JLabel("");
		lblTxtPerdedor.setBounds(103, 206, 65, 14);
		contentPane.add(lblTxtPerdedor);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(294, 251, 89, 23);
		btnReset.setEnabled(false);
		contentPane.add(btnReset);
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setBounds(10, 151, 65, 14);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setBounds(10, 206, 65, 14);
		contentPane.add(lblPerdedor);
		
		CorrerController correrController = new CorrerController(lblCarro1, lblCarro2, btnCorrer, lblTxtVencedor , 
				lblTxtPerdedor, btnReset);
		btnCorrer.addActionListener(correrController);
		
		ResetController resetController = new ResetController(lblCarro1, lblCarro2, btnCorrer, lblTxtVencedor, 
				lblTxtPerdedor, btnReset);
		btnReset.addActionListener(resetController);
	}
}
