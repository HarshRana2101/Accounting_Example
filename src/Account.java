public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){

        this("2101",2.50,"Default name"
                ,"default email","default phone");
    }
    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhoneNumber) {


        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawl(double withdrawlAmount) {
        if (this.balance - withdrawlAmount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawl not Processed");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining Balance =" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
