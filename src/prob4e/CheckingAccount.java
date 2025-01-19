package prob4e;

public class CheckingAccount extends Account {
    private String accountId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String accountId,double fee, double startBalance ) {
        this.accountId = accountId;
        this.balance = startBalance;
        this.monthlyFee = fee;
    }


    @Override
    public String getAccountID() {
        return this.accountId;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return this.balance - this.monthlyFee;
    }
}
