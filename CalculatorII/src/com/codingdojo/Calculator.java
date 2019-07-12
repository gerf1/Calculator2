package com.codingdojo;

import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator implements java.io.Serializable {
	private ArrayList<Double> numbers;
	private ArrayList<Character> operations; // Operation stored as character for optimization

	public Calculator() {
		ArrayList<Double> numbers = new ArrayList<Double>();
		ArrayList<Character> operations = new ArrayList<Character>();
		this.numbers = numbers;
		this.operations = operations;
	}

	public void performOperation(Double num) {
		setNumbers(num);
	}

	public void performOperation(Character op) {
		setOperations(op);
	}

	public Object getResults() throws ScriptException {
		Double result = (double) 0;
		String equation = "";
		Double total = (double) 0;
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");        

		Character operation;
		System.out.println(this.numbers.size());


		
		for (int i = this.operations.size()-1;  i>=0 ; i--) {
			
			   if (i==this.operations.size()-1) {	
	                equation += "";
	      		    }
	                else {
	                    equation +=this.operations.get(i);

	                }
             
              
      		for (int x = i;  x<=i; x++) {
                 
                equation +=this.numbers.get(i);


      		}

		}

		return engine.eval(equation);
	}

	public ArrayList<Double> getNumbers() {
		return numbers;
	}

	public ArrayList<Character> getOperations() {
		return operations;
	}

	public void setNumbers(Double num) {
		numbers.add(num);
	}

	public void setOperations(Character op) {
		operations.add(op);
	}
}