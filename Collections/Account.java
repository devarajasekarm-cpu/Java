public class Account {

    String name;
    int accountNo;
    double amount;

    public Account(){}

    public Account(String name, int accountNo, double amount) {
        this.name = name;
        this.accountNo = accountNo;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return accountNo;
    }

    public void setId(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
