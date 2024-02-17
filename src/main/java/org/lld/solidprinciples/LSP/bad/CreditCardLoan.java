package org.lld.solidprinciples.LSP.bad;

public class CreditCardLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void loanForeClosure() {
        throw new UnsupportedOperationException("Foreclosure is not allowed for credit card loan.");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment is not allowed.");
    }
}
