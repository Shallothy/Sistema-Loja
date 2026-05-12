package shall.test;

import shall.domain.*;
import shall.services.ClientFunction;
import shall.domain.enums.TypePayment;

import java.util.Scanner;

public class PersonTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\tClient");
        Client client = new Client(
        );
        client.setName("Marciela");
        client.setRegistration(1234);
        client.setWallet(50);
        client.setPaymentType(TypePayment.MONEY);
        client.setClientAdress("Fools' Street 0");
        client.toPresent();

        System.out.println("-------------");
        ClientFunction.buy(client, "Short", 50, client.getPaymentType());
        System.out.printf("%.2f", client.getWallet());

    }
}
