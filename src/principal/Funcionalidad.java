package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;



public class Funcionalidad extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg1,bg2,bg3 ;
	private static Funcionalidad funcionalidad;
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
					funcionalidad = new Funcionalidad();
					funcionalidad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Funcionalidad(){
	
	}
	
	public Funcionalidad(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 21, 468, 223);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Exactitud de los resultados", null, panel, "Capacidad para proporcionar los resultados o efectos correctos o acordados, con el grado necesario de precision.");
		panel.setLayout(null);
		
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente = new JRadioButton("Cumple las tres caracteristicas");
		btnExcelente.setBounds(0, 87, 399, 23);
		panel.add(btnExcelente);
		bg1.add(btnExcelente);
		
		
		JRadioButton btnBueno = new JRadioButton("Cumple dos de las tres caracteristicas");
		btnBueno.setBounds(0, 113, 411, 23);
		panel.add(btnBueno);
		bg1.add(btnBueno);
		
		JRadioButton btnRegular = new JRadioButton("Solo cumple una de las tres caracteristicas");
		btnRegular.setBounds(0, 139, 411, 23);
		panel.add(btnRegular);
		bg1.add(btnRegular);
		
		JRadioButton btnMalo = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo.setBounds(0, 165, 411, 23);
		panel.add(btnMalo);
		bg1.add(btnMalo);
		
		
		JLabel lblNewLabel = new JLabel("Caracteristicas a medir:");
		lblNewLabel.setBounds(4, 0, 178, 15);
		panel.add(lblNewLabel);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Correcto ingreso y devoluci\u00F3n de datos de pacientes.");
		lblNewLabel_1.setBounds(14, 22, 385, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correcto ingreso y devoluci\u00F3n de datos de enfermedades.");
		lblNewLabel_2.setBounds(14, 39, 389, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correcto ingreso y  devoluci\u00F3n de datos de m\u00E9dicos.");
		lblNewLabel_3.setBounds(14, 56, 385, 14);
		panel.add(lblNewLabel_3);
					
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Seguridad de acceso", null, panel_2, "Capacidad para proteger informacion y datos, denegar acceso no autorizado.");
		panel_2.setLayout(null);
		
		JLabel lblCSeguridadDe = new JLabel("Caracteristicas a medir:");
		lblCSeguridadDe.setBounds(0, 0, 178, 15);
		panel_2.add(lblCSeguridadDe);
		lblCSeguridadDe.setToolTipText("");
		lblCSeguridadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg2 = new ButtonGroup();
		
		JRadioButton btnExcelente3 = new JRadioButton("Cumple las tres caracteristicas");
		btnExcelente3.setBounds(0, 87, 386, 23);
		panel_2.add(btnExcelente3);
		bg2.add(btnExcelente3);
		
		JRadioButton btnBueno3 = new JRadioButton("Cumple dos de las tres caracteristicas");
		btnBueno3.setBounds(0, 113, 411, 23);
		panel_2.add(btnBueno3);
		bg2.add(btnBueno3);
		
		JRadioButton btnRegular3 = new JRadioButton("Solo cumple una de las tres caracteristicas");
		btnRegular3.setBounds(0, 139, 386, 23);
		panel_2.add(btnRegular3);
		bg2.add(btnRegular3);
		
		JRadioButton btnMalo3 = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo3.setBounds(0, 165, 411, 23);
		panel_2.add(btnMalo3);
		bg2.add(btnMalo3);
		
		JLabel lblNewLabel_7 = new JLabel("Inicio de sesi\u00F3n con usuario y contrase\u00F1a.");
		lblNewLabel_7.setBounds(14, 22, 393, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Contrase\u00F1a oculta al momento del login.");
		lblNewLabel_8.setBounds(14, 39, 397, 15);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Controlar nro de intentos al ingresar una pass o user err\u00F3neo.");
		lblNewLabel_9.setBounds(14, 56, 393, 14);
		panel_2.add(lblNewLabel_9);
		
		
		JButton btnVolver = new JButton("Aceptar");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				principal.puntajes.set(0, (float) 0);
								
				boolean carac1=false, carac2 = false;
				carac1 = get_puntaje(btnExcelente,btnBueno,btnRegular,btnMalo);				
				carac2 = get_puntaje(btnExcelente3,btnBueno3,btnRegular3,btnMalo3);
				
				if(carac1 && carac2){  // "si todas las subcaracterisitcas fueron calificadas"
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ principal.puntajes.get(0) , "Puntaje", getDefaultCloseOperation());
					principal.btnFuncionalidad.setForeground(Color.RED);
					principal.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
				
			
			}
		});
		btnVolver.setBounds(6, 255, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(312, 255, 89, 23);
		contentPane.add(btnCancelar);
		
	}
	/**
	 * suma los puntajes de cada subcaracteristica segun el boton que haya sido seleccionado.
	 * Si hay al menos un boton seleccionado, devuelve verdadero
	 * de lo contrario devuelve falso
	 * @param btnEx
	 * @param btnBu
	 * @param btnReg
	 * @param btnMalo
	 * @return
	 */
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(0, principal.puntajes.get(0)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(0, principal.puntajes.get(0)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(0,principal.puntajes.get(0)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(0,principal.puntajes.get(0)+ malo);
			return true;
		}
		return false;
	}
}
