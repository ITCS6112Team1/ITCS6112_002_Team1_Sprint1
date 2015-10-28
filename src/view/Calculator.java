package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import main.MainMethod;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnNormalCalculator = new JButton("Normal Calculator");
		btnNormalCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MainMethod nw = new MainMethod();
				nw.Redirect();
			}
		});
		btnNormalCalculator.setBounds(122, 65, 221, 50);
		frmCalculator.getContentPane().add(btnNormalCalculator);
		
		JButton btnScientificCalculator = new JButton("Scientific Calculator");
		btnScientificCalculator.setBounds(122, 163, 221, 50);
		frmCalculator.getContentPane().add(btnScientificCalculator);
	}
}