package com.guozz.resolveBeforeInstantiation;

import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MethodInterceptor implements org.springframework.cglib.proxy.MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标方法执行前---"+method);
		Object object = methodProxy.invoke(o, objects);
		System.out.println("目标方法执行后---"+method);
		return object;

	}
}
