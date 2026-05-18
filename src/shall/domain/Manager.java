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
    public void healthPlan() {
        System.out.println("Applying Premium Health Plan for Manager...");
        calculateHealth();
    }

    @Override
    public void print() {
        System.out.println("Print data of manager...");
        System.out.println(this);
    }

    @Override
    public void foodVoucher() {
        System.out.println("\tFood voucher - Manager");
//        calculateFoodVoucher(this.daysWorked);
        calculateFoodVoucher(10);
    }

    @Override
    public void calculateINSS() {
        System.out.println("Calculating INSS...");

        BigDecimal discount =getSalary().multiply(new BigDecimal("0.09"));
        setSalary(getSalary().subtract(discount).setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Salary after INSS: R$%.2f %n", getSalary());
    }

    @Override
    public void toPresent() {
        super.toPresent();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", daysWorked=" +daysWorked +" " +
                super.toString() +'}';
    }
}