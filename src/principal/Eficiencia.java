package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Eficiencia extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg1,bg2;
	public static final int exc = 100;
	public static final int bueno = 70;
	public static final int reg = 40;
	public static final int malo = 0;
	public algoritmo principal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eficiencia frame = new Eficiencia();
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
	
	public Eficiencia(){
		
	}
	
	public Eficiencia(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 20, 490, 210);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Utilizacion de recursos", null, panel, "Capacidad de usar las cantidades y recursos adecuados.");
		panel.setLayout(null);
		
		JLabel lblAUtilizacionDe = new JLabel("Caracteristicas a medir :");
		lblAUtilizacionDe.setBounds(6, 0, 178, 15);
		panel.add(lblAUtilizacionDe);
		lblAUtilizacionDe.setToolTipText("");
		lblAUtilizacionDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente1 = new JRadioButton("Menor o igual al 10% de uso del procesador");
		btnExcelente1.setBounds(6, 53, 405, 23);
		panel.add(btnExcelente1);
		bg1.add(btnExcelente1);
		
		JRadioButton btnBueno1 = new JRadioButton("Entre el 11% y 30% de uso del procesador");
		btnBueno1.setBounds(8, 79, 358, 23);
		panel.add(btnBueno1);
		bg1.add(btnBueno1);
		
		JRadioButton btnRegular1 = new JRadioButton("Entre el 31%y 50% de uso del procesador");
		btnRegular1.setBounds(6, 105, 339, 23);
		panel.add(btnRegular1);
		bg1.add(btnRegular1);
		
		JRadioButton btnMalo1 = new JRadioButton("M\u00E1s del 50% de uso del procesador");
		btnMalo1.setBounds(6, 131, 339, 23);
		panel.add(btnMalo1);
		bg1.add(btnMalo1);
		
		JLabel lblNewLabel = new JLabel("Utilizacion del procesador");
		lblNewLabel.setBounds(14, 22, 295, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comportamiento frente al tiempo", null, panel_1, null);
		panel_1.setLayout(null);
		
		bg2 = new ButtonGroup();
		
		JRadioButton btnMalo2 = new JRadioButton("El software responde en un tiempo mayor a 10 seg. y menor o igual  a 20 seg.");
		btnMalo2.setBounds(6, 143, 473, 29);
		panel_1.add(btnMalo2);
		bg2.add(btnMalo2);
		
		JRadioButton btnRegular2 = new JRadioButton("El software responde en un tiempo mayor a 10 seg. y menor o igual  a 15 seg.");
		btnRegular2.setBounds(6, 111, 473, 29);
		panel_1.add(btnRegular2);
		bg2.add(btnRegular2);
		
		JRadioButton btnBueno2 = new JRadioButton("El software responde en un tiempo mayor a 5 seg.\r\ny menor o igual a 10 seg.");
		btnBueno2.setBounds(6, 79, 473, 29);
		panel_1.add(btnBueno2);
		bg2.add(btnBueno2);
		
		JRadioButton btnExcelente2 = new JRadioButton("El software responde en un tiempo menor o igual a 5 seg.");
		btnExcelente2.setBounds(6, 47, 473, 29);
		panel_1.add(btnExcelente2);
		bg2.add(btnExcelente2);
		
		JLabel lblBComportamientoFrente = new JLabel("Caracteristicas a medir:");
		lblBComportamientoFrente.setBounds(6, 0, 243, 15);
		panel_1.add(lblBComportamientoFrente);
		lblBComportamientoFrente.setToolTipText("");
		lblBComportamientoFrente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Tiempos de respuesta del software ante una determinada operaci\u00F3n");
		lblNewLabel_1.setBounds(14, 22, 398, 29);
		panel_1.add(lblNewLabel_1);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal.puntajes.set(1, (float) 0);
				
				boolean carac1=false, carac2 = false;
				carac1 = get_puntaje(btnExcelente1,btnBueno1,btnRegular1,btnMalo1);
				carac2 = get_puntaje(btnExcelente2,btnBueno2,btnRegular2,btnMalo2);
				
				if(carac1 && carac2){
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ principal.puntajes.get(1)/2 , "Puntaje", getDefaultCloseOperation());
					principal.setVisible(true);
					principal.btnEficiencia.setForeground(Color.RED);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
			}
		});
		button.setBounds(5, 248, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(392, 248, 89, 23);
		contentPane.add(button_1);
	}
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(1, principal.puntajes.get(1)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(1, principal.puntajes.get(1)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(1,principal.puntajes.get(1)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(1,principal.puntajes.get(1)+ malo);
			return true;
		}
		return false;
	}
}
