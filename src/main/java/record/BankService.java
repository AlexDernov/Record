package record;

import java.math.BigDecimal;

public class BankService {
    public String openAccount(Client client){
        double number = Math.random();
        Account newAccount = new Account("number", "0", client);
        return newAccount.getAccountNumber();
    }
    public void transferMoney(Account accountSender, Account accountRecipient, String amount ){
        BigDecimal a = new BigDecimal(amount);

        accountSender.setAccountBalance(accountSender.getAccountBalance().subtract(a));
        accountRecipient.setAccountBalance(accountRecipient.getAccountBalance().add(a));
        System.out.println("New Balance: " + accountRecipient.getAccountBalance());
        System.out.println("New Balance: " + accountSender.getAccountBalance());
    }

}
