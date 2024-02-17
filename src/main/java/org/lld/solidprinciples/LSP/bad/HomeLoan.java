package org.lld.solidprinciples.LSP.bad;

// Home loan can implement all 3 methods of LoanPayment interface
public class HomeLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void loanForeClosure() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}
