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

public class Usabilidad extends JFrame {

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
					Usabilidad frame = new Usabilidad();
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
	
	public Usabilidad(){
	
	}

	public Usabilidad(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 549, 256);
		contentPane.add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 533, 246);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Capacidad de ser entendido", null, panel_1, "Capacidad que permite al usuario entender si el software es adecuado y c\u00F3mo puede ser usado.");
		panel_1.setLayout(null);
		
		JLabel lblACapacidadDe = new JLabel("Caracteristicas a medir:");
		lblACapacidadDe.setBounds(4, 0, 254, 15);
		panel_1.add(lblACapacidadDe);
		lblACapacidadDe.setToolTipText("");
		lblACapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente1 = new JRadioButton("Cumple todas las caracteristicas");
		btnExcelente1.setBounds(6, 88, 394, 23);
		panel_1.add(btnExcelente1);
		bg1.add(btnExcelente1);
		
		JRadioButton btnBueno1 = new JRadioButton("Cumple tres o cuatro de las cuatro caracteristicas");
		btnBueno1.setBounds(6, 114, 516, 23);
		panel_1.add(btnBueno1);
		bg1.add(btnBueno1);
		
		JRadioButton btnRegular1 = new JRadioButton("Cumple una o dos de las caracteristicas");
		btnRegular1.setBounds(4, 140, 507, 23);
		panel_1.add(btnRegular1);
		bg1.add(btnRegular1);
		
		JRadioButton btnMalo1 = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo1.setBounds(4, 165, 518, 23);
		panel_1.add(btnMalo1);
		bg1.add(btnMalo1);
		
		JLabel lblNewLabel = new JLabel("El software posee manual de uso para el usuario.");
		lblNewLabel.setBounds(14, 22, 497, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("El software ofrece una ayuda contextual para el usuario.");
		lblNewLabel_1.setBounds(14, 39, 508, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("El software ofrece un instructivo.");
		lblNewLabel_2.setBounds(14, 56, 504, 15);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("El software provee ejemplos de sus funcionalidades para el usuario.");
		lblNewLabel_3.setBounds(14, 73, 497, 14);
		panel_1.add(lblNewLabel_3);
		
			
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Capacidad de ser operado", null, panel_2, "Capacidad que permite al usuario operarlo y controlarlo. ");
		panel_2.setLayout(null);
		
		JLabel lblBCapacidadDe = new JLabel("Caracteristicas a medir:");
		lblBCapacidadDe.setBounds(0, 0, 230, 15);
		panel_2.add(lblBCapacidadDe);
		lblBCapacidadDe.setToolTipText("");
		lblBCapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg2 = new ButtonGroup();
		
		JRadioButton btnExcelente2 = new JRadioButton("el usuario puede usar el producto sin ayuda adicional");
		btnExcelente2.setBounds(0, 56, 518, 23);
		panel_2.add(btnExcelente2);
		bg2.add(btnExcelente2);
		
		JRadioButton btnBueno2 = new JRadioButton("el usuario puede usar el producto con la ayuda contextual");
		btnBueno2.setBounds(0, 82, 518, 23);
		panel_2.add(btnBueno2);
		bg2.add(btnBueno2);
		
		JRadioButton btnRegular2 = new JRadioButton("el usuario necesita acudir al instructivo y/o revisar ejemplos de uso");
		btnRegular2.setBounds(0, 108, 518, 23);
		panel_2.add(btnRegular2);
		bg2.add(btnRegular2);
		
		JRadioButton btnMalo2 = new JRadioButton("el usuario requiere ayuda profesional para poder usar el software");
		btnMalo2.setBounds(0, 134, 518, 23);
		panel_2.add(btnMalo2);
		bg2.add(btnMalo2);
		
		JLabel lblNewLabel_5 = new JLabel("Capacidad del usuario para utilizar el software sin asistencia adicional");
		lblNewLabel_5.setBounds(14, 22, 504, 14);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Capacidad de ser atractivo para el usuario", null, panel_3, "Capacidad para ser atractivo al usuario.");
		panel_3.setLayout(null);
		
		bg3 = new ButtonGroup();
		
		
		JRadioButton btnExcelente3 = new JRadioButton("Cumple todas las caracteristicas");
		btnExcelente3.setBounds(0, 71, 391, 23);
		panel_3.add(btnExcelente3);
		bg3.add(btnExcelente3);
		
		JLabel lblCCapacidadDe = new JLabel("Caracteristicas a medir:");
		lblCCapacidadDe.setBounds(0, 0, 298, 15);
		panel_3.add(lblCCapacidadDe);
		lblCCapacidadDe.setToolTipText("");
		lblCCapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		
		JRadioButton btnBueno3 = new JRadioButton("Solo cumple dos de las tres caracteristicas");
		btnBueno3.setBounds(0, 97, 411, 23);
		panel_3.add(btnBueno3);
		bg3.add(btnBueno3);
		
		JRadioButton btnRegular3 = new JRadioButton("Solo cumple una de las tres caracteristicas");
		btnRegular3.setBounds(0, 123, 411, 23);
		panel_3.add(btnRegular3);
		bg3.add(btnRegular3);
		
		JRadioButton btnMalo3 = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo3.setBounds(0, 149, 391, 23);
		panel_3.add(btnMalo3);
		bg3.add(btnMalo3);
		
		JLabel lblNewLabel_6 = new JLabel("Utilizaci\u00F3n sencilla de las funciones del programa");
		lblNewLabel_6.setBounds(14, 22, 504, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Funciones ordenadas");
		lblNewLabel_7.setBounds(14, 39, 482, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Software intuitivo");
		lblNewLabel_8.setBounds(14, 56, 504, 14);
		panel_3.add(lblNewLabel_8);
		
		
		JButton button = new JButton("Cancelar");
		button.setBounds(447, 260, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.setBounds(10, 260, 89, 23);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal.puntajes.set(4, (float) 0);
				
				boolean carac1=false, carac2 = false,carac3 = false;
				carac1 = get_puntaje(btnExcelente1,btnBueno1,btnRegular1,btnMalo1);
				carac2 = get_puntaje(btnExcelente2,btnBueno2,btnRegular2,btnMalo2);
				carac3 = get_puntaje(btnExcelente3,btnBueno3,btnRegular3,btnMalo3);
				
				if(carac1 && carac2 && carac3){
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ Math.round(principal.puntajes.get(4)/3) , "Puntaje", getDefaultCloseOperation());
					principal.btnUsabilidad.setForeground(Color.RED);
					principal.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
	}
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(4, principal.puntajes.get(4)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(4, principal.puntajes.get(4)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(4,principal.puntajes.get(4)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(4,principal.puntajes.get(4)+ malo);
			return true;
		}
		return false;
	}
}
