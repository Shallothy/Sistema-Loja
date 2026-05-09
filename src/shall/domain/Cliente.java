package shall.domain;

import shall.servicos.TipoPagamento;

public class Cliente extends Pessoa{
    protected String clientAdress ="Não informado";
    protected double wallet;
    protected int registration =-1;
    protected TipoPagamento paymentType;

    public Cliente() {
        super("Não informado", -1, PessoaEnum.PESSOA_CLIENTE);
    }

    public Cliente(String name, int age) {
        super(name, age, PessoaEnum.PESSOA_CLIENTE);
    }

    public Cliente(String name, int age, String clientAdress, int registration) {
        super(name, age, PessoaEnum.PESSOA_CLIENTE);
        this.clientAdress = clientAdress;
        this.registration = registration;
    }

    public Cliente(String name, int age, String clientAdress) {
        super(name, age, PessoaEnum.PESSOA_CLIENTE);
        this.clientAdress = clientAdress;
    }
    public Cliente(String name, int age, String clientAdress, TipoPagamento paymentType) {
        super(name, age, PessoaEnum.PESSOA_CLIENTE);
        this.clientAdress = clientAdress;
        this.paymentType = paymentType;
    }

    public Cliente(String name, int age, TipoPagamento paymentType) {
        super(name, age, PessoaEnum.PESSOA_CLIENTE);
        this.paymentType = paymentType;
    }

    @Override
    public void toPresent() {
        System.out.println("Olá, meu nome é " + this.name + " e sou um " + this.PeopleType.getRelatorioNome() +" da loja");
    }

    @Override
    public void print() {
        System.out.println("Imprimindo os dados do Cliente...");
        System.out.println(this);
    }

    public TipoPagamento getPaymentType() { return paymentType; }

    public void setPaymentType(TipoPagamento paymentType) { this.paymentType = paymentType; }

    public void peekWallet(){ System.out.println("Carteira do cliente: " +this.getWallet()); }

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
    public String toString() {
        return "Cliente{" +
                "clientAdress='" + clientAdress + '\'' +
                ", wallet=" + wallet +
                ", registration=" + registration +
                ", tipoPagamento=" + paymentType +" "+
                super.toString() +'}';
    }
}