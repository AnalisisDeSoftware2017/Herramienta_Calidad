package principal;

import javax.swing.ButtonGroup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

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

public class Portabilidad extends JFrame {

	private JPanel contentPane;
	private ButtonGroup bg1,bg2,bg3 ;
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
					Portabilidad frame = new Portabilidad();
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
	
	public Portabilidad(){
		
	}
	
	public Portabilidad(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 453, 208);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Adaptabilidad", null, panel, "Capacidad para ser adaptado a diferentes entornos.");
		panel.setLayout(null);
		
		JLabel lblAAdaptabilidad = new JLabel("Caracteristicas a medir:");
		lblAAdaptabilidad.setBounds(4, 0, 254, 15);
		panel.add(lblAAdaptabilidad);
		lblAAdaptabilidad.setToolTipText("");
		lblAAdaptabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente1 = new JRadioButton("Funciona en cuatro sistemas operativos");
		btnExcelente1.setBounds(6, 72, 405, 23);
		panel.add(btnExcelente1);
		bg1.add(btnExcelente1);
		
		JRadioButton btnBueno1 = new JRadioButton(" Funciona en tres sistemas operativos");
		btnBueno1.setBounds(4, 98, 407, 23);
		panel.add(btnBueno1);
		bg1.add(btnBueno1);
		
		JRadioButton btnRegular1 = new JRadioButton("Funciona en dos sistemas operativos");
		btnRegular1.setBounds(4, 124, 395, 23);
		panel.add(btnRegular1);
		bg1.add(btnRegular1);
		
		JRadioButton btnMalo1 = new JRadioButton("Funciona \u00FAnicamente en un solo sistema operativo");
		btnMalo1.setBounds(4, 150, 378, 23);
		panel.add(btnMalo1);
		bg1.add(btnMalo1);
		
		JLabel lblNewLabel = new JLabel("Capacidad para adaptarse a diferentes S.O sin cambiar su ");
		lblNewLabel.setBounds(14, 22, 434, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("estructura interna.");
		lblNewLabel_4.setBounds(16, 38, 384, 14);
		panel.add(lblNewLabel_4);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Instalabilidad", null, panel_2, "Capacidad para ser instalado en un entorno especificado.");
		panel_2.setLayout(null);
		
		JLabel lblCInstalabidad = new JLabel("Caracteristicas a medir:");
		lblCInstalabidad.setBounds(0, 0, 298, 15);
		panel_2.add(lblCInstalabidad);
		lblCInstalabidad.setToolTipText("");
		lblCInstalabidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg3 = new ButtonGroup();
		
		JRadioButton btnExcelente3 = new JRadioButton("el producto software se instala en 3 pasos o menos.");
		btnExcelente3.setBounds(6, 72, 390, 23);
		panel_2.add(btnExcelente3);
		bg3.add(btnExcelente3);
		
		JRadioButton btnBueno3 = new JRadioButton("el software se instala entre 4 y 6.");
		btnBueno3.setBounds(6, 98, 390, 23);
		panel_2.add(btnBueno3);
		bg3.add(btnBueno3);
		
		JRadioButton btnRegular3 = new JRadioButton("el software se instala entre 8 y 10.");
		btnRegular3.setBounds(6, 124, 390, 23);
		panel_2.add(btnRegular3);
		bg3.add(btnRegular3);
		
		JRadioButton btnMalo3 = new JRadioButton("el software se instala en m\u00E1s de 10 pasos.");
		btnMalo3.setBounds(6, 150, 372, 23);
		panel_2.add(btnMalo3);
		bg3.add(btnMalo3);
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad de pasos necesarios para instalar el producto software.");
		lblNewLabel_3.setBounds(14, 22, 382, 14);
		panel_2.add(lblNewLabel_3);
		
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal.puntajes.set(5, (float) 0);
				
				boolean carac1=false, carac2 = false;
				carac1 = get_puntaje(btnExcelente1,btnBueno1,btnRegular1,btnMalo1);
				
				carac2 = get_puntaje(btnExcelente3,btnBueno3,btnRegular3,btnMalo3);
				
				if(carac1 && carac2){
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ principal.puntajes.get(5) , "Puntaje", getDefaultCloseOperation());
					principal.btnPortabilidad.setForeground(Color.RED);
					principal.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
			}
		});
		button.setBounds(10, 245, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(316, 245, 89, 23);
		contentPane.add(button_1);
	}
	
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(5, principal.puntajes.get(5)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(5, principal.puntajes.get(5)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(5,principal.puntajes.get(5)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(5,principal.puntajes.get(5)+ malo);
			return true;
		}
		return false;
	}
	
	public boolean get_puntajeDos( JRadioButton btnBu, JRadioButton btnMalo ){
		
		if( btnBu.isSelected() ){
			principal.puntajes.set(5, principal.puntajes.get(5)+ bueno);
			return true;
		}

		if( btnMalo.isSelected() ){
			principal.puntajes.set(5,principal.puntajes.get(5)+ malo);
			return true;
		}
		return false;
	}
}

