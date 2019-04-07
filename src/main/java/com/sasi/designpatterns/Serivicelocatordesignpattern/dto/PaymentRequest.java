package com.sasi.designpatterns.Serivicelocatordesignpattern.dto;

public class PaymentRequest {
	
public String paymentmode;
public long requestedamount;
public String walletType;


public String getWalletType() {
	return walletType;
}
public void setWalletType(String walletType) {
	this.walletType = walletType;
}
public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public long getRequestedamount() {
	return requestedamount;
}
public void setRequestedamount(long requestedamount) {
	this.requestedamount = requestedamount;
}

}
