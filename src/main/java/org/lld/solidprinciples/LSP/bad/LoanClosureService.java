package org.lld.solidprinciples.LSP.bad;

public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    /**
     * Here, in case of CreditCardLoan the operation would throw exception.
     * That means we violate the "Liskov Substitution Principle"
     * Principle - "objects of a superclass should be replaceable with objects of its subclasses without breaking the application"
     */
    public void foreCloseLoan() {
        loanPayment.loanForeClosure();
    }
}
