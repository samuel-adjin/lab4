import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2025, 1, 1);
        LocalDate previousDate = currentDate.minusMonths(1);
        System.out.println(currentDate);
        System.out.println(previousDate);
    }
}