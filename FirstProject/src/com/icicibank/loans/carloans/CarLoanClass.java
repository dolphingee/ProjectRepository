package com.icicibank.loans.carloans;

public class CarLoanClass extends NextClass implements CarInterface1  {

	int i = 10;
	
	public void m1()
	{
	System.out.println("Hi there!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarLoanClass obj = new CarLoanClass();
		System.out.println(obj.i);
		obj.m1();
		CarLoanClass obj2 = new CarLoanClass();
		obj2.m1();
		System.out.println(obj2.i);
		obj2.callMe();
	
	}
	@Override
	public void callMe() {
		// TODO Auto-generated method stub
		System.out.println("Implemented");
		
	}
	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		
	}

}
