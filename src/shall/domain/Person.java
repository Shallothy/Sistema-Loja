package shall.domain;

import shall.domain.enums.EnumPerson;
import shall.error.LoginInvalidoException;
import shall.services.impl.PersonInterface;

import java.io.FileNotFoundException;

public abstract class Person implements PersonInterface {
    protected String name ="No information";
    protected int age;
    protected EnumPerson PeopleType = EnumPerson.PERSON_EMPLOYEE;

    public Person(){}

    public Person(String name, int age){
        this.name =name;
        this.age =age;
    }

    public Person(String name, int age, EnumPerson PeopleType){
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

    public EnumPerson getPeopleType() {
        return PeopleType;
    }

    public void setPeopleType(EnumPerson peopleType) {
        this.PeopleType = peopleType;
    }

    public void save() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Saving person...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", EnumPerson=" + PeopleType.getReportName() +
                '}';
    }
}
