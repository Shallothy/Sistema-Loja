package shall.services;

import shall.domain.Client;
import shall.domain.enums.TypePayment;

import java.math.BigDecimal;

public class Payment {
    public static boolean payment(TypePayment typePayment, Client client, BigDecimal value){
        BigDecimal discountedValue =typePayment.calculateDiscount(value);
        BigDecimal finalValue = value.subtract(discountedValue);

        if (client.getWallet().compareTo(finalValue) < 0) {
            System.out.println("Payment not made!");
            return false;
        }
        System.out.println("Payment method: " + typePayment.getPaymentType());
        System.out.println("Discounted apllied: R$" +discountedValue);

        client.setWallet(client.getWallet().subtract(finalValue));
        return true;
    }

    private static BigDecimal paymentCash(BigDecimal value){
        System.out.println("ID of payment: " + TypePayment.MONEY.getId());
        System.out.println("25% discount when purchasing the item!");

        return TypePayment.MONEY.calculateDiscount(value);
    }

    private static BigDecimal paymentDebit(BigDecimal valor){
        System.out.println("ID of payment: " + TypePayment.DEBIT.getId());
        System.out.println("15% discount when purchasing the item!");

        return TypePayment.DEBIT.calculateDiscount(valor);
    }

    private static BigDecimal paymentCredit(BigDecimal value){
        System.out.println("ID of payment: " + TypePayment.CREDIT.getId());
        System.out.println("5% discount when purchasing the item!");

        return TypePayment.CREDIT.calculateDiscount(value);
    }
}