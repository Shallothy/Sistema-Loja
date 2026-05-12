package shall.domain;

public class Manager extends Employee {
    protected final int managerId =10;

    public Manager() {super();}

    public Manager(String name, int age) {
        super(name, age, "Manager");
        this.salary =2700.75;
    }

    public Manager(String name, int age, String cargo, String operarioAdress) {
        super(name, age, cargo, operarioAdress);
    }

    public void peekWallet(){System.out.println("Wallet of manager: " +super.getWallet()); }

    @Override
    public void save(){
        System.out.println("Saving manager...");
    }

    @Override
    public void print() {
        System.out.println("Print data of manager...");
        System.out.println(this);
    }


    @Override
    public void toPresent() {
        super.toPresent();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "idManager=" + managerId +" "+
                super.toString() +'}';
    }
}
