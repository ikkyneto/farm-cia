package br.com.farmacia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollBar;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVenda() {
		setTitle("CADASTRO DE VENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE VENDA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(176, 11, 160, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF do Cliente:");
		lblNewLabel_1.setBounds(279, 59, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(363, 56, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID de Venda:");
		lblNewLabel_2.setBounds(10, 59, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(83, 56, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Código Item:");
		lblNewLabel_3.setBounds(10, 143, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 137, 101, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Quantidade de itens:");
		lblNewLabel_4.setBounds(10, 168, 101, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 165, 101, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Valor unitário:");
		lblNewLabel_5.setBounds(10, 193, 101, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(121, 190, 46, 20);
		contentPane.add(textField_4);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), null));
		list.setBounds(279, 166, 194, 133);
		contentPane.add(list);
		
		JLabel lblNewLabel_6 = new JLabel("Lista de Itens");
		lblNewLabel_6.setBounds(343, 143, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Confirmar Venda");
		btnNewButton.setBounds(10, 297, 128, 33);
		contentPane.add(btnNewButton); 
		
		JLabel lblNewLabel_2_1 = new JLabel("Vendedor:");
		lblNewLabel_2_1.setBounds(10, 84, 74, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(83, 81, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do cliente:");
		lblNewLabel_1_1.setBounds(279, 84, 101, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(472, 167, 17, 132);
		contentPane.add(scrollBar);
		
		textField_6 = new JTextField();
		textField_6.setBounds(363, 81, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
