import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.synth.ColorType;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public  class Form extends JFrame implements ActionListener{
	
	JTextField num1;
	JTextField num2;
	JLabel title;
	Image img;


	
		public Form(){	
			this.setTitle("Formulário");
			this.setSize(680, 600);	
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.getContentPane().setBackground(Color.black);
	
		
				 JPanel painel = new JPanel() {
			            @Override
			            /* Criando um paint para desenha a imagem e chamar ela*/
			            protected void paintComponent(Graphics g) {
			            	/* Chamando a variavel "g" com o super*/
			                super.paintComponent(g);
			                Image img = new ImageIcon("src/image/ceu.jpg").getImage();
			                /* drawImage serve para desenhar a imagem, como aumentar a imagem ou mexer ou eixo x e y*/
			                g.drawImage(img, 0, 0, getWidth(), 670, this);
			            }
			        };
			        painel.setLayout(null);
			
			JButton soma = new JButton("Somar");
			LineBorder line = new LineBorder(Color.blue, 2, true);
			soma.setBounds(20,400,150,30);
			soma.setFont(new Font("Poppins", Font.PLAIN,20));
			soma.setForeground(Color.BLACK);
			soma.setBackground(Color.white);
			add(soma);
			
			soma.addActionListener(this);
			

			
			JButton subtracao= new JButton("Subtrair");
			subtracao.setBounds(175,400,150,30);
			subtracao.setFont(new Font("Poppins", Font.PLAIN,20));
			subtracao.setForeground(Color.BLACK);
			subtracao.setBackground(Color.white);
			add(subtracao);
			subtracao.addActionListener(this::subtracao);
			

			
			JButton multiplicacao = new JButton("Multiplicar");
			multiplicacao.setBounds(333,400,150,30);
			multiplicacao.setFont(new Font("Poppins", Font.PLAIN,20));
			multiplicacao.setForeground(Color.BLACK);
			multiplicacao.setBackground(Color.white);
			add(multiplicacao);
			multiplicacao.addActionListener(this::multiplicacao);
			

			
			JButton divisao = new JButton("Dividir");
			divisao.setBounds(490,400,150,30);
			divisao.setFont(new Font("Poppins", Font.PLAIN,20));
			divisao.setForeground(Color.BLACK);
			divisao.setBackground(Color.white);
			add(divisao);
			divisao.addActionListener(this::divisao);
			
	
			painel.add(soma);
			painel.add(subtracao);
			painel.add(multiplicacao);
			painel.add(divisao);
			
			
			
			num2 = new JTextField();
			num2.setBounds(420,300,170,30);
			num2.setFont(new Font("Poppins",Font.PLAIN,30));
			num2.setBackground(Color.white);  
			num2.setForeground(Color.BLACK);
			add(num2);
			
			
			
			num1 = new JTextField();
			num1.setBounds(100,300,170,30);
			num1.setFont(new Font("Poppins",Font.PLAIN,30));
			num1.setBackground(Color.white);
			num1.setForeground(Color.BLACK);
			add(num1);
			
			
			
			JLabel label1 = new JLabel("Numero 1");
			label1.setBounds(100,260,90,50);
			label1.setFont(new Font("Arial",Font.PLAIN,20));
			label1.setForeground(Color.WHITE);
			add(label1);
			
			
			
			JLabel label2 = new JLabel("Numero 2");
			label2.setBounds(420,260,90,50);
			label2.setFont(new Font("Poppins",Font.PLAIN,20));
			label2.setForeground(Color.WHITE);
			
			add(label2);
			
			title = new JLabel("Calculadora Básica");
			title.setBounds(215,20,400,300);
			title.setFont(new Font("Poppins",Font.PLAIN,30));
			title.setForeground(Color.WHITE);
			add(title);
			
			/* adicionando os buttons,TextsFilds,label e title em cima do painel para a imagem ficar no background*/
			painel.add(soma);
			painel.add(subtracao);
			painel.add(multiplicacao);
			painel.add(divisao);
			painel.add(num2);
			painel.add(num1);
			painel.add(label1);
			painel.add(label2);
			painel.add(title);
			
			
			
			this.setLayout(null);
			this.setVisible(true);	
			/* setContentPane serve para mostrar qual painel vai ser principal*/
			  setContentPane(painel);
			}
		
		
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Double numero1 = Double.parseDouble(num1.getText());
			Double numero2 = Double.parseDouble(num2.getText());
			Double soma = numero1 + numero2;


			JOptionPane.showMessageDialog(null,"A soma é: " + soma);
			
			
	}
		
		
		public void subtracao(ActionEvent ActionEvent) {

			Double numero1 = Double.parseDouble(num1.getText());
			Double numero2 = Double.parseDouble(num2.getText());
			Double subtracao = numero1 - numero2;
			
			
			
			JOptionPane.showMessageDialog(null,"O resto é: " + subtracao);
		
	}
		
		
		public void multiplicacao(ActionEvent ActionEvent){
			
			Double numero1 = Double.parseDouble(num1.getText());
			Double numero2 = Double.parseDouble(num2.getText());
			Double multiplicacao = numero1 * numero2;
			
			
			JOptionPane.showMessageDialog(null,"O produto é: " + multiplicacao);
			
	}
		
		
		public void divisao(ActionEvent ActionEvent) {
		
			Double numero1 = Double.parseDouble(num1.getText());
			Double numero2 = Double.parseDouble(num2.getText());
			Double divisao = numero1 / numero2;
			
			
		
			if(numero2 == 0) {
				JOptionPane.showMessageDialog(null,"É impossivel dividir por 0","atenção",JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"O quoeficiente é: " + divisao);
			}
			
			
		
			
	
	}
		
	
		
}

