package shall.services;

import shall.domain.Client;
import shall.domain.Seller;
import shall.domain.enums.TypePayment;

public class SellerFunction {
    public static boolean toSell(Seller seller, Client client, double valorVenda, String item, TypePayment typePayment) {
        if(ClientFunction.buy(client, item, valorVenda, typePayment)){
            System.out.println("Sale successfully carried out! The seller " +seller.getName()
                    +" sold one(a) " +item +"for the customer " +client.getName() +" for R$" +valorVenda);
            seller.setValorTotalVenda(valorVenda + seller.getValorTotalVenda());

            return true;
        }

        System.out.println("Sale not realized!");
        return false;
    }

    public static boolean offerCard(Seller seller, Client client) {
        return false;
    }

    public static void makeStoreCard(Seller seller, Client client) {
        System.out.println("The seller " + seller.getName() +" is making the store card for the customer "
                + client.getName());
        if(StoreCard.storeCard(client)){
            System.out.println("Card made!");
            return;
        }
        System.out.println("Card not made.");
    }
}
