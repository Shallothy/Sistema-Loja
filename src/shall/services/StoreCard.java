package shall.services;

import shall.domain.Client;
import shall.domain.Person;

public class StoreCard {
    public static boolean storeCard(Person cliente) {
        System.out.println("Anyone can apply for the card, but only customers can have it");
        System.out.println("Name of the person who wants to make the card: " + cliente.getName());
        if(!(cliente instanceof Client)){
            System.out.println("Not a customer, card not made");
            return false;
        }
        System.out.println("It's a customer, card made");
        return true;
    }
}
