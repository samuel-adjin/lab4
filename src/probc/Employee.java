package probc;

public abstract class  Employee {
    private String empId;


    public Employee(String empId) {
        this.empId = empId;
    }

    public void print(int month, int year){
        System.out.println(this.calcCompensation(month, year));
    }

    public Paycheck calcCompensation(int month, int year){
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay,Tax.FICA,Tax.STATE,Tax.LOCAL,Tax.MEDICARE,Tax.SOCIAL_SECURITY);
    }

    public abstract double calcGrossPay(int month, int year);


}
