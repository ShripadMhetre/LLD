package org.lld.designpatterns.structural.adapter.external;

// PayU SDK/API
public class PayUAPI {
    public void makePayment(Long id, Double amount) {
        System.out.println("PayU payment successful...");
    }

    public PayUStatus getStatus(Long id) {
        return PayUStatus.OK;
    }
}
