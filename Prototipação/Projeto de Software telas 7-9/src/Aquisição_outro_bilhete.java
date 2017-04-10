import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Aquisição_outro_bilhete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aquisição_outro_bilhete frame = new Aquisição_outro_bilhete();
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
	public Aquisição_outro_bilhete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuantidaDeNovos = new JLabel("Quantidade de novos bilhetes");
		lblQuantidaDeNovos.setBounds(10, 39, 153, 14);
		contentPane.add(lblQuantidaDeNovos);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(160, 39, 70, 14);
		contentPane.add(textPane);
		
		JLabel lblValorPorBilhete = new JLabel("Valor por bilhete\r\n");
		lblValorPorBilhete.setBounds(10, 63, 84, 14);
		contentPane.add(lblValorPorBilhete);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(93, 64, 70, 14);
		contentPane.add(textPane_1);
		
		JLabel lblTotal = new JLabel("Total\r\n");
		lblTotal.setBounds(10, 88, 45, 14);
		contentPane.add(lblTotal);
		
		JLabel lblDiferenaEntreBilhetes = new JLabel("Diferen\u00E7a entre bilhetes extornados\r\n");
		lblDiferenaEntreBilhetes.setBounds(10, 113, 185, 14);
		contentPane.add(lblDiferenaEntreBilhetes);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(38, 88, 70, 14);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(186, 113, 70, 14);
		contentPane.add(textPane_3);
		
		JLabel lblTotalAPagar = new JLabel("TOTAL A PAGAR");
		lblTotalAPagar.setBounds(126, 183, 84, 51);
		contentPane.add(lblTotalAPagar);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(214, 201, 70, 14);
		contentPane.add(textPane_4);
	}

}
