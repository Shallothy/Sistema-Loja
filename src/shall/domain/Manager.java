package shall.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Manager extends Employee {
    protected final int managerId =10;
    private int daysWorked =0;
    private boolean isAtWork =false;

    public Manager(){}

    public Manager(String name, int age) {
        super(name, age, "Manager");
    }

    public Manager(String name, int age, String employeeAddress) {
        super(name, age, "Manager", employeeAddress);
    }

    public void punchClock(){
        this.isAtWork = !this.isAtWork;
        String status = this.isAtWork ? "is now at work." : "has left work.";

        if(this.isAtWork) this.daysWorked++;
        System.out.println("Employee " + this.getName() + " " + status);
    }

    @Override
    public void calculateFoodVoucher(int businessDays) {
        BigDecimal dailyRate = new BigDecimal("42.67");
        BigDecimal days = new BigDecimal(businessDays);
        BigDecimal totalVoucher = dailyRate.multiply(days);

        BigDecimal discountRate = new BigDecimal("0.15");
        BigDecimal employeeContribution = totalVoucher.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
        BigDecimal finalValue = totalVoucher.subtract(employeeContribution);

        System.out.println("Gross Food Voucher: R$" + totalVoucher);
        System.out.println("Payroll Discount (15%): R$" + employeeContribution);
        System.out.println("Net Amount: R$" + finalValue);
    }

    @Override
    public void healthPlan() {
        System.out.println("Applying Premium Health Plan for Manager...");
        BigDecimal rate = new BigDecimal("0.05");
        BigDecimal cap = new BigDecimal("500.00");

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
        System.out.println("Print data of manager...");
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
        return "Manager{" +
                "managerId=" + managerId +
                ", daysWorked=" +daysWorked +" " +
                super.toString() +'}';
    }
}