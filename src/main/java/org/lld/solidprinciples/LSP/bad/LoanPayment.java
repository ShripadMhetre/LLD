package org.lld.solidprinciples.LSP.bad;

public interface LoanPayment {
    void doPayment(int amount);
    void loanForeClosure();
    void doRepayment(int amount);
}
