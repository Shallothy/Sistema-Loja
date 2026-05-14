package shall.domain;

import shall.domain.enums.EnumPerson;
import shall.services.impl.Benefits;
import shall.services.impl.Taxable;

import java.math.BigDecimal;

public abstract class Employee extends Person implements Taxable, Benefits {
    protected String position;
    private BigDecimal salary = BigDecimal.ZERO;
    private BigDecimal wallet = BigDecimal.ZERO;
    private String employeeAddress = "No Information";

    public Employee(){}

    public Employee(String name, int age, String position){
        super(name, age, EnumPerson.PERSON_EMPLOYEE);
        this.position = position;
    }

    public Employee(String name, int age, String position, String employeeAddress) {
        super(name, age, EnumPerson.PERSON_EMPLOYEE);
        this.position = position;
        this.employeeAddress = employeeAddress;
    }

    public BigDecimal getSalary() { return salary; }

    public void setSalary(BigDecimal salary) {
        BigDecimal minSalary = new BigDecimal("1280.87");
        BigDecimal maxLimit = new BigDecimal("10000.00");

        if (minSalary.compareTo(salary) <= 0 && maxLimit.compareTo(salary) >= 0) {
            this.salary = minSalary;
            return;
        }

            this.salary = salary;
    }

    public BigDecimal getWallet() { return wallet; }

    public void setWallet(BigDecimal wallet) { this.wallet = wallet; }

    @Override
    public void toPresent() {
        System.out.println("Hello, my name is " + this.name + " I am a(n) " +EnumPerson.PERSON_EMPLOYEE.getReportName() +" of store");
    }

    @Override
    public void print() {
        System.out.println("Print data of Client...");
        System.out.println(this);
    }
}