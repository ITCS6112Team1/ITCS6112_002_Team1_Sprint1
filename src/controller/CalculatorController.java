package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import view.CalculatorView;
import model.CalculatorModel;
import model.Formula;
import model.formulaDao;


public class CalculatorController {
	
	private CalculatorModel theModel;
	private CalculatorView theView;
	public CalculatorController(CalculatorModel theModel, CalculatorView theView) {
		super();
		this.theModel = theModel;
		this.theView = theView;
		this.theView.addCalculateListener(new CalculateListener());
		this.theView.addFormulaListener(new FormulaListener());
	}
	
class CalculateListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		float fNumber,sNumber=0;
		String label = e.getActionCommand();
		try{
			fNumber=theView.getFNumber();
			sNumber=theView.getSNumber();
			
			if(label.equals("+"))
			{
				float result = theModel.getSum(fNumber, sNumber);
				theView.setCalcSolution(result);}
			else if(label.equals("-"))
			{
				float result  = theModel.getDiff(fNumber, sNumber);
				theView.setCalcSolution(result);}
			else if(label.equals("*"))
			{
				float result = theModel.getProd(fNumber, sNumber);
				theView.setCalcSolution(result);}
			else if(label.equals("/")) 
			{
				float result = theModel.getDivide(fNumber, sNumber);
				theView.setCalcSolution(result);}
		}
		catch(NumberFormatException ex){
			theView.displayErrorMessage("Enter valid numbers");
		}
		
	}
	
}	

class FormulaListener implements ActionListener{
	List<Formula> formula;
	@Override
	public void actionPerformed(ActionEvent event) {
		formulaDao fd = new formulaDao();
		try {
			formula = fd.queryFormulaByCatogory();
			for(Formula f:formula){
				System.out.println(f.getName()+" = "+ f.getDisplay());
			}
			
		} catch (Exception e) {
			//printStackTrace();
		}
	}
	
}
}

