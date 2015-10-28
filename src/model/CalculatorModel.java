package model;

public class CalculatorModel {
	 
    private float sum;
    private float diff;
    private float prod;
    private float div;
          
    public float getSum(float fNumber,float sNumber)
    {
           sum=fNumber+sNumber;
           return sum;
    }
   
   
    public float getDiff(float fNumber,float sNumber)
    {
           diff=fNumber-sNumber;
           return diff;
    }
   
   
    public float getProd(float fNumber,float sNumber)
    {
           prod=fNumber*sNumber;
           return prod;
    }

   
    public float getDivide(float fNumber,float sNumber)
    {
           div=fNumber/sNumber;
           return div;
    }
   


}
