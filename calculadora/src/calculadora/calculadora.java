package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtCalculos;
	private JButton btn1;
	private JButton btn0;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn2;
	private JButton btnPonto;
	private JButton btn3;
	private JButton btnDivisao;
	private JButton btnSoma;
	private JButton btnSubstracao;
	private JButton btnMultiplicacao;
	private JButton btnIgual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	Double valor1, valor2, resultado;
	String sinal, resposta;
	
	public calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCalculos = new JTextField();
		txtCalculos.setBounds(10, 0, 282, 59);
		contentPane.add(txtCalculos);
		txtCalculos.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "7");
			}
		});
		btn7.setBounds(10, 70, 63, 49);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "4");
			}
		});
		btn4.setBounds(10, 130, 63, 49);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "1");
			}
		});
		btn1.setBounds(10, 190, 63, 49);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "0");
			}
		});
		btn0.setBounds(10, 250, 63, 49);
		contentPane.add(btn0);
		
		btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "8");
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn8.setBounds(83, 70, 63, 49);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "9");
			}
		});
		btn9.setBounds(156, 70, 63, 49);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "6");
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn6.setBounds(156, 130, 63, 49);
		contentPane.add(btn6);
		
		btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "5");
			}
		});
		btn5.setBounds(83, 130, 63, 49);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "2");
			}
		});
		btn2.setBounds(83, 190, 63, 49);
		contentPane.add(btn2);
		
		btnPonto = new JButton(".");
		btnPonto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + ".");
			}
		});
		btnPonto.setBounds(83, 250, 63, 49);
		contentPane.add(btnPonto);
		
		btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String valor = txtCalculos.getText();
				txtCalculos.setText(valor + "3");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(156, 190, 63, 49);
		contentPane.add(btn3);
		
		btnDivisao = new JButton("/");
		btnDivisao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor1 = Double.parseDouble(txtCalculos.getText());
				txtCalculos.setText("");
				sinal = "/";
			}
		});
		btnDivisao.setBounds(156, 250, 63, 49);
		contentPane.add(btnDivisao);
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor1 = Double.parseDouble(txtCalculos.getText());
				txtCalculos.setText("");
				sinal = "+";
				
						
				
				
			}
		});
		btnSoma.setBounds(229, 70, 63, 49);
		contentPane.add(btnSoma);
		
		btnSubstracao = new JButton("-");
		btnSubstracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubstracao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor1 = Double.parseDouble(txtCalculos.getText());
				txtCalculos.setText("");
				sinal = "-";
			}
		});
		btnSubstracao.setBounds(229, 130, 63, 49);
		contentPane.add(btnSubstracao);
		
		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor1 = Double.parseDouble(txtCalculos.getText());
				txtCalculos.setText("");
				sinal = "*";
			}
		});
		btnMultiplicacao.setBounds(229, 190, 63, 49);
		contentPane.add(btnMultiplicacao);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIgual.addMouseListener(new MouseAdapter() {
			@Override
			//operacoes
			public void mouseClicked(MouseEvent e) {
				String resposta;
				valor2 = Double.parseDouble(txtCalculos.getText());
				if (sinal == "+") {
					resultado = valor1 + valor2;
					resposta = String.format("%.2f",resultado);
					txtCalculos.setText(resposta);
				}
				else if (sinal == "-") {
					resultado = valor1 - valor2;
					resposta = String.format("%.2f",resultado);
					txtCalculos.setText(resposta);
				}
				else if (sinal == "*") {
					resultado = valor1 * valor2;
					resposta = String.format("%.2f",resultado);
					txtCalculos.setText(resposta);
				}
				else if (sinal == "/") {
					resultado = valor1 / valor2;
					resposta = String.format("%.2f",resultado);
					txtCalculos.setText(resposta);
					
				}	
			}
		});
		btnIgual.setBounds(229, 250, 63, 49);
		contentPane.add(btnIgual);
	}
}
