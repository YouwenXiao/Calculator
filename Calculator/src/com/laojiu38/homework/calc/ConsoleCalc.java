package com.laojiu38.homework.calc;

import java.util.Scanner;

public class ConsoleCalc extends Calc {

	Scanner input = new Scanner(System.in);
	
	@Override
	public double inputFirst() {
		System.out.println("�������һ������");
		return input.nextDouble();
	}
	
	@Override
	public double inputSecond() {
		System.out.println("������ڶ�������");
		return input.nextDouble();
	}
	
	@Override
	public String inputOperator() {
		System.out.println("�������������");
		return input.next();
	}
	
	@Override
	public void show(double result) {
		System.out.println("����ǣ�" + result);
	}
	
	
	public static void main(String[] args) {
		new ConsoleCalc().calc();
	}

}
