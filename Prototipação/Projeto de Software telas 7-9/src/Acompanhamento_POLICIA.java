import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Acompanhamento_POLICIA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acompanhamento_POLICIA frame = new Acompanhamento_POLICIA();
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
	public Acompanhamento_POLICIA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeOcorrencia = new JLabel("REGISTRO DE OCORRENCIA");
		lblRegistroDeOcorrencia.setBounds(47, 21, 143, 14);
		contentPane.add(lblRegistroDeOcorrencia);
		
		textField = new JTextField();
		textField.setBounds(10, 46, 220, 204);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDadosDaCriana = new JLabel("DADOS DA CRIAN\u00C7A");
		lblDadosDaCriana.setBounds(301, 21, 123, 14);
		contentPane.add(lblDadosDaCriana);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(240, 46, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("IDADE");
		lblIdade.setBounds(240, 66, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblNomeDoPai = new JLabel("NOME DO PAI");
		lblNomeDoPai.setBounds(240, 91, 79, 14);
		contentPane.add(lblNomeDoPai);
		
		JLabel lblNomeDaMe = new JLabel("NOME DA M\u00C3E");
		lblNomeDaMe.setBounds(240, 116, 79, 14);
		contentPane.add(lblNomeDaMe);
		
		JLabel lblOutrosDadosSobre = new JLabel("OUTROS DADOS SOBRE A CRIAN\u00C7A");
		lblOutrosDadosSobre.setBounds(250, 141, 184, 14);
		contentPane.add(lblOutrosDadosSobre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 157, 175, 93);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(275, 46, 134, 14);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(312, 91, 112, 14);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(312, 116, 112, 14);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(275, 66, 29, 14);
		contentPane.add(textPane_3);
	}

}
