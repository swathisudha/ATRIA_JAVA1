package com.tns.day3;

public class EncapsulationExample {
	private int SerialNum;
	private String name;
	private int age;
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EncapsulationExample [SerialNum=" + SerialNum + ", name=" + name + ", age=" + age + "]";
	}
}

