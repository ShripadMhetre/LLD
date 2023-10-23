package org.lld.designpatterns.structural.adapter;

// Step 1: Create Adapter Interface (which is the contract followed within our codebase)
public interface PaymentProvider {
    public void doPayment(Long id, String name, String email, Double amount);
    public PaymentStatus verifyPayment(Long id);
}
