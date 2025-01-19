package prob4e;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String accountId;


    public SavingsAccount( String accountId, double interestRate,double startbalance) {
        this.balance = startbalance;
        this.interestRate = interestRate;
        this.accountId = accountId;
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
        return  this.balance + (this.interestRate * this.balance);
    }
}
