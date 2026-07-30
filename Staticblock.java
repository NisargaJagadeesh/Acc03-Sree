package com.tnsif.interfacedemo;

public class LGTV implements Remote {
	@Override
	public void powerOn() {
		System.out.println("LG tv is on"); // TODO Auto-generated
		
	}
	
	@Override
	public void poweroff() {
		System.out.println("LG tv is off"); // TODO Auto-generated
		
	}
	public static void main(String[] args) {
		SonyTV t=new SonyTV();
		t.powerOn();
		t.poweroff();
		
		System.out.println();
		
		LGTV t1=new LGTV();
		t1.powerOn();
		t1.poweroff();
	}
	
}

