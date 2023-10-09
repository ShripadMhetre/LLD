package org.example.designpatterns.structural.adapter;

import org.example.designpatterns.structural.adapter.external.PayUAPI;
import org.example.designpatterns.structural.adapter.external.PayUStatus;

// Step 2: Create concrete adapters
public class PayUAdapter implements PaymentProvider{
    PayUAPI payUAPI= new PayUAPI(); // External dependency of SDK
    @Override
    public void doPayment(Long id, String name, String email, Double amount) {
        payUAPI.makePayment(id, amount);
    }

    @Override
    public PaymentStatus verifyPayment(Long id) {
        PayUStatus status = payUAPI.getStatus(id);
        return to(status);
    }

    // Transformer method -> (i.e. PayUStatus to PaymentStatus)
    private PaymentStatus to(PayUStatus status) {
        switch (status) {
            case OK: return PaymentStatus.DONE;
            case ERROR: return PaymentStatus.FAILED;
        }

        throw new IllegalArgumentException("Invalid PayU Status: " + status);
    }


}
