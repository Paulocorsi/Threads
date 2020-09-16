package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.JogoController;

import javax.swing.JLabel;
import javax.swing.JButton;

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
		setBounds(100, 100, 568, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(106, 79, 79, 131);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setBounds(373, 81, 79, 127);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setBounds(241, 79, 79, 131);
		contentPane.add(lblNewLabel_2);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(10, 265, 89, 23);
		contentPane.add(btnJogar);
		
		JogoController jogoController = new JogoController(lblNewLabel, lblNewLabel_1, lblNewLabel_2, btnJogar);
		btnJogar.addActionListener(jogoController);
	}
}
