interface Notifier {
    void sendMessage();
}

class BankAccount {

    private double balance = 1000;

    // Inner class
    class AccountManager {

        void updateBalance(double amount) {
            balance = amount;
        }

        void showBalance() {
            System.out.println("Balance = " + balance);
        }
    }

    // Static nested class
    static class Receipt {

        void printReceipt() {
            System.out.println("Receipt generated successfully.");
        }
    }

    // Method accepting interface object
    void notifyUser(Notifier notifier) {
        notifier.sendMessage();
    }
}

public class NestedClassDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Creating inner class object
        BankAccount.AccountManager manager =
                account.new AccountManager();

        manager.updateBalance(5000);
        manager.showBalance();

        // Creating static nested class object
        BankAccount.Receipt receipt =
                new BankAccount.Receipt();

        receipt.printReceipt();

        // Lambda expression
        Notifier notification = () ->
                System.out.println("Account updated successfully.");

        account.notifyUser(notification);
    }
}
