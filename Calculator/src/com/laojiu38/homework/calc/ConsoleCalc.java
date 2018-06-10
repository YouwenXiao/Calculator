package com.laojiu38.homework.calc;

import java.util.Scanner;

public class ConsoleCalc extends Calc {

	Scanner input = new Scanner(System.in);
	
	@Override
	public double inputFirst() {
		System.out.println("请输入第一个数：");
		return input.nextDouble();
	}
	
	@Override
	public double inputSecond() {
		System.out.println("请输入第二个数：");
		return input.nextDouble();
	}
	
	@Override
	public String inputOperator() {
		System.out.println("请输入运算符：");
		return input.next();
	}
	
	@Override
	public void show(double result) {
		System.out.println("结果是：" + result);
	}
	
	
	public static void main(String[] args) {
		new ConsoleCalc().calc();
	}

}
