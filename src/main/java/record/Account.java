package record;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client customer;

    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, customer);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }
}
