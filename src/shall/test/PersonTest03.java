package shall.test;

import shall.domain.Client;
import shall.domain.Manager;
import shall.domain.Seller;
import shall.services.ManagerFunction;
import shall.services.SellerFunction;
import shall.domain.enums.TypePayment;

public class PersonTest03 {
    public static void main(String[] args) {
        Manager manager =new Manager("João", 30);
        Seller seller =new Seller("Marchello", 25);
        Client client =new Client("Maria", 28, "Rua dos Clientes, 789", TypePayment.CREDIT);

        manager.setOperarioAdress("Rua dos Gerentes, 123");
        seller.setOperarioAdress("Rua dos Vendedores, 456");
        client.setWallet(5000.00);

        SellerFunction.toSell(seller, client, 10000, "TV SAMSUNG", client.getPaymentType());
        SellerFunction.toSell(seller, client, 1000, "Smartphone", client.getPaymentType());

        System.out.println("---------------");
        ManagerFunction.paymentSeller(seller, manager);
        System.out.println("Quantidade de item vendido no mês: " + seller.getValorTotalVenda());
        seller.toPresent();
    }
}
