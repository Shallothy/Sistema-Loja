package shall.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Seller extends Employee {
    protected BigDecimal commission = BigDecimal.ZERO;
    private BigDecimal totalSalesValue = BigDecimal.ZERO;
    private boolean isAtWork = false;
    private int daysWorked = 0;

    public Seller() {}

    public Seller(String name, int age) {
        super(name, age, "Seller");
    }

    public Seller(String name, int age, String employeeAddress) {
        super(name, age, "Seller", employeeAddress);
    }

    public BigDecimal getTotalSalesValue() { return totalSalesValue; }

    public void setTotalSalesValue(BigDecimal totalSalesValue) { this.totalSalesValue = totalSalesValue; }

    public void punchClock(){
        this.isAtWork = !this.isAtWork;

        if(this.isAtWork) this.daysWorked++;
        System.out.println("Employee: " + this.getName() + " punch clock");
    }

    @Override
    public void healthPlan() {
        System.out.println("Applying Health Plan for Seller...");
        calculateHealth();
    }

    @Override
    public void print() {
        System.out.println("Print data of seller...");
        System.out.println(this);
    }

    @Override
    public void toPresent() {
        super.toPresent();
    }

    @Override
    public void foodVoucher() {
        System.out.println("\tFood voucher - Seller");
        calculateFoodVoucher(this.daysWorked);
    }



    @Override
    public void calculateINSS() {
        System.out.println("Calculating INSS...");

        BigDecimal discount =getSalary().multiply(new BigDecimal("0.075"));
        setSalary(getSalary().subtract(discount).setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Salary after INSS: R$%.2f %n", getSalary());
    }

    @Override
    public String toString() {
        return "Seller{" +
                "commission=" + commission +
                ", totalSalesValue=" + totalSalesValue +
                ", daysWorked=" + daysWorked +
                super.toString() +'}';
    }
}