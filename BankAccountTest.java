
public class BankAccountTest {

    public static void main(String[] args) {
        // account1 using the default constructor
        BankAccount account1 = new BankAccount();
        System.out.println("Current balance of account1:" + account1.getBalance());
        // Depositing 1000 dollars into account1
        account1.deposit(1000);
        System.out.println("Balance of account1 after deposit: " + account1.getBalance());
        // Withdrawing 250 dollars from account1
        account1.withdraw(250);
        System.out.println("Balance of account1 after withdraw: " + account1.getBalance());
        BankAccount account2 = new BankAccount(500);
        System.out.println("Initial balance of account2: " + account2.getBalance());
        // account2.withdraw(550.0);
        // we are withdraw more than amount in the bank two, That is why is giving the
        // error
        // correct
        account2.withdraw(100);
        // Assigning account1 to account2
        account2 = account1;
        // Depositing 50 dollars into account1
        account1.deposit(50.0);

        System.out.println("Balance of account1: " + account1.getBalance());
        System.out.println("Balance of account2: " + account2.getBalance());

        // The client program is BankAccountTest.java.
        // In the context of object-oriented programming,
        // a client class is a class that utilizes another class
        // or object. The class that is utilized is often referred to as the server
        // class, which provides services that the client class uses.

    }

}

