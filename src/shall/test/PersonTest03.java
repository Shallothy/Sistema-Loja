package shall.test;

import shall.domain.Client;
import shall.domain.Manager;
import shall.domain.Seller;
import shall.services.ManagerFunction;
import shall.services.SellerFunction;
import shall.domain.enums.TypePayment;

import java.math.BigDecimal;

public class PersonTest03 {
    public static void main(String[] args) {
        Manager manager =new Manager("João", 30, "");
        Seller seller =new Seller("Marchello", 25);
        Client client =new Client("Maria", 28, TypePayment.CREDIT);
        BigDecimal bgDecimal = new BigDecimal("1_280");

        client.setWallet(bgDecimal);

        SellerFunction.toSell(seller, client, new BigDecimal("10000"), "TV SAMSUNG", client.getPaymentType());
        SellerFunction.toSell(seller, client, new BigDecimal("1000"), "Smartphone", client.getPaymentType());

        System.out.println("---------------");
        ManagerFunction.paymentSeller(seller, manager);
        seller.toPresent();
    }
}
