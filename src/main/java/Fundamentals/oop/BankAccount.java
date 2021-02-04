package Fundamentals.oop;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */
public class BankAccount {
    /**
     * Type of the account: SAVING OR SPENDING
     */
    private String accountType;
    /**
     * Balance of account
     */
    private double balance;
    /**
     * Currency: USD or EUR
     */
    private String currency;
    public final static double USD_TO_EUR = 0.23;
    public final static double EUR_TO_USD = 1.77;

    public BankAccount(String type, String currency) {
        this.accountType = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {
        this.accountType = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    // addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money
// that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
// addMoney (adaugă bani la sold, - dacă contul este de tip CHELTUIȚI, suma de bani adăugată trebuie
// să fie mai mare de 10% din sold, altfel tipăriți un mesaj de eroare sugestiv)
    public void addMoney(double newMoney) {
        if (this.accountType == "SPENDING" && newMoney <= this.balance / 10) {
            System.out.println("Please add at last 10% of actual balance");
            return;
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    //withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance
    // can not be < 0 otherwise print a suggestive  error message ),
    public void withDrawMoney(double newMoney) {
        if (this.accountType == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your new balance can't be negative");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);

    }

    //covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert,
    // and the currency to convert to and returns the result = the money in the input currency)
    public static double covertMoneyToCurrency(double amountOfMoney, String inputCurrency, String outCurrency) {
        if (inputCurrency.equals("EUR") && outCurrency.equals("USD")) {
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String type) {
        this.accountType = accountType;
    }

    /**
     * Return the balance of the account
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
