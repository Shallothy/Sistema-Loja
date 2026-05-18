package shall.test;

import shall.domain.Manager;
import shall.domain.Seller;
import java.math.BigDecimal;

public class PersonTest06 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Seller seller = new Seller();

        seller.setSalary(new BigDecimal("1757.87"));
        manager.setSalary(new BigDecimal("2500"));

        manager.calculateINSS();
        seller.calculateINSS();

        System.out.println("-------------------------");
        manager.foodVoucher();
        manager.healthPlan();
        System.out.println("-------------------------");
        seller.foodVoucher();
        seller.healthPlan();
    }
}
