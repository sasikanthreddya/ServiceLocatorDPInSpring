package com.sasi.designpatterns.Serivicelocatordesignpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.designpatterns.Serivicelocatordesignpattern.dto.PaymentRequest;
import com.sasi.designpatterns.Serivicelocatordesignpattern.service.PaymentServiceRegistry;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

	@Autowired
	PaymentServiceRegistry registry;


	@PostMapping("/pay")
	public String paymentProcess(@RequestBody PaymentRequest request) {
		String response = "";
		response = registry.getservicebean(request.getPaymentmode()).pay(request);
		return response;
	}

}
