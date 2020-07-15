public class Main {
    public static void main(String[] args) {
        //Account harshAcc = new Account();

        Account harshAcc = new Account("2101",
                10000.0,
                "Harsh Rana",
                "harshrana2101@gmail.com",
                "5145603513");

        System.out.println("Account Number" + harshAcc.getNumber()
                + " has a balance of $" + harshAcc.getBalance());

    }
}
