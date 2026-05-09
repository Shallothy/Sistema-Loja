package shall.domain;

public abstract class Pessoa implements PessoaInterface {
    protected String name ="Nome não informado";
    protected int age;
    protected PessoaEnum PeopleType =PessoaEnum.PESSOA_FUNCIONARIO;

    public Pessoa(){}

    public Pessoa(String name, int age){
        this.name =name;
        this.age =age;
    }

    public Pessoa(String name, int age, PessoaEnum PeopleType){
        this.name =name;
        this.age =age;
        this.PeopleType =PeopleType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PessoaEnum getPeopleType() {
        return PeopleType;
    }

    public void setPeopleType(PessoaEnum peopleType) {
        this.PeopleType = peopleType;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", PeopleType=" + PeopleType.getRelatorioNome() +
                '}';
    }
}
