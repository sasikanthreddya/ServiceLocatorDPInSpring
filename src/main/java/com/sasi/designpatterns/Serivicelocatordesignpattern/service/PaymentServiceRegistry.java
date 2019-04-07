package com.sasi.designpatterns.Serivicelocatordesignpattern.service;

public interface PaymentServiceRegistry {

	public paymentService getservicebean(String serviceBeanType);
}
