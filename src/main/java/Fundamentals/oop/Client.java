package Fundamentals.oop;

/**
 * Client  which consists of:
 * constructor: with arguments: name and cnp (for initializing the fields and the  bankingAccount array will be initialized with an empty array or only instantiated)
 * fields: bankingAccounts ( array of max 2 banking accounts), name, cnp
 * methods:
 * addBankAccount( takes one argument, bankAccount obj - if there already exists a banking account of the same type in the array an error message is printed)
 * getSavingAccount( returns the bankAccount obj of type SAVING from the array, if there isn’t a saving account a null object is return along with printing an error message)
 * removeAccountByType (takes a string argument which represents the type of the account to be removed from the array and prints a success message if the operations succeeded or error message if not - where the account did not exist in the array)
 */
public class Client {
    private String name;
    private String cnp;
    private BankAccount bankAccount;
    private BankAccount[] bankAccounts;

    public void addBankAccount(BankAccount account) {
        // aici facem cautare si filtrare dupa account
        for (int i = 0; i < this.bankAccounts.length; i++) {
            if (this.bankAccounts[i].equals2(account)) {
                System.out.println("this is already");
                return;
            }
        }

        //facem sir nou si copiem in el datele vechi
        BankAccount[] tempAccounts = new BankAccount[bankAccounts.length + 1];
        for (int i = 0; i < this.bankAccounts.length; i++) {
            tempAccounts[i] = this.bankAccounts[i];
        }
        //adaugam elementul nou in sirul nou creat
        tempAccounts[tempAccounts.length - 1] = account;
        // atribuim membrului banckAccounts sirul nou creat
        bankAccounts = tempAccounts;
        System.out.println(" Added");
    }

    // adaugam o metoda getSavingBankAccount care returneaza un obiect BankAccount de tipul SAVING
    // daca exista sau returneaza nul daca nu exista
    public BankAccount getSaving() {
//        if (bankAccounts==null){
//            System.out.println("Saving account not found");
//            return null;
//        }
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i].getAccountType().equals("SAVING")) {
                return bankAccounts[i];
            }
        }
        System.out.println("Saving account not found");
        return null;

    }

    public void removeAccount(String type) {
        int count = 0; // numaram decate ori gasim contul cautat
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i].getAccountType().equals(type)) {
                count++;
            }
        }
        BankAccount tempAccounts[] = new BankAccount[bankAccounts.length-count];
        int len = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            if (!bankAccounts[i].getAccountType().equals(type)) {
                tempAccounts[len]= bankAccounts[i];
                len++;
            }
        }
        bankAccounts= tempAccounts;
        if (count> 0){
            System.out.println("Accounts deleted");
        }
        else{
            System.out.println("could not find account");
        }
    }

    public Client(String name, String cnp, BankAccount bankAccount) {
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = bankAccount;
    }

    public Client(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = new BankAccount();
    }

    public Client() {
        this.bankAccount = new BankAccount();
        this.bankAccounts = new BankAccount[0];
    }

    @Override
    public String toString() {
        return "Name = " + this.name + ", CNP = " + this.cnp + ", bankAccount = " + this.bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
