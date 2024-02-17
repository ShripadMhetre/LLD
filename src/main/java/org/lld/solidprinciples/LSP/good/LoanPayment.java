package org.lld.solidprinciples.LSP.good;

/**
 * Now that loanForeClosure() method in not part of LoanPayment interface,
 * CreditCardLoan can implement this implement without having to implement loanForeClosure() functionality
 */
public interface LoanPayment {
    void doPayment(int amount);
}
