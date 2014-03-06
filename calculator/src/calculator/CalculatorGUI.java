package calculator;

public class CalculatorGUI {
	private String operator;
	private int result;
	private int operand;
	/**creates a new calculator instance
	 * @return */
	public void Calculator(){
		//void
	}
	
	/** returns the operator*/
	public String getOperator(){
		return operator;
	}
	
	/**returns result*/
	public int getResult(){
		return result;
	}
	
	public int getOperand(){
		return operand;
	}
	
	/**buttonpressed*/
	public void numberButtonPressed(int number){
		operand = operand*10+number;
	}
	
	/**clears all including operand and result*/
	public void clear(){
		operator = "";
		result = 0;
		operand = 0;
	}
	
	public void plus(){
		result =operand;
		operand = 0;
		operator= "+";
	}
	
	public void minus(){
		result = operand;
		operand =0;
		operator = "-";
		
	}
	
	public void mult(){
		result =operand;
		operand = 0;
		operator = "*";
	}
	
	public void equals(){
		if(operator.equals("*")){
			result = result * operand;
		} else if (operator.equals("-")){
			result = result - operand;
		}else if(operator.equals("+")){
			result = result + operand;
		}
		operand = 0;
	}
}
