package com.laojiu38.homework.calc;


/**
 * 描述一个计算器
 *
 * @作者：
 * @地点：
 * @时间：
 *
 */

public abstract class Calc {
	
	public abstract double inputFirst();
	public abstract double inputSecond();
	public abstract String inputOperator();
	
	/**
	 * 计算器的业务流程
	 * @return
	 */
	public void calc() {
		double first = inputFirst();
		String operator = inputOperator();
		double second = inputSecond();
		//得到一个会计算的对象
		Calcor calcor = getCalcor(operator);
		//计算的结果
		double result = calcor.calc(first, second);
		show(result);
	}
		
	public abstract void show(double result);
	
	/**
	 * 得到一个会计算的CPU
	 * @return
	 */
	public Calcor getCalcor(String opertor) {
		Calcor calcor = null;
		switch (opertor) {
		case "+":
			calcor = new CalcorAdd();
			break;
		case "-":
			calcor = new CalcorMinus();
			break;
		case "*":
			calcor = new CalcorMul();
			break;
		case "/":
			calcor = new CalcorDiv();
			break;
		default:
			break;
		}
		return calcor;
	}
}
