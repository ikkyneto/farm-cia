package br.com.farmacia;

import java.awt.EventQueue;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.farmacia.conexao.ConectaBanco;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private final JComboBox comboBox = new JComboBox();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione o tipo:");
		lblNewLabel.setBounds(25, 13, 146, 14);
		contentPane.add(lblNewLabel);
		comboBox.setBounds(138, 10, 120, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecionar", "Funcionario", "Cliente"}));
		comboBox.setToolTipText("Professor\r\nCliente");
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(25, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(62, 58, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("RG:");
		lblNewLabel_1_1.setBounds(25, 89, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(62, 86, 155, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CEP:");
		lblNewLabel_1_1_1.setBounds(25, 117, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(62, 114, 155, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1_1_1_1.setBounds(25, 145, 120, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 145, 155, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome:");
		lblNewLabel_1_2.setBounds(239, 61, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(305, 58, 155, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Endereço:");
		lblNewLabel_1_1_1_2.setBounds(239, 89, 68, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(305, 86, 155, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_2_1.setBounds(239, 117, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(305, 114, 155, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("ORG:");
		lblNewLabel_1_1_1_2_1_1.setBounds(317, 145, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(356, 142, 155, 20);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String sql = "INSERT INTO pessoas(Nome, CPF, RG, Endereco, CEP, Email, Data_de_Nascimento, ORG_Emissor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		        ConectaBanco factory = new ConectaBanco();
		        try (Connection c = factory.obtemConexao()){
		            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		            ps.setString(1, textField_4.getText());
		            ps.setString(2, textField.getText());            
		            ps.setInt(3, Integer.parseInt(textField_1.getText()));
		            ps.setString(4, textField_5.getText());
		            ps.setInt(5, Integer.parseInt(textField_2.getText()));
		            ps.setString(6, textField_6.getText());
		            ps.setInt(7, Integer.parseInt(textField_3.getText()));
		            ps.setString(8, textField_7.getText());
		            ps.execute();
		            
		            int id = 0;
		            ResultSet keys = ps.getGeneratedKeys();
		            if(keys.next()) {
		            	id = keys.getInt(1);
		            }
		            
		            String selectedItem = (String) comboBox.getSelectedItem();
		            if (selectedItem.equals("Cliente")) {
		            	 String inserir_cliente = "INSERT INTO cliente (ID_Cliente) VALUES (?)";
		            	 String atualizar_dado_pessoas_fk_cliente = "UPDATE pessoas SET Cliente_ID_Cliente = ? WHERE ID_Pessoas = ?";
		            	 try (c){
		            		 PreparedStatement ps_cl = c.prepareStatement(inserir_cliente);
		            		
		            		 ps_cl.setInt(1, id);
		            		 ps_cl.execute();
		            		 
		            		 PreparedStatement ps_atl = c.prepareStatement(atualizar_dado_pessoas_fk_cliente);
		            		 
		            		 ps_atl.setInt(1, id);
		            		 ps_atl.setInt(2, id);
		            		 ps_atl.execute();
		            		 
		            	 }
		            }
		            
		            else if (selectedItem.equals("Funcionario")) {
		            	 String inserir_func = "INSERT INTO funcionario (ID_Funcionario, Salario, Carteira_de_Trabalho, Reservista) VALUES (?, ?, ?, ?)";
		            	 String atualizar_dado_pessoas_fk_func = "UPDATE pessoas SET Funcionario_ID_Funcionario = ? WHERE ID_Pessoas = ?";
		            	 try (c){
		            		 PreparedStatement ps_cl = c.prepareStatement(inserir_func);
		            		
		            		 ps_cl.setInt(1, id);
		            		 ps_cl.setInt(2, Integer.parseInt(textField_8.getText()));
		            		 ps_cl.setInt(3, Integer.parseInt(textField_9.getText()));
		            		 ps_cl.setInt(4, Integer.parseInt(textField_10.getText()));
		            		 ps_cl.execute();
		            		 
		            		 PreparedStatement ps_atl = c.prepareStatement(atualizar_dado_pessoas_fk_func);
		            		 
		            		 ps_atl.setInt(1, id);
		            		 ps_atl.setInt(2, id);
		            		 ps_atl.execute();
		            		 
		            	 }
		            }
		            
		            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!!"); // evento final
		        }
		        catch (Exception w){
		            w.printStackTrace();//retorna o erro
		        }
		        textField_4.setText("");  
		        textField.setText("");
		        textField_1.setText("");
		        textField_5.setText("");
		        textField_2.setText("");
		        textField_6.setText("");
		        textField_3.setText("");
		        textField_7.setText("");
			}
		});
		
		
		btnNewButton.setBounds(480, 339, 120, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Salario:");
		lblNewLabel_1_1_1_1_1.setBounds(25, 258, 57, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(77, 255, 155, 20);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Carteira de Trabalho:");
		lblNewLabel_1_1_1_1_1_1.setBounds(25, 298, 146, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(152, 295, 155, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Reservista:");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(25, 343, 146, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(91, 340, 155, 20);
		contentPane.add(textField_10);
		
		JComponent[] dados_cliente = { lblNewLabel_1, textField, lblNewLabel_1_1, textField_1, lblNewLabel_1_1_1, textField_2, lblNewLabel_1_1_1_1, textField_3, textField_4, textField_5, textField_6, textField_7, lblNewLabel_1_2, lblNewLabel_1_1_1_2, lblNewLabel_1_1_1_2_1, lblNewLabel_1_1_1_2_1_1};
		JComponent[] dados_funcionario = { lblNewLabel_1_1_1_1_1, textField_8, lblNewLabel_1_1_1_1_1_1, textField_9, lblNewLabel_1_1_1_1_1_1_1, textField_10 };
		JComponent[] botao = { btnNewButton };
		
		List<JComponent> componentes = new ArrayList<>();
		componentes.addAll(Arrays.asList(dados_cliente));
		componentes.addAll(Arrays.asList(dados_funcionario));
		componentes.addAll(Arrays.asList(botao));
		
		comboBox.setSelectedItem("Selecionar"); // Define o valor padrão para "Selecionar"

		for (JComponent component : componentes) {
		    component.setVisible(false); // Oculta os componentes inicialmente
		}
		
		comboBox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent event) {
		        if (event.getStateChange() == ItemEvent.SELECTED) {
		            String selectedItem = (String) comboBox.getSelectedItem();
		            if (selectedItem.equals("Selecionar")) {
		                for (JComponent component : componentes) {
		                    component.setVisible(false);
		                }
		            } else if (selectedItem.equals("Cliente")) {
		                for (JComponent component : dados_cliente) {
		                    component.setVisible(true);
		                }
		                for (JComponent component : dados_funcionario) {
		                    component.setVisible(false);
		                }
		                for (JComponent component : botao) {
		                    component.setVisible(true);
		                }
		            } else if (selectedItem.equals("Funcionario")) {
		                for (JComponent component : componentes) {
		                    component.setVisible(true);
		                }
		            }
		        }
		    }
		});
	}
}
