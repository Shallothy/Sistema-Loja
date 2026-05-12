package shall.domain;

import shall.domain.enums.EnumPerson;
import shall.domain.enums.TypePayment;
import shall.error.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Client extends Person {
    protected String clientAdress ="No Information";
    protected double wallet;
    protected int registration =-1;
    protected TypePayment paymentType;

    public Client() {
        super("No Information", -1, EnumPerson.PERSON_CLIENT);
    }

    public Client(String name, int age) {
        super(name, age, EnumPerson.PERSON_CLIENT);
    }

    public Client(String name, int age, String clientAdress, int registration) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.clientAdress = clientAdress;
        this.registration = registration;
    }

    public Client(String name, int age, String clientAdress) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.clientAdress = clientAdress;
    }
    public Client(String name, int age, String clientAdress, TypePayment paymentType) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.clientAdress = clientAdress;
        this.paymentType = paymentType;
    }

    public Client(String name, int age, TypePayment paymentType) {
        super(name, age, EnumPerson.PERSON_CLIENT);
        this.paymentType = paymentType;
    }

    @Override
    public void toPresent() {
        System.out.println("Hi, my name is " + this.name + " I'm a " + this.PeopleType.getReportName() +" of store");
    }

    @Override
    public void print() {
        System.out.println("Print data of Client...");
        System.out.println(this);
    }

    public TypePayment getPaymentType() { return paymentType; }

    public void setPaymentType(TypePayment paymentType) { this.paymentType = paymentType; }

    public void peekWallet(){ System.out.printf("Wallet of Client: %.2f%n", this.getWallet()); }

    public String getClientAdress() {
        return this.clientAdress;
    }

    public void setClientAdress(String clientAdress) {
        this.clientAdress = clientAdress;
    }

    public int getRegistration() {
        return this.registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public double getWallet() { return  this.wallet; }

    public void setWallet(double wallet) { this.wallet = wallet; }

    @Override
    public void save() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Saving client...");
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientAdress='" + clientAdress + '\'' +
                ", wallet=" + wallet +
                ", registration=" + registration +
                ", EnumPerson=" + paymentType +" "+
                super.toString() +'}';
    }
}