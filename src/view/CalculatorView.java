package view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{
	private JButton addButton= new JButton("+");
	private JButton subButton= new JButton("-");
	private JButton mulButton= new JButton("*");
	private JButton divButton= new JButton("/");
	private JButton calculateButton= new JButton("Calculate");
	private JButton Formula= new JButton("Formula");
	private JLabel fN= new JLabel("First Number");
	private JTextField fNumber= new JTextField(5);
	private JTextField sNumber= new JTextField(5);
	private JLabel sol= new JLabel("Solution is");
	private JTextField calcSolution= new JTextField(10);
	private JLabel sN= new JLabel("Second Number");
	
	public CalculatorView()
	{
		JPanel calcPanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(fN);
		calcPanel.add(fNumber);
		calcPanel.add(addButton);
		calcPanel.add(subButton);
		calcPanel.add(mulButton);
		calcPanel.add(divButton);
		calcPanel.add(sN);
		calcPanel.add(sNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(sol);
		calcPanel.add(calcSolution);
		calcPanel.add(Formula);
		
		this.add(calcPanel);
		
		}
	
	public float getFNumber(){
		return Float.parseFloat(fNumber.getText());
	}
	
	public float getSNumber(){
		return Float.parseFloat(sNumber.getText());
		
	}
	
	public float getCalcSolution(){
		return Float.parseFloat(calcSolution.getText());
	}
	
	public void setCalcSolution(float solution){
		calcSolution.setText(Float.toString(solution));// did not understand this
	}

	public void addCalculateListener(ActionListener listenerForCalcButton){
		calculateButton.addActionListener(listenerForCalcButton);
		addButton.addActionListener(listenerForCalcButton);
		subButton.addActionListener(listenerForCalcButton);
		mulButton.addActionListener(listenerForCalcButton);
		divButton.addActionListener(listenerForCalcButton);
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this,errorMessage);
	}

	public void addFormulaListener(ActionListener listenForFormula){
		Formula.addActionListener(listenForFormula);
}

}