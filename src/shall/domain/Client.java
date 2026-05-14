package shall.domain;

import shall.domain.enums.EnumPerson;
import shall.domain.enums.TypePayment;
import shall.error.ClassException;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class Client extends Person {
    protected String clientAddress = "No Information";
    protected BigDecimal wallet = BigDecimal.ZERO;
    protected int registration = -1;
    protected TypePayment paymentType;

    public Client() {}
    public Client(String name, int age) {
        super(name, age, EnumPerson.PERSON_CLIENT);
    }

    public Client(String name, int age, String clientAddress) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.clientAddress = clientAddress;
    }

    public Client(String name, int age, TypePayment paymentType) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.paymentType = paymentType;
    }

    public void peekWallet(){
        System.out.printf("Client's Wallet: R$%.2f%n", this.getWallet());
    }

    public BigDecimal getWallet() { return this.wallet; }
    public void setWallet(BigDecimal wallet) { this.wallet = (wallet != null) ? wallet : BigDecimal.ZERO; }

    public String getClientAddress() { return this.clientAddress; }
    public void setClientAddress(String clientAddress) { this.clientAddress = clientAddress; }

    public TypePayment getPaymentType() { return paymentType; }
    public void setPaymentType(TypePayment paymentType) { this.paymentType = paymentType; }

    public int getRegistration() { return registration; }
    public void setRegistration(int registration) { this.registration = registration; }

    @Override
    public String toString() {
        return "Client{" +
                "address='" + clientAddress + '\'' +
                ", wallet=" + wallet +
                ", registration=" + registration +
                ", paymentType=" + paymentType + " " +
                super.toString() + '}';
    }

    @Override
    public void toPresent() {

    }

    @Override
    public void print() {

    }
}