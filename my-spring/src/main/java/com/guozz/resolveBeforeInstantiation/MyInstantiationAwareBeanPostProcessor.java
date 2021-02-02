package com.guozz.resolveBeforeInstantiation;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("beanName="+beanName+"---执行postProcessBeforeInstantiation 方法");
		if(beanClass ==  BeforeInstantiation.class){
			Enhancer enhancer=new Enhancer();
			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new MethodInterceptor());
			BeforeInstantiation beforeInstantiation = (BeforeInstantiation) enhancer.create();
			System.out.println("创建代理对象---");
			return beforeInstantiation;
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("beanName="+beanName+"---执行 postProcessAfterInstantiation 方法");
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return pvs;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName="+beanName+"---执行 postProcessBeforeInitialization 方法");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName="+beanName+"---执行 postProcessAfterInitialization 方法");
		return bean;
	}
}
