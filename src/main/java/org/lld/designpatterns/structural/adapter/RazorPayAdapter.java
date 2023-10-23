package org.lld.designpatterns.structural.adapter;

import org.lld.designpatterns.structural.adapter.external.RazorPayAPI;
import org.lld.designpatterns.structural.adapter.external.RazorPayStatus;

// Step 2: Create concrete adapters
public class RazorPayAdapter implements PaymentProvider{
    RazorPayAPI razorPayAPI = new RazorPayAPI(); // External dependency of SDK

    @Override
    public void doPayment(Long id, String name, String email, Double amount) {
        razorPayAPI.pay(id, name, email, amount);
    }

    @Override
    public PaymentStatus verifyPayment(Long id) {
        RazorPayStatus status = razorPayAPI.checkStatus(id);
        return to(status);
    }

    // Transformer method -> (i.e. RazorPayStatus to PaymentStatus)
    private PaymentStatus to(RazorPayStatus status) {
        switch (status) {
            case SUCCESS: return PaymentStatus.DONE;
            case FAILURE: return PaymentStatus.FAILED;
        }

        throw new IllegalArgumentException("Invalid Razorpay Status: " + status);
    }


}
