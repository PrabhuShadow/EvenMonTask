package org.pack;

public class HDFC implements BankDemo {
	public void AccoNum() {
		// TODO Auto-generated method stub
System.out.println("AccoNum");
	}
	public void newaccount() {
		// TODO Auto-generated method stub
System.out.println("Account name is Prabhu");
	}
		
	public static void main(String[] args) {
		HDFC H = new HDFC();
		
		H.AccoNum();
		H.newaccount();
		H.citiBank();
		H.cubBank();
		
	}
	@Override
	public void cubBank() {
		// TODO Auto-generated method stub
		System.out.println("Cub bank branch - tnj");
	}
	@Override
	public void citiBank() {
		// TODO Auto-generated method stub
		System.out.println("city bank  branch - trichy");
	}

		
	}
	

