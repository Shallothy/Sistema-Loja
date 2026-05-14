package shall.test;

import shall.domain.Client;
import shall.domain.Manager;
import shall.domain.Seller;
import shall.error.ClassException;
import shall.error.InvalidNumberException;
import shall.services.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class PersonTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Client pessoa =ClientFunction.registerDataBase("Wendericksom", 21, "Rua das Flores, 123");
        Manager manager =new Manager("Warchielo", 37);
        Seller seller =new Seller("Marchelo", 25);

        pessoa.setRegistration(1234);
//        seller.setSalary(new BigDecimal("1280"));
//        try {
//            manager.setSalary(new BigDecimal("2000"));
//        } catch (NumberFormatException e) {
//            throw new InvalidNumberException();
//        }
        ClientFunction.addWallet(pessoa, input);

        System.out.println(seller);
        System.out.println(manager);
        pessoa.peekWallet();
        pessoa.toPresent();

    }
}
