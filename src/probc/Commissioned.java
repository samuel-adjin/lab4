package probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{

    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalValueSoldAmount = 0.0;
        LocalDate currentDate = LocalDate.of(year, month, 1);
        LocalDate previousDate = currentDate.minusMonths(1);
        for(Order order : orders) {
            if(order.getOrderDate().getMonth().equals(previousDate.getMonth()) && order.getOrderDate().getYear() == previousDate.getYear()) {
                totalValueSoldAmount += order.getOrderAmount();
            }
        }
        return baseSalary + totalValueSoldAmount * commission;
    }

    public void addOrder(int orderNo, LocalDate orderDate, int orderAmount) {
        Order order = new Order(orderNo,orderDate,orderAmount,this);
        orders.add(order);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
