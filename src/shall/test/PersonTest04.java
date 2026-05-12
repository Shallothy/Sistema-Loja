package shall.test;

import shall.domain.Client;
import shall.domain.Employee;
import shall.domain.Seller;
import shall.services.ClientFunction;
import shall.domain.enums.TypePayment;

public class PersonTest04 {
    public static void main(String[] args) {
        Client client = new Client("Philips", 21, TypePayment.MONEY);
        Employee employee = new Seller("Gladinalbersom",35);
        employee.setSalary(1200);
        client.setWallet(10000);

        ClientFunction.buy(client, "TV SAMSUNG", 10000, client.getPaymentType());
        client.toPresent();
        employee.toPresent();

    }
}
