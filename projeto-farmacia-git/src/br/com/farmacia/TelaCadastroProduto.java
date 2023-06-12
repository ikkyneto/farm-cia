package br.com.farmacia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto frame = new TelaCadastroProduto();
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
	public TelaCadastroProduto() {
		setTitle("CADASTRO DE PRODUTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Produtos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(233, 11, 134, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código de barras:");
		lblNewLabel_1.setBounds(29, 68, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(125, 65, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Princípio ativo:");
		lblNewLabel_2.setBounds(38, 183, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 180, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Lote:");
		lblNewLabel_3.setBounds(85, 97, 30, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(125, 93, 98, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar novo Lote");
		btnNewButton.setBounds(233, 93, 134, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Miligrama:");
		lblNewLabel_4.setBounds(60, 208, 55, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 205, 55, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tipo Tarja:");
		lblNewLabel_4_1.setBounds(60, 233, 55, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(125, 229, 98, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setBounds(85, 258, 30, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 255, 181, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Estoque:");
		lblNewLabel_6.setBounds(67, 326, 48, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(125, 323, 102, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Laboratório:");
		lblNewLabel_4_2.setBounds(48, 357, 67, 14);
		contentPane.add(lblNewLabel_4_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(125, 354, 102, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Produto");
		btnNewButton_1.setBounds(424, 328, 134, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Valor:");
		lblNewLabel_7.setBounds(432, 183, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(488, 180, 55, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Desconto:");
		lblNewLabel_8.setBounds(412, 208, 66, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(488, 205, 55, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(472, 94, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Validade:");
		lblNewLabel_9.setBounds(416, 97, 46, 14);
		contentPane.add(lblNewLabel_9);
	}
}
