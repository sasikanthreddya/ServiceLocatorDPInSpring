
package com.sasi.designpatterns.Serivicelocatordesignpattern.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sasi.designpatterns.Serivicelocatordesignpattern.service.PaymentServiceRegistry;

@Configuration
public class SLConfig {

	@Bean
	public FactoryBean<?> getBean() {
		ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(PaymentServiceRegistry.class);
		return bean;
	}

}
