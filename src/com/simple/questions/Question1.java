package com.simple.questions;

public class Question1 {
	
	public boolean isOn() {
		return !Question1.isOff();
	}
	
	public static boolean isOff() {
		return false;
	}

}
