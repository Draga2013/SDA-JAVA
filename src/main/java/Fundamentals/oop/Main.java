package Fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getAccountType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        Client client1 = new Client(" SORIN", " 4365436", bankAccount);
        System.out.println(client1.toString());
        client1.getBankAccount().addMoney(30.0);
        client1.getBankAccount().withDrawMoney(10);

        System.out.println(client1.toString());
        client1.getBankAccount().setAccountType("SPENDING");
        client1.getBankAccount().addMoney(10);
        double x = BankAccount.covertMoneyToCurrency(10, "EUR", "USD");
        System.out.println(BankAccount.covertMoneyToCurrency(10, "USD", "EUR"));
        System.out.println(x);
        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");
        BankAccount bankAccount2 = new BankAccount("SPANDIMG", "USD");
        BankAccount[] myArray = {bankAccount1, bankAccount2};
        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        BankAccount[] clientBankAccounts = client1.getBankAccounts();
        System.out.println(clientBankAccounts[0]);
        System.out.println(client1.getBankAccounts()[0]);
        System.out.println(client1);


//        System.out.println("Input client's name: ");
//        String name = scanner.nextLine();
//        System.out.println("Input client's cnp:");
//        String cnp = scanner.nextLine();
//        Client client2 = new Client(name,cnp);
//        System.out.println(client2.toString());


    }
}
