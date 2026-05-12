package shall.test;

import shall.domain.Client;
import shall.domain.Seller;
import shall.services.*;

import java.util.Scanner;

public class PersonTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Client pessoa = ClientFunction.registerDataBase("Wendericksom", 21, "Rua das Flores, 123");
        Seller seller =new Seller("Marchello", 25);

        pessoa.setRegistration(1234);
        ClientFunction.addWallet(pessoa, input);

        pessoa.peekWallet();
        pessoa.toPresent();

    }
}
