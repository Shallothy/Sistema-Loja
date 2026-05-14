package shall.domain;

import shall.domain.enums.EnumPerson;

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
        String status = this.isAtWork ? "is now at work." : "has left work.";

        if(this.isAtWork) this.daysWorked++;
        System.out.println("Employee " + this.getName() + " " + status);
    }

    @Override
    public void calculateFoodVoucher(int businessDays) {
        BigDecimal dailyRate = new BigDecimal("25.57");
        BigDecimal days = new BigDecimal(this.daysWorked);
        BigDecimal totalVoucher = dailyRate.multiply(days);

        BigDecimal discount = totalVoucher.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP);
        BigDecimal finalValue = totalVoucher.subtract(discount);

        System.out.println("Days worked: " + this.daysWorked);
        System.out.println("Net Food Voucher: R$" + finalValue);
    }

    @Override
    public void healthPlan() {
        System.out.println("Applying Standard Health Plan for Seller...");
        BigDecimal rate = new BigDecimal("0.02"); // 2%
        BigDecimal cap = new BigDecimal("200.00");

        BigDecimal cost = getSalary().multiply(rate).setScale(2, RoundingMode.HALF_UP);

        if (cost.compareTo(cap) > 0) {
            cost = cap;
        }

        setSalary(getSalary().subtract(cost).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Health Plan discount: R$" + cost);
        System.out.println("Salary after Health Plan: R$" + getSalary());
    }

    @Override
    public void calculateINSS() {
        System.out.println("Calculating INSS...");
        BigDecimal discount = getSalary().multiply(new BigDecimal("0.075"));
        setSalary(getSalary().subtract(discount).setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Salary after INSS: R$%.2f %n", getSalary());
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