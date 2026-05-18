package shall.test;

import shall.domain.Client;
import shall.domain.Manager;
import shall.domain.Seller;

import java.math.BigDecimal;

public class PersonTest07 {
    public static void main(String[] args) {
        Seller seller = new Seller("Webert",29);
        Manager manager = new Manager("Managerson",32);
        Client client = new Client("Rebecca",21);

        seller.setSalary(new BigDecimal("2500.71"));
        manager.setSalary(new BigDecimal("1680.71"));
        client.setWallet(new BigDecimal("10000.57"));

        client.toPresent();
        seller.toPresent();
        manager.toPresent();

    }
}
