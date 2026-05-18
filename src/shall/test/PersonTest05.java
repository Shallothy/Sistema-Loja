package shall.test;

import shall.domain.Seller;

import java.math.BigDecimal;

public class PersonTest05 {
    public static void main(String[] args) {
        Seller seller = new Seller("Sellsom", 28);
        seller.punchClock();
        seller.setSalary(new BigDecimal("1700.59"));
        seller.healthPlan();

        System.out.println(seller.getSalary());
    }
}
