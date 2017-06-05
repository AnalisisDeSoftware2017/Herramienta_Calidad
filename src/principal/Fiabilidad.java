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

public class Fiabilidad extends JFrame {

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
					Fiabilidad frame = new Fiabilidad();
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
	
	
	public Fiabilidad(){
		
	}
	
	public Fiabilidad(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 478, 263);
		contentPane.add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(7, 24, 453, 226);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tolerancia a fallos", null, panel_1, "Capacidad para mantener un nivel especificado de prestaciones en caso de fallos.");
		panel_1.setLayout(null);
		
		JLabel lblAToleranciaA = new JLabel("Caracteristicas a medir:");
		lblAToleranciaA.setBounds(6, 0, 178, 15);
		panel_1.add(lblAToleranciaA);
		lblAToleranciaA.setToolTipText("");
		lblAToleranciaA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		bg1 = new ButtonGroup();
		
		JRadioButton btnExcelente1 = new JRadioButton("Cumple las tres caracteristicas");
		btnExcelente1.setBounds(6, 90, 394, 23);
		panel_1.add(btnExcelente1);
		bg1.add(btnExcelente1);
		
		JRadioButton btnBueno1 = new JRadioButton("Cumple dos de las tres caracteristicas");
		btnBueno1.setBounds(6, 116, 394, 23);
		panel_1.add(btnBueno1);
		bg1.add(btnBueno1);
		
		JRadioButton btnRegular1 = new JRadioButton("Cumple una de las tres caracteristicas");
		btnRegular1.setBounds(6, 142, 382, 23);
		panel_1.add(btnRegular1);
		bg1.add(btnRegular1);
		
		JRadioButton btnMalo1 = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo1.setBounds(6, 168, 375, 23);
		panel_1.add(btnMalo1);
		bg1.add(btnMalo1);
		
		JLabel lblNewLabel = new JLabel("Cuando sucede un error, se protegen los datos procesados");
		lblNewLabel.setBounds(14, 22, 451, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cuando sucede un error, el software informa al usuario la situaci\u00F3n");
		lblNewLabel_1.setBounds(14, 39, 451, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cuando sucede un error, el software loguea las excepciones");
		lblNewLabel_2.setBounds(14, 56, 451, 15);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Capacidad de recuperacion de errores", null, panel_2, "Capacidad para reestablecer un nivel de prestaciones especificado y de recuperar los datos afectados. ");
		panel_2.setLayout(null);
		
		bg2 = new ButtonGroup();
		
		JRadioButton btnMalo2 = new JRadioButton("No cumple ninguna caracteristica");
		btnMalo2.setBounds(0, 168, 422, 23);
		panel_2.add(btnMalo2);
		bg2.add(btnMalo2);
		
		JRadioButton btnRegular2 = new JRadioButton("Solo cumple una de las tres caracteristicas");
		btnRegular2.setBounds(0, 146, 422, 23);
		panel_2.add(btnRegular2);
		bg2.add(btnRegular2);
		
		JRadioButton btnBueno2 = new JRadioButton("Cumple dos de las tres caracteristicas");
		btnBueno2.setBounds(0, 120, 410, 23);
		panel_2.add(btnBueno2);
		bg2.add(btnBueno2);
		
		JRadioButton btnExcelente2 = new JRadioButton("Cumple las tres caracteristicas");
		btnExcelente2.setBounds(0, 94, 422, 23);
		panel_2.add(btnExcelente2);
		bg2.add(btnExcelente2);
		
		JLabel lblBCapacidadDe = new JLabel("Caracteristicas a medir:");
		lblBCapacidadDe.setBounds(0, 0, 243, 15);
		panel_2.add(lblBCapacidadDe);
		lblBCapacidadDe.setToolTipText("");
		lblBCapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_3 = new JLabel("Capacidad para reanudar su ejecuci\u00F3n luego de un fallo. ");
		lblNewLabel_3.setBounds(14, 22, 451, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("En caso de falla, vuelve a su estado anterior antes de ejecutarse.");
		lblNewLabel_4.setBounds(14, 39, 451, 15);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Capacidad para brindar una descripci\u00F3n sobre las fallas que se presentan.");
		lblNewLabel_5.setBounds(14, 56, 451, 14);
		panel_2.add(lblNewLabel_5);
		
		JButton button = new JButton("Aceptar");
		button.setBounds(10, 262, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(370, 262, 89, 23);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.puntajes.set(2, (float) 0);
				
				boolean carac1=false, carac2 = false;
				carac1 = get_puntaje(btnExcelente1,btnBueno1,btnRegular1,btnMalo1);
				carac2 = get_puntaje(btnExcelente2,btnBueno2,btnRegular2,btnMalo2);
				
				if(carac1 && carac2){
					JOptionPane.showMessageDialog(null, "Puntaje total de la caracteristica:"+ principal.puntajes.get(2) , "Puntaje", getDefaultCloseOperation());
					principal.btnFiabilidad.setForeground(Color.RED);
					principal.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para cada subcaracteristica", "Error", getDefaultCloseOperation());
				}
			}
		});
	}
	public boolean get_puntaje( JRadioButton btnEx, JRadioButton btnBu, JRadioButton btnReg, JRadioButton btnMalo ){
		if( btnEx.isSelected() ){
			principal.puntajes.set(2, principal.puntajes.get(2)+ exc);
			return true;
		}
		if( btnBu.isSelected() ){
			principal.puntajes.set(2, principal.puntajes.get(2)+ bueno);
			return true;
		}
		if( btnReg.isSelected() ){
			principal.puntajes.set(2,principal.puntajes.get(2)+ reg);
			return true;
		}
		if( btnMalo.isSelected() ){
			principal.puntajes.set(2,principal.puntajes.get(2)+ malo);
			return true;
		}
		return false;
	}
}

