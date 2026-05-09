package shall.domain;

public class Vendedor extends Funcionario{
    protected double commission;
    public double valorTotalVenda =0;
    private final int selleId =2;

    public Vendedor() {}

    public Vendedor(String name, int age) {
        super(name, age, "Vendedor");
        this.salary = 1200;
    }

    public Vendedor(String name, int age, String operarioAdress) {
        super(name, age, "Vendedor", operarioAdress);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public void peekWallet(){ System.out.println("Carteira do vendedor: " +super.getWallet()); }

    @Override
    public void print() {
        System.out.println("Imprimindo dados do Vendedor");
        System.out.println(this);
    }

    @Override
    public void toPresent() {
        System.out.println("Olá, meu nome é " + this.name + " e sou um " + this.PeopleType.getRelatorioNome() +" da loja");
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "commission=" + commission +
                ", valorTotalVenda=" + valorTotalVenda +
                ", selleId=" + selleId +
                super.toString() +'}';
    }
}
