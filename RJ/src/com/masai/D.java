package com.masai;

public class D {
	static void f() {
		System.out.println("ok");
	}

	public static void main(String[] args) {
		D d = null;
		d.f(); /** if u remove static keyword it will throw null pointer exception */

	}
}
