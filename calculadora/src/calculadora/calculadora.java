package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculadora {

	private JFrame frmCalculadora;
	private JTextField txtTela;
	
	double valor1, valor2, resultado;
	String operacao, resposta;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public calculadora() {
		initialize();
	}

	
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 267, 403);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtTela = new JTextField();
		txtTela.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTela.setBounds(10, 11, 231, 50);
		frmCalculadora.getContentPane().add(txtTela);
		txtTela.setColumns(10);
		
		
		JButton btncorrigir = new JButton("\uF0e7");
		btncorrigir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String corrigir=null;
				
				if(txtTela.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtTela.getText());
					strB.deleteCharAt(txtTela.getText().length()-1);
					corrigir = strB.toString();
					txtTela.setText(corrigir);
				}
			}
		});
		btncorrigir.setBounds(10, 72, 89, 33);
		frmCalculadora.getContentPane().add(btncorrigir);
		
		JButton btnlimpar = new JButton("c");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTela.setText(null);
			}
		});
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 16));
		btnlimpar.setBounds(152, 72, 89, 33);
		frmCalculadora.getContentPane().add(btnlimpar);
		
		JButton btnsubt = new JButton("-");
		btnsubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				operacao = "-";
			}
		});
		btnsubt.setFont(new Font("Arial", Font.BOLD, 16));
		btnsubt.setBounds(191, 181, 50, 50);
		frmCalculadora.getContentPane().add(btnsubt);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				operacao = "*";
			}
		});
		btnmult.setFont(new Font("Arial", Font.BOLD, 16));
		btnmult.setBounds(191, 242, 50, 50);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = txtTela.getText();
				txtTela.setText(resultado + ".");
			}
		});
		btnponto.setFont(new Font("Arial", Font.BOLD, 16));
		btnponto.setBounds(70, 303, 50, 50);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btnresult = new JButton("=");
		btnresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String resposta;
				valor2 = Double.parseDouble(txtTela.getText());
				if (operacao =="+")
				{
					resultado=valor1+valor2;
					resposta = String.format("%.2f",resultado);
					txtTela.setText(resposta);					
				}
				else if (operacao =="-")
				{
					resultado = valor1 - valor2;
					resposta = String.format("%.2f",resultado);
					txtTela.setText(resposta);
				}
				else if (operacao =="*")
				{
					resultado=valor1 * valor2;
					resposta = String.format("%.2f",resultado);
					txtTela.setText(resposta);
				}
				else if (operacao =="/")
				{
					resultado=valor1 / valor2;
					resposta = String.format("%.2f",resultado);
					txtTela.setText(resposta);
				}
				
				
			}
		});
		btnresult.setFont(new Font("Arial", Font.BOLD, 16));
		btnresult.setBounds(191, 303, 50, 50);
		frmCalculadora.getContentPane().add(btnresult);
		
		JButton btndivisao = new JButton("/");
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				operacao = "/";
			}
		});
		btndivisao.setFont(new Font("Arial", Font.BOLD, 16));
		btndivisao.setBounds(130, 303, 50, 50);
		frmCalculadora.getContentPane().add(btndivisao);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				operacao = "+";
			}
		});
		btnsoma.setFont(new Font("Arial", Font.BOLD, 16));
		btnsoma.setBounds(191, 120, 50, 50);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn9.getText();
				txtTela.setText(Valor);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 16));
		btn9.setBounds(130, 120, 50, 50);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn8.getText();
				txtTela.setText(Valor);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 16));
		btn8.setBounds(70, 120, 50, 50);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Valor = txtTela.getText()+ btn7.getText();
				txtTela.setText(Valor);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 16));
		btn7.setBounds(10, 120, 50, 50);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn6.getText();
				txtTela.setText(Valor);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 16));
		btn6.setBounds(130, 181, 50, 50);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn5.getText();
				txtTela.setText(Valor);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 16));
		btn5.setBounds(70, 181, 50, 50);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn4.getText();
				txtTela.setText(Valor);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 16));
		btn4.setBounds(10, 181, 50, 50);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn3.getText();
				txtTela.setText(Valor);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 16));
		btn3.setBounds(130, 242, 50, 50);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn2.getText();
				txtTela.setText(Valor);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 16));
		btn2.setBounds(70, 242, 50, 50);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn1.getText();
				txtTela.setText(Valor);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 16));
		btn1.setBounds(10, 242, 50, 50);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Valor = txtTela.getText()+ btn0.getText();
				txtTela.setText(Valor);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 16));
		btn0.setBounds(10, 303, 50, 50);
		frmCalculadora.getContentPane().add(btn0);

	}
}
