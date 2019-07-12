package com.codingdojo;

import javax.script.ScriptException;

public class CalculatorTest {
	public static void main(String[] args) throws ScriptException {
		Calculator t9 = new Calculator();
		t9.performOperation(10.5);
		t9.performOperation('+');
		t9.performOperation(5.2);
		t9.performOperation('*');
		t9.performOperation(10.0);
		t9.performOperation('=');
		System.out.println(t9.getOperations());
		System.out.println(t9.getResults());
	}
}