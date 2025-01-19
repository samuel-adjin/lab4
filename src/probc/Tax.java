package probc;

public enum Tax {

    FICA(23),
    STATE(5),
    LOCAL(1),
    MEDICARE(3),
    SOCIAL_SECURITY(7.5);

    private final double rate;

    Tax(double rate) {
        this.rate = rate;
    }

    public double calculateTaxOnGross(double grossPay) {
        return grossPay * (rate/100);
    }
}
