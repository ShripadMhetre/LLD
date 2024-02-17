package org.lld.solidprinciples.SRP;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1234);
        account.setFirstName("John");
        account.setTotalAmount(BigDecimal.valueOf(100000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        System.out.println("Balance Before Transfer: " + account.getTotalAmount());
        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(99), 1234);
        System.out.println("Balance After Transfer: " + account.getTotalAmount());
    }

    /*
        Why SRP :-
            - Readability, Maintainability, Testability of code etc.
     */
}
