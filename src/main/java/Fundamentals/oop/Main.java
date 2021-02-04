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
        client1.getBankAccount().addMoney(2);

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

        BankAccount account3 = new BankAccount("SAVING3", "USD");
        client1.addBankAccount(account3);
        BankAccount account4 = new BankAccount("SAVING", "LEI");
        client1.addBankAccount(account4);
        BankAccount account5 = new BankAccount("SAVING", "USD");
        client1.addBankAccount(account5);
        client1.removeAccount("SAVING");
        client1.removeAccount("VASILE");


//        System.out.println("Input client's name: ");
//        String name = scanner.nextLine();
//        System.out.println("Input client's cnp:");
//        String cnp = scanner.nextLine();
//        Client client2 = new Client(name,cnp);
//        System.out.println(client2.toString());

        Client client3 = new Client();// am facut o variabila client 3 de tipul client(obiectul este gol)

        BankAccount saving = client3.getSaving();// am  incercat sa gasesc un sevingaccount in clientul trei
        client3.addBankAccount(account5);//am adaugat la client 3 un saving account  un account 5
        saving = client3.getSaving();// repetam  intr-un obiect in care stim ca exista un saving account
        if (saving!=null){// daca a returnat obiect valid afisam mesaj
            System.out.println("SAVING ACCOUNT FOUND");
        }


    }


}
