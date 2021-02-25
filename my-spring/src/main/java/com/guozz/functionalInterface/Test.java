package com.guozz.functionalInterface;

public class Test {

	public static void add(MyfunctionalInterface myfunctionalInterface,int a,int b){
		myfunctionalInterface.method(a,b);
	}

	public static void sub(MyfunctionalInterface myfunctionalInterface,int a,int b){
		myfunctionalInterface.method(a,b);
	}



	public static void main(String[] args) {
//		//接口实现对象
//		show(new MyFunctionalInterfaceimpl());
//		//匿名内部类
//		show(new MyfunctionalInterface() {
//			@Override
//			public void method() {
//				System.out.println("匿名内部类");
//			}
//		});
//		//lambdad表达式
//		show(()->{
//			System.out.println("lambda表达式");
//		});

		int a=10 ,b=5;
		add(new MyfunctionalInterface() {
			@Override
			public void method(int a, int b) {
				add(a,b);
			}
		},a,b);

		sub(new MyfunctionalInterface() {
			@Override
			public void method(int a, int b) {
				sub(a,b);
			}
		},a,b);

	}

	private static void sub(int a, int b) {
		System.out.println("---");
		System.out.println(a-b);
	}

	private static void add(int a, int b) {
		System.out.println("+++");
		System.out.println(a+b);
	}
}
