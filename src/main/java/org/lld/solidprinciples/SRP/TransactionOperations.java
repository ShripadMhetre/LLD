package org.lld.solidprinciples.SRP;

import java.math.BigDecimal;

public class TransactionOperations {
    public void deposit(BigDecimal amount, int accountNumber) {
        // Getting account details is the job of AccountOperations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
