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

public class Mantenibilidad extends JFrame {

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
					Mantenibilidad frame = new Mantenibilidad();
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
	
	public Mantenibilidad(){
		
	}
	
	public Mantenibilidad(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 481, 216);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Capacidad del codigo de ser analizado", null, panel, "Capacidad para diagnosticar deficiencias, causas de los fallos o partes que han de ser modificadas.");
		panel.setLayout(null);
		
		JLabel lblACapacidadDel = new JLabel("Caracteristicas a medir:");
		lblACapacidadDel.setBounds(4, 0, 254, 15);
		panel.add(lblACapacidadDel);
		lblACapacidadDel.setToolTipText("");
		lblACapacidadDel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente1 = new JRadioButton("m\u00E1s del 30% del c\u00F3digo comentado y m\u00E9todos con encabezado.");
		btnExcelente1.setBounds(4, 67, 516, 23);
		panel.add(btnExcelente1);
		bg1.add(btnExcelente1);
		
		JRadioButton btnBueno1 = new JRadioButton("entre 30% o m\u00E1s de c\u00F3digo comentado y m\u00E9todos con encabezado.");
		btnBueno1.setBounds(4, 93, 516, 23);
		panel.add(btnBueno1);
		bg1.add(btnBueno1);
		
		JRadioButton btnRegular1 = new JRadioButton("entre 15% y 29% de c\u00F3digo comentado y m\u00E9todos con encabezado.");
		btnRegular1.setBounds(4, 119, 516, 23);
		panel.add(btnRegular1);
		bg1.add(btnRegular1);
		
		JRadioButton btnMalo1 = new JRadioButton("14% o menos del 10% de c\u00F3digo comentado y m\u00E9todos con encabezado.");
		btnMalo1.setBounds(4, 145, 516, 23);
		panel.add(btnMalo1);
		bg1.add(btnMalo1);
		
		JLabel lblNewLabel = new JLabel("Porcentaje de comentarios que posee el c\u00F3digo por cada m\u00E9todo y en general.");
		lblNewLabel.setBounds(14, 22, 495, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("El software posee encabezados en sus m\u00E9todos con su descripci\u00F3n.");
		lblNewLabel_1.setBounds(14, 39, 477, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Capacidad del codigo de ser cambiado", null, panel_1, "Capacidad que permite que una determinada modificaci\u00F3n sea implementada. ");
		panel_1.setLayout(null);
		
		JLabel lblBCapacidadDel = new JLabel("Caracteristicas a medir:");
		lblBCapacidadDel.setBounds(0, 0, 230, 15);
		panel_1.add(lblBCapacidadDel);
		lblBCapacidadDel.setToolTipText("");
		lblBCapacidadDel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bg2 = new ButtonGroup();
		
		JRadioButton btnExcelente2 = new JRadioButton("la complejidad ciclom\u00E1tica es menor a 10%");
		btnExcelente2.setBounds(0, 67, 474, 23);
		panel_1.add(btnExcelente2);
		bg2.add(btnExcelente2);
		
		JRadioButton btnBueno2 = new JRadioButton("la complejidad ciclom\u00E1tica est\u00E1 entre 11 y 15");
		btnBueno2.setBounds(0, 93, 456, 23);
		panel_1.add(btnBueno2);
		bg2.add(btnBueno2);
		
		JRadioButton btnRegular2 = new JRadioButton("la complejidad ciclom\u00E1tica est\u00E1 entre 16 y 25");
		btnRegular2.setBounds(0, 119, 511, 23);
		panel_1.add(btnRegular2);
		bg2.add(btnRegular2);
		
		JRadioButton btnMalo2 = new JRadioButton("la complejidad ciclom\u00E1tica es mayor a 26");
		btnMalo2.setBounds(0, 145, 511, 23);
		panel_1.add(btnMalo2);
		bg2.add(btnMalo2);
		
		JLabel lblNewLabel_2 = new JLabel("se toma en cuenta la  complejidad ciclom\u00E1tica del m\u00E9todo.");
		lblNewLabel_2.setBounds(14, 22, 474, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Estabilidad", null, panel_2, "Capacidad para evitar efectos inesperados debidos a modificaciones del software.");
		panel_2.setLayout(null);
		
		bg3 = new ButtonGroup();
		
		JRadioButton btnExcelente3 = new JRadioButton("el software no presenta fallas en ninguna prueba.");
		btnExcelente3.setBounds(0, 67, 521, 23);
		panel_2.add(btnExcelente3);
		bg3.add(btnExcelente3);
		
		JLabel lblCEstabilidad = new JLabel("Caracteristicas a medir:");
		lblCEstabilidad.setBounds(0, 0, 178, 15);
		panel_2.add(lblCEstabilidad);
		lblCEstabilidad.setToolTipText("");
		lblCEstabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton btnBueno3 = new JRadioButton("el software presenta un promedio de 1 falla por prueba.");
		btnBueno3.setBounds(0, 93, 533, 23);
		panel_2.add(btnBueno3);
		bg3.add(btnBueno3);
		
		JRadioButton btnRegular3 = new JRadioButton("el software presenta un promedio entre 2 y 4 fallas por prueba.");
		btnRegular3.setBounds(0, 119, 495, 23);
		panel_2.add(btnRegular3);
		bg3.add(btnRegular3);
		
		JRadioButton btnMalo3 = new JRadioButton("el software presenta un promedio de m\u00E1s de 5 fallas por prueba.");
		btnMalo3.setBounds(0, 145, 495, 23);
		panel_2.add(btnMalo3);
		bg3.add(btnMalo3);
		
		JLabel lblNewLabel_3 = new JLabel("Se eval\u00FAa el promedio de fallas que presenta el producto por prueba.");
		lblNewLabel_3.setBounds(14, 22, 466, 14);
		panel_2.add(lblNewLabel_3);
		
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		button.setBounds(401, 248, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.puntajes.set(3, (float) 0);
				
				boolean carac1=false, carac2 = false,carac3 = false;
				carac1 = get_puntaje(btnExcelente1,btnBueno1,btnRegular1,btnMalo1);
				carac2 = get_puntaje(btnExcelente2,btnBueno2,btnRegular2,btnMalo2);
				carac3 = get_puntaje(btnExcelente3,btnBueno3,btnRegular3,btnMalo3);
				
				if(carac1 && carac2 && carac3){
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ principal.puntajes.get(3) , "Puntaje", getDefaultCloseOperation());
					principal.btnMantenibilidad.setForeground(Color.RED);
					principal.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
				
			}
		});
		button_1.setBounds(10, 248, 89, 23);
		contentPane.add(button_1);
	}
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(3, principal.puntajes.get(3)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(3, principal.puntajes.get(3)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(3,principal.puntajes.get(3)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(3,principal.puntajes.get(3)+ malo);
			return true;
		}
		return false;
	}

}
