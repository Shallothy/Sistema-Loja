package shall.domain;

import shall.domain.enums.EnumPerson;
import shall.services.impl.Benefits;
import shall.services.impl.Taxable;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
    public BigDecimal getWallet() { return wallet; }
    public void setWallet(BigDecimal wallet) { this.wallet = wallet; }
    public BigDecimal getSalary() { return salary; }

    public void setSalary(BigDecimal salary) {
        BigDecimal minSalary = new BigDecimal("1280.87");
        BigDecimal maxLimit = new BigDecimal("10000.00");

        if (minSalary.compareTo(salary) > 0 || maxLimit.compareTo(salary) < 0) {
            this.salary =minSalary;
            return;
        }

            this.salary =salary;
    }

    @Override
    public void calculateFoodVoucher(int businessDays/* <-- Trocar essa lógica no futuro */) {
        BigDecimal foodVoucherValue =new BigDecimal("800");
        BigDecimal employeeContribuition =foodVoucherValue.multiply(new BigDecimal("0.15"));
        BigDecimal employeeSalary =this.getSalary().subtract(employeeContribuition);

        System.out.println("Gross Food Voucher: R$" +foodVoucherValue);
        System.out.println("Payroll Discount (15%): R$" +employeeContribuition);
        System.out.println("Net Amount: R$" +employeeSalary);
        System.out.println("Salary: R$" +getSalary());
    }

    @Override
    public void calculateINSS() {

    }

    @Override
    public void calculateHealth(){
        BigDecimal rate = new BigDecimal("0.05");
        BigDecimal cap = new BigDecimal("500.00");

        BigDecimal cost = getSalary().multiply(rate).setScale(2, RoundingMode.HALF_UP);

        if (cost.compareTo(cap) > 0) {
            cost = cap;
        }

        setSalary(getSalary().subtract(cost).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Health Plan discount: R$" +cost);
    }

    @Override
    public void toPresent() {
        System.out.println("Hello, my name is " + this.name + " I am a(n) " +EnumPerson.PERSON_EMPLOYEE.getReportName() +" of store");
    }

    @Override
    public void print() {
        System.out.println("Print data of Client...");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", wallet=" + wallet +
                ", employeeAddress='" + employeeAddress + '\'' +
                super.toString() +'}';
    }
}