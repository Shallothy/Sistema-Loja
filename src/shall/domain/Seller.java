package shall.domain;

public class Seller extends Employee {
    protected double commission;
    public double valorTotalVenda =0;
    private final int selleId =2;

    public Seller() {}

    public Seller(String name, int age) {
        super(name, age, "Seeler");
        this.salary = 1200;
    }

    public Seller(String name, int age, String operarioAdress) {
        super(name, age, "Seeler", operarioAdress);
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

    public void peekWallet(){ System.out.println("Wallet of seeler: " +super.getWallet()); }

    @Override
    public void save(){
        System.out.println("Saving Seller...");
    }

    @Override
    public void print() {
        System.out.println("Print data of seller");
        System.out.println(this);
    }

    @Override
    public void toPresent() {
        System.out.println("Hello, my name is " + this.name + " I am a " + this.PeopleType.getReportName() +" of store");
    }

    @Override
    public String toString() {
        return "Seeler{" +
                "commission=" + commission +
                ", totalSalesValue=" + valorTotalVenda +
                ", selleId=" + selleId +
                super.toString() +'}';
    }
}
