package com.practice;

class One {
	public void method1() {
		System.out.println("It's class One");
	}
}

class Two {
	public void method2() {
		System.out.println("It's Class Two");
	}
}

public class MultipleClass {
	public static void main(String[] args) {
		One one = new One();
		one.method1();
		Two two = new Two();
		two.method2();
	}
}
