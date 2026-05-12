package shall.services;

import shall.domain.Client;
import shall.domain.enums.TypePayment;

public class Payment {
    public static boolean payment(TypePayment typePayment, Client client, double valor){
        if (!(client.getWallet() >= valor)) {
            System.out.println("Payment not made!");
            return false;
        }

        switch (typePayment){
            case MONEY:
                System.out.println("Cash");
                paymentCash(valor);
                break;
            case DEBIT:
                System.out.println("Debit card!");
                paymentDebit(valor);
                break;
            case CREDIT:
                System.out.println("Credit card!");
                paymentCredit(valor);
                break;
        }
        System.out.println("Payment made!");
        client.setWallet(client.getWallet() - valor);
        return true;
    }

    private static double paymentCash(double valor){
        System.out.println("ID of payment: " + TypePayment.MONEY.getId());
        System.out.println("25% discount when purchasing the item!");

        return TypePayment.MONEY.calculateDiscount(valor);
    }

    private static double paymentDebit(double valor){
        System.out.println("ID of payment: " + TypePayment.DEBIT.getId());
        System.out.println("15% discount when purchasing the item!");

        return TypePayment.MONEY.calculateDiscount(valor);
    }

    private static double paymentCredit(double valor){
        System.out.println("ID of payment: " + TypePayment.CREDIT.getId());
        System.out.println("5% discount when purchasing the item!");

        return TypePayment.CREDIT.calculateDiscount(valor);
    }
}