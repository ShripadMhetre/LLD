package org.example.designpatterns.structural.adapter.external;

// Razorpay SDK/API
public class RazorPayAPI {
    public void pay(Long id, String name, String email, Double amount) {
        System.out.println("Razorpay payment successful...");
    }

    public RazorPayStatus checkStatus(Long id) {
        return RazorPayStatus.SUCCESS;
    }
}
