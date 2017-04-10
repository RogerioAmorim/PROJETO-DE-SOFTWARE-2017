import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Troca_de_bilhete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Troca_de_bilhete frame = new Troca_de_bilhete();
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
	public Troca_de_bilhete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrocaDeBilhete = new JLabel("Troca de Bilhete");
		lblTrocaDeBilhete.setBounds(166, 11, 84, 14);
		contentPane.add(lblTrocaDeBilhete);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(113, 88, 84, 20);
		contentPane.add(textPane);
		
		JLabel lblQuantidaDeBilhetes = new JLabel("Quantida de bilhetes");
		lblQuantidaDeBilhetes.setBounds(10, 63, 99, 14);
		contentPane.add(lblQuantidaDeBilhetes);
		
		JLabel lblValorDeBilhete = new JLabel("Valor de bilhete");
		lblValorDeBilhete.setBounds(20, 88, 74, 14);
		contentPane.add(lblValorDeBilhete);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(113, 57, 84, 20);
		contentPane.add(textPane_1);
		
		JLabel lblFormasDeTroca = new JLabel("Formas de troca");
		lblFormasDeTroca.setBounds(158, 129, 92, 20);
		contentPane.add(lblFormasDeTroca);
		
		JRadioButton rdbtnDevoluoTotalDo = new JRadioButton("Devolu\u00E7\u00E3o total do dinheiro");
		rdbtnDevoluoTotalDo.setBounds(122, 173, 157, 23);
		contentPane.add(rdbtnDevoluoTotalDo);
		
		JRadioButton rdbtnAquisioDeUm = new JRadioButton("Aquisi\u00E7\u00E3o de um novo bilhete");
		rdbtnAquisioDeUm.setBounds(122, 197, 190, 23);
		contentPane.add(rdbtnAquisioDeUm);
	}
}
