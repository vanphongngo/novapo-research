package SingleResponsibilty;

public class SingleResponsibility {
    public static class BankAccount {
        private String accountNumber;
        private double balance;
    
        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0;
        }
    
        public void deposit(double amount) {
            balance += amount;
            updateAccountStatus();
            sendNotification();
        }
    
        public void withdraw(double amount) {
            balance -= amount;
            updateAccountStatus();
            sendNotification();
        }
    
        private void updateAccountStatus() {
            // Code to update account status
        }
    
        private void sendNotification() {
            // Code to send notification
        }
    }
}


/*
 * the method send notification is not suitable for the BankAccount, we should move it to another class such as NotficicationService
 */