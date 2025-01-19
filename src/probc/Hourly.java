package probc;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;
    private static final int WEEKS_IN_MONTH = 4;

    public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return WEEKS_IN_MONTH * hourlyWage * hoursPerWeek;
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }


}
