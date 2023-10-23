package org.lld.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Long id = 123L;
        String name = "JohnDoe";
        String email = "johndoe@email.com";
        Double amount = 1000.0;

        // Razorpay Payment testing
        PaymentProvider razorpay = new RazorPayAdapter();
        razorpay.doPayment(id, name, email, amount);

        PaymentStatus status1 = razorpay.verifyPayment(id);
        System.out.println("Payment Status for id " + id + " : " + status1);

        System.out.println("----------------------------------------");

        // PayU Payment testing
        PaymentProvider payu = new PayUAdapter();
        payu.doPayment(id, name, email, amount);

        PaymentStatus status2 = payu.verifyPayment(id);
        System.out.println("Payment Status for id " + id + " : " + status2);
    }

    /*
        Adapter Pattern Uses :-
            - Makes it easy to work with incompatible interfaces
            - Avoids OCP violations
            - Avoids tight coupling between various external interfaces
     */
}
