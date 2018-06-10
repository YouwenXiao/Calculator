package com.laojiu38.homework.calc;


/**
 * ����һ��������
 *
 * @���ߣ�
 * @�ص㣺
 * @ʱ�䣺
 *
 */

public abstract class Calc {
	
	public abstract double inputFirst();
	public abstract double inputSecond();
	public abstract String inputOperator();
	
	/**
	 * ��������ҵ������
	 * @return
	 */
	public void calc() {
		double first = inputFirst();
		String operator = inputOperator();
		double second = inputSecond();
		//�õ�һ�������Ķ���
		Calcor calcor = getCalcor(operator);
		//����Ľ��
		double result = calcor.calc(first, second);
		show(result);
	}
		
	public abstract void show(double result);
	
	/**
	 * �õ�һ��������CPU
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
