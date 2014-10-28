package org.test03.test;

public class Test {

	public String sayHello(String name){
		return name+",hello!";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test();
		System.out.println(t.sayHello("X"));
	}

}
