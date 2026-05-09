package shall.domain;

public class Gerente extends Funcionario{
    protected final int managerId =10;

    public Gerente() {super();}

    public Gerente(String name, int age) {
        super(name, age, "Gerente");
        this.salary =2700.75;
    }

    public Gerente(String name, int age, String cargo, String operarioAdress) {
        super(name, age, cargo, operarioAdress);
    }

    public void peekWallet(){System.out.println( "Carteira do gerente: " +super.getWallet()); }

    @Override
    public void print() {
        System.out.println("Imprimindo os dados do gerente...");
        System.out.println(this);
    }


    @Override
    public void toPresent() {
        super.toPresent();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "idGerente=" + managerId +" "+
                super.toString() +'}';
    }
}
