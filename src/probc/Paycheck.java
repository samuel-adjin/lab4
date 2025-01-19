package probc;

public final class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    public Paycheck(double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica.calculateTaxOnGross(grossPay);
        this.state = state.calculateTaxOnGross(grossPay);
        this.local = local.calculateTaxOnGross(grossPay);
        this.medicare = medicare.calculateTaxOnGross(grossPay);
        this.socialSecurity = socialSecurity.calculateTaxOnGross(grossPay);
    }

    public void print() {
    }

    public double getNetPay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                '}';
    }
}
