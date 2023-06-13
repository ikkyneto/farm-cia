	package br.com.farmacia;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import java.awt.Color;
	import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
	import javax.swing.border.CompoundBorder;
	import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import br.com.farmacia.conexao.ConectaBanco;

import javax.swing.JTextPane;
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		private JTextField textField_7;
	    private JList<String> list;
	
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
			
			textField_2.addFocusListener(new FocusListener() {
		        @Override
		        public void focusGained(FocusEvent e) {
		            // Não faz nada quando o campo ganha foco
		        }

		        @Override
		        public void focusLost(FocusEvent e) {
		            buscarProduto();
		        }
		    });
			
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
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(121, 190, 46, 20);
			contentPane.add(textField_4);
			
			list = new JList<>(new DefaultListModel<>());
			DefaultListModel<String> listModel = new DefaultListModel<>();
		    list.setModel(listModel);
		    list.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), null));
		    list.setBounds(279, 166, 194, 133);
		    contentPane.add(list);

			
			JLabel lblNewLabel_6 = new JLabel("Lista de Itens");
			lblNewLabel_6.setBounds(343, 143, 86, 14);
			contentPane.add(lblNewLabel_6);
			
			JButton btnNewButton = new JButton("Confirmar Venda");
			btnNewButton.setBounds(10, 297, 128, 33);
			contentPane.add(btnNewButton);
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//finalizarVenda();
					
				}
			});
			
			JLabel lblNewLabel_2_1 = new JLabel("Vendedor:");
			lblNewLabel_2_1.setBounds(10, 84, 74, 14);
			contentPane.add(lblNewLabel_2_1);
			
			textField_1.addFocusListener(new FocusListener() {
		        @Override
		        public void focusGained(FocusEvent e) {
		            // Não faz nada quando o campo ganha foco
		        }

		        @Override
		        public void focusLost(FocusEvent e) {
		            buscarNomeVendedor();
		        }
		    });
			
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBounds(83, 81, 86, 20);
			contentPane.add(textField_5);
			
			JLabel lblNewLabel_1_1 = new JLabel("Nome do cliente:");
			lblNewLabel_1_1.setBounds(279, 84, 101, 14);
			contentPane.add(lblNewLabel_1_1);
			
			textField.addFocusListener(new FocusListener() {
		        @Override
		        public void focusGained(FocusEvent e) {
		            // Não faz nada quando o campo ganha foco
		        }

		        @Override
		        public void focusLost(FocusEvent e) {
		            buscarNomeCliente();
		        }
		    });
			
			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(472, 167, 17, 132);
			contentPane.add(scrollBar);
			
			textField_6 = new JTextField();
			textField_6.setEditable(false);
			textField_6.setBounds(363, 81, 86, 20);
			contentPane.add(textField_6);
			textField_6.setColumns(10);
			
			JButton btnAdicionarNaLista = new JButton("Adicionar na Lista");
		    btnAdicionarNaLista.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            adicionarItemNaLista();
		        }
		    });
			btnAdicionarNaLista.setBounds(10, 253, 128, 33);
			contentPane.add(btnAdicionarNaLista);
			
			JLabel lblNewLabel_5_1 = new JLabel("Em estoque:");
			lblNewLabel_5_1.setBounds(10, 218, 101, 14);
			contentPane.add(lblNewLabel_5_1);
			
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(121, 221, 46, 20);
			contentPane.add(textField_7);
		}
		
		public void adicionarItemNaLista() {
		    String codigoItem = textField_2.getText();
		    String quantidade = textField_3.getText();
		    String valorUnitario = textField_4.getText();

		    // Verifica se os campos estão preenchidos
		    if (codigoItem.isEmpty() || quantidade.isEmpty() || valorUnitario.isEmpty()) {
		        JOptionPane.showMessageDialog(this, "Preencha todos os campos");
		        return;
		    }

		    // Obtém o nome do item a partir do banco de dados
		    String nomeItem = buscarNomeItem(codigoItem);

		    // Verifica se o nome do item foi encontrado no banco de dados
		    if (nomeItem == null) {
		        JOptionPane.showMessageDialog(this, "Item não encontrado");
		        return;
		    }

		    // Calcule o valor final do item (quantidade * valor unitário)
		    double valorFinal = Double.parseDouble(quantidade) * Double.parseDouble(valorUnitario);

		    // Adiciona o item à lista
		    DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
		    model.addElement(codigoItem + " | " + (nomeItem != null ? nomeItem : "Nome não encontrado") + " | " + quantidade + " | " + valorFinal);

		    // Limpa os campos após adicionar o item na lista
		    textField_2.setText("");
		    textField_3.setText("");
		    textField_4.setText("");
		    textField_7.setText("");

		    JOptionPane.showMessageDialog(this, "Item adicionado à lista");
		}

		private String buscarNomeItem(String codigoItem) {
		    String nomeItem = null;

		    // Consulta o banco de dados para obter o nome do item com base no código do item (Código de Barras)
		    String query = "SELECT Principio_Ativo FROM produtos WHERE Codigo_de_Barras = ?";

		    ConectaBanco factory = new ConectaBanco();
		    try (Connection c = factory.obtemConexao();
		         PreparedStatement ps = c.prepareStatement(query)) {
		        ps.setString(1, codigoItem);
		        ResultSet resultSet = ps.executeQuery();

		        if (resultSet.next()) {
		            nomeItem = resultSet.getString("Principio_Ativo");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return nomeItem;
		}
		
		public void buscarNomeVendedor() {
		    String idVenda = textField_1.getText();
		    String query = "SELECT Nome FROM pessoas WHERE ID_Pessoas = ?";
		    
	        ConectaBanco factory = new ConectaBanco();
		    try (Connection c = factory.obtemConexao();
		    	PreparedStatement ps = c.prepareStatement(query)) {
		    	ps.setString(1, idVenda);
		        ResultSet resultSet = ps.executeQuery();

		        if (resultSet.next()) {
		            String nomeVendedor = resultSet.getString("nome");
		            textField_5.setText(nomeVendedor);
		        } else {
		            textField_5.setText("");
		            JOptionPane.showMessageDialog(this, "Vendedor não encontrado");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		        JOptionPane.showMessageDialog(this, "Erro ao buscar vendedor");
		    }
		}
		
		public void buscarNomeCliente() {
		    String CPF = textField.getText();
		    String query = "SELECT Nome FROM pessoas WHERE CPF = ?";
		    
	        ConectaBanco factory = new ConectaBanco();
		    try (Connection c = factory.obtemConexao();
		    	PreparedStatement ps = c.prepareStatement(query)) {
		    	ps.setString(1, CPF);
		        ResultSet resultSet = ps.executeQuery();

		        if (resultSet.next()) {
		            String nomeCliente = resultSet.getString("nome");
		            textField_6.setText(nomeCliente);
		        } else {
		        	textField_6.setText("");
		            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		        JOptionPane.showMessageDialog(this, "Erro ao buscar cliente");
		    }
		}
		
		public void buscarProduto() {
		    String idProduto = textField_2.getText();
		    String query = "SELECT p.Valor, e.Quantidade " +
		               "FROM produtos p " +
		               "JOIN estoque e ON p.Estoque_ID_Estoque = e.ID_Estoque " +
		               "WHERE p.Codigo_de_Barras = ?";

		    ConectaBanco factory = new ConectaBanco();
		    try (Connection c = factory.obtemConexao();
		         PreparedStatement ps = c.prepareStatement(query)) {
		        ps.setString(1, idProduto);
		        ResultSet resultSet = ps.executeQuery();

		        if (resultSet.next()) {
		            double valor = resultSet.getDouble("Valor");
		            int quantidade = resultSet.getInt("Quantidade");

		            textField_4.setText(String.valueOf(valor));
		            textField_7.setText(String.valueOf(quantidade));
		        } else {
		            textField_4.setText("");
		            textField_7.setText("");
		            JOptionPane.showMessageDialog(this, "Produto não encontrado");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		        JOptionPane.showMessageDialog(this, "Erro ao buscar produto");
		    }
		}
		
	}
