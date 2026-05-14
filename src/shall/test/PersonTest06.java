package shall.test;

import shall.domain.Manager;
import shall.domain.Seller;
import java.math.BigDecimal;

public class PersonTest06 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Seller seller = new Seller();

        seller.setSalary(new BigDecimal("1280.55"));
        manager.setSalary(new BigDecimal("2500.57"));
        manager.calculateINSS();
        seller.healthPlan();
    }
}
