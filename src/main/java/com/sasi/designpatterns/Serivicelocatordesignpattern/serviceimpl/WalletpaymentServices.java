package com.sasi.designpatterns.Serivicelocatordesignpattern.serviceimpl;

import org.springframework.stereotype.Service;

import com.sasi.designpatterns.Serivicelocatordesignpattern.dto.PaymentRequest;
import com.sasi.designpatterns.Serivicelocatordesignpattern.service.paymentService;

@Service("WalletService")
public class WalletpaymentServices implements paymentService {

	@Override
	public String pay(PaymentRequest request) {
		return "payment requested through" + request.getWalletType();
	}

}
