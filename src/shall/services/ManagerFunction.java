package shall.services;

import shall.domain.Manager;
import shall.domain.Seller;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManagerFunction {
    // Funções para subclasse Funcionário, somente essa subclasse

    public static void gerenciar(){
        System.out.println("Managing the store...");
    }

    /***
     * Efetua o pagamento de todos os vendedores
     * @param employee objeto Vendedor
     * @param manager objeto Gerente
     */
    public static void paymentSeller(Seller employee, Manager manager) {

        System.out.println("The manager " + manager.getName() + " is paying the salary to " + employee.getName() + " R$" + employee.getSalary());

        if (employee.getTotalSalesValue() != null && employee.getTotalSalesValue().compareTo(BigDecimal.ZERO) > 0) {

            BigDecimal commissionRate = new BigDecimal("0.03");
            BigDecimal commissionAmount = employee.getTotalSalesValue()
                    .multiply(commissionRate)
                    .setScale(2, RoundingMode.HALF_UP);

            BigDecimal totalPayment = employee.getSalary().add(commissionAmount);


            employee.setWallet(employee.getWallet().add(totalPayment));

            System.out.println("Salary paid with commission: R$" + totalPayment);
            System.out.println("New wallet balance: R$" + employee.getWallet());
            return;
        }

        employee.setWallet(employee.getWallet().add(employee.getSalary()));
        System.out.println("Salary paid without commission: R$" + employee.getSalary());
        System.out.println("New wallet balance: R$" + employee.getWallet());
    }

    /***
     * Efetua o pagamento do gerente
     * @param manager gerente irá efetuar o pagamento do salário
     * @param employee gerente que irá receber o salário
     */
    public static void paymentManager(Manager manager, Manager employee) {
        System.out.println("The manager " + manager.getName() +" paying the salary for " +employee.getName() +" R$" +employee.getSalary());
        employee.setWallet(employee.getWallet().add(employee.getSalary()));
    }

}