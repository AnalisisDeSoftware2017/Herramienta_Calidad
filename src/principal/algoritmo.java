package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class algoritmo extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	public static algoritmo frame;
	public static ArrayList<Float> puntajes = new ArrayList<Float>(); 	
	JButton btnFuncionalidad , btnEficiencia, btnMantenibilidad, btnUsabilidad, btnPortabilidad, btnFiabilidad;
																			/* lista donde voy a guardar los puntajes de todas las caracterisiticas:
	         																posicion 0 = Funcionalidad
																			posicion 1 = Eficiencia
																			posicion 2 = Fiabilidad
																			posicion 3 = Mantenibilidad
																			posicion 4 = Usabilidad
																			posicion 5 = Portabilidad */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new algoritmo();
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
	
	
	
	public algoritmo() {
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int x =0; x <6; x++ )     //Inicializo la lista con -1 para despues saber si todas las caracteristicas fueron evaluadas
		 puntajes.add((float) -1);
		
		
		btnFuncionalidad = new JButton("Funcionalidad");
		btnFuncionalidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionalidad ventana = new Funcionalidad(frame);    //En cada boton, creo una nueva instancia de cada caracteristica (en este caso funcionalidad)
				ventana.setVisible(true);							// y le paso como parametro "frame" que es la instancia de "algoritmo", de esta forma puedo acceder
																	// a la lista de puntajes y modificarla desde todas las demas clases sin perder los valores. 
				frame.setVisible(false);							
		
			}
		});
		
		btnFuncionalidad.setBounds(28, 73, 128, 22);
		contentPane.add(btnFuncionalidad);
		
		btnEficiencia = new JButton("Eficiencia");
		btnEficiencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eficiencia ventana = new Eficiencia(frame);
				ventana.setVisible(true);
				frame.setVisible(false);

			}
		});
		btnEficiencia.setBounds(28, 116, 128, 22);
		contentPane.add(btnEficiencia);
		
		btnFiabilidad = new JButton("Fiabilidad");
		btnFiabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fiabilidad ventana= new Fiabilidad(frame);
				ventana.setVisible(true);
				frame.setVisible(false);
			
			}
		});
		btnFiabilidad.setBounds(28, 162, 128, 22);
		contentPane.add(btnFiabilidad);
		
		btnMantenibilidad = new JButton("Mantenibilidad");
		btnMantenibilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Mantenibilidad ventana = new Mantenibilidad(frame);
			ventana.setVisible(true);
			frame.setVisible(false);
			
			}
		});
		btnMantenibilidad.setBounds(214, 73, 128, 22);
		contentPane.add(btnMantenibilidad);
		
		btnUsabilidad = new JButton("Usabilidad");
		btnUsabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usabilidad ventana = new Usabilidad(frame);
				ventana.setVisible(true);
				frame.setVisible(false);
							}
		});
		btnUsabilidad.setBounds(214, 116, 128, 22);
		contentPane.add(btnUsabilidad);
		
		btnPortabilidad = new JButton("Portabilidad");
		btnPortabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Portabilidad ventana = new Portabilidad(frame);
				ventana.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnPortabilidad.setBounds(214, 162, 128, 22);
		contentPane.add(btnPortabilidad);
		
		JLabel lblNewLabel = new JLabel("Elija la caracteristica a evaluar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 30, 172, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 228, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVerResultado = new JButton("ver resultado");			
		btnVerResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						//Con el boton de ver resultado, me voy a la ventana de "resultados finales"
																				// pero antes verifico si todas las caracteristicas fueron evaluadas
				boolean correcto = false;
				
				for(int x =0; x < 6; x++){
					if( puntajes.get(x)!=-1)
						correcto = true;
					else
						correcto = false;
				}
				
				if(correcto){
					ResultadosFinales ventana = new ResultadosFinales(frame);
					ventana.setVisible(true);
					frame.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Todas las caracteristicas deben estar evaluadas previamente.", "Error", getDefaultCloseOperation());
				}
				
			}
		});
		btnVerResultado.setBounds(10, 228, 115, 23);
		contentPane.add(btnVerResultado);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
