package org.pack;

public abstract  class Bank implements Rbi {
	public abstract void savings();
	public abstract void loan();
	//non-abstract
	public void interest() {
		// TODO Auto-generated method stub
System.out.println("Bank interest is 7%");
	}

}
