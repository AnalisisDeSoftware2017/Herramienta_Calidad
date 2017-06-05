package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultadosFinales extends JFrame {

	private JPanel contentPane;
	public algoritmo principal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosFinales frame = new ResultadosFinales();
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
	
	public ResultadosFinales() {
	
	}
	
	public ResultadosFinales(algoritmo principal) {
		this.principal = principal;
		setTitle("Algoritmo de Calidad - Grupo 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gracias por calificar nuestro producto!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 25, 245, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puntajes:");
		lblNewLabel_1.setBounds(10, 60, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFuncionalidad = new JLabel("Funcionalidad");
		lblFuncionalidad.setBounds(10, 85, 129, 14);
		contentPane.add(lblFuncionalidad);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setBounds(10, 110, 129, 14);
		contentPane.add(lblEficiencia);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setBounds(10, 135, 129, 14);
		contentPane.add(lblFiabilidad);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setBounds(222, 85, 129, 14);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setBounds(222, 110, 129, 14);
		contentPane.add(lblUsabilidad);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setBounds(222, 135, 129, 14);
		contentPane.add(lblPortabilidad);
		
		JLabel ptosFunc = new JLabel("");
		ptosFunc.setBounds(131, 85, 63, 14);
		contentPane.add(ptosFunc);
		
		JLabel ptosEfic = new JLabel("");
		ptosEfic.setBounds(131, 110, 63, 14);
		contentPane.add(ptosEfic);
		
		JLabel ptosFiab = new JLabel("");
		ptosFiab.setBounds(131, 135, 63, 14);
		contentPane.add(ptosFiab);
		
		JLabel ptosMant = new JLabel("");
		ptosMant.setBounds(361, 85, 63, 14);
		contentPane.add(ptosMant);
		
		JLabel ptosUsab = new JLabel("");
		ptosUsab.setBounds(361, 110, 63, 14);
		contentPane.add(ptosUsab);
		
		JLabel ptosPort = new JLabel("");
		ptosPort.setBounds(361, 135, 63, 14);
		contentPane.add(ptosPort);
		
		// pongo el total final de cada caracteristica (segun modelo de calidad)
		principal.puntajes.set(0, principal.puntajes.get(0)/2 );
		principal.puntajes.set(1, principal.puntajes.get(1)/2 );
		principal.puntajes.set(2, principal.puntajes.get(2)/2 );
		principal.puntajes.set(3, principal.puntajes.get(3)/3 );
		principal.puntajes.set(4, principal.puntajes.get(4)/3 );
		principal.puntajes.set(5, principal.puntajes.get(5)/2 );
		
		ptosFunc.setText(principal.puntajes.get(0).toString());
		ptosEfic.setText(principal.puntajes.get(1).toString());
		ptosFiab.setText(principal.puntajes.get(2).toString());
		ptosMant.setText(principal.puntajes.get(3).toString());
		ptosUsab.setText(principal.puntajes.get(4).toString());
		ptosPort.setText(principal.puntajes.get(5).toString());
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(34, 191, 91, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel textResultadoFinal = new JLabel("");
		textResultadoFinal.setFont(new Font("Tahoma", Font.BOLD, 14));
		textResultadoFinal.setBounds(162, 189, 163, 14);
		contentPane.add(textResultadoFinal);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		// si algun puntaje de alguna caracteristica, es menor a 70, significa q fue calificada como malo o regular, 
		// entonces resulta ser insatisfactorio para nuestro modelo de calidad
	
		if( principal.puntajes.get(0) < 70|| principal.puntajes.get(1) < 70 || principal.puntajes.get(2) < 70 ||
				principal.puntajes.get(3) < 70 || principal.puntajes.get(4) <70 || principal.puntajes.get(5) < 70 ){
			
			textResultadoFinal.setText("INSATISFACTORIO");
			JOptionPane.showMessageDialog(null, "Alguna de las caracteristicas obtuvo un puntaje menor a 70 (Regular y/o Malo), por lo tanto, resulta ser INSATISFACTORIO", "Resultado", getDefaultCloseOperation());
		}
		else{
			//si todos son mayores a 70, entonces se puede calificar como bueno o excelente, segun el puntaje total.
			float puntaje_total =(principal.puntajes.get(0) + principal.puntajes.get(1) +  principal.puntajes.get(2) + principal.puntajes.get(3) + principal.puntajes.get(4) + principal.puntajes.get(5))/6;
			String resultado;
			
			if(puntaje_total <= 90)
					resultado = "bueno";
			else
					resultado = "excelente";
				
				textResultadoFinal.setText("SATISFACTORIO");
				JOptionPane.showMessageDialog(null, "el resultado es: "+ resultado, "Resultado", getDefaultCloseOperation());
		}
		
	}
}
