package probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hourly hourEmployee = new Hourly("emp1",50.0,3);
        Salaried salaried = new Salaried("emp2",2000.0);
        Commissioned commissioned = new Commissioned("emp3",150,7000.0);
        commissioned.addOrder(1, LocalDate.of(2024,12,13),500);
        List<Employee> employees = List.of(hourEmployee,salaried,commissioned);
        for (Employee employee : employees) {
           employee.print(1,2025);

        }
    }
}
