package com.guozz.factoryBean;

import com.guozz.selftag.User;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
