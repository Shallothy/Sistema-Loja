package shall.domain;

public abstract class Employee extends Person {
    protected String position;
    protected double salary;
    protected double wallet;
    protected String operarioAdress ="Endereço não informado";

    public Employee(){}

    public Employee(String name, int age, String position){
        super(name, age);
        this.position = position;
    }

    public Employee(String name, int age, String position, String operarioAdress) {
        super(name, age);
        this.position =position;
        this.operarioAdress =operarioAdress;
    }

    @Override
    public void toPresent() {
        System.out.println("Olá, meu nome é " +this.name +" e sou um " +this.PeopleType.getReportName() +" da loja.");
    }

    @Override
    public void print() {
        System.out.println("Imprimindo os dados do funcionário...");
        System.out.println(this);
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOperarioAdress() {
        return operarioAdress;
    }

    public void setOperarioAdress(String operarioAdress) {
        this.operarioAdress = operarioAdress;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void save(){
        System.out.println("Saving employee...");
    }

    public void setSalary(double salary) {
        if(this.salary <= 1280.87) {
            this.salary = 1280.87;
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", wallet=" + wallet +
                ", operarioAdress='" + operarioAdress + '\'' +
                super.toString() +'}';
    }
}
