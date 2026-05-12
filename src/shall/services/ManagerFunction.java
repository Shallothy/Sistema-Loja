package shall.services;

import shall.domain.Manager;
import shall.domain.Seller;

public class ManagerFunction {
    // Funções para subclasse Funcionário, somente essa subclasse

    public static void gerenciar(){
        System.out.println("Managing the store...");
    }

    /***
     * Efetua o pagamento de todos os vendedores
     * @param pessoa objeto Vendedor
     * @param manager objeto Gerente
     */
    public static void paymentSeller(Seller pessoa, Manager manager){
        System.out.println("The manager " + manager.getName() +" paying the salary to " +pessoa.getName() +" R$" +pessoa.getSalary());

        if(pessoa.getValorTotalVenda() > 0){
            double salarioComissao = pessoa.valorTotalVenda *0.03;
            pessoa.setWallet(pessoa.getSalary() +salarioComissao);
            System.out.println("Salary payid with commission " +pessoa.getWallet());
            return;
        }
        pessoa.setWallet(pessoa.getWallet() + pessoa.getSalary());
        System.out.println("Salary payid without commission " +pessoa.getWallet());
    }

    /***
     * Efetua o pagamento do gerente
     * @param manager gerente irá efetuar o pagamento do salário
     * @param pessoa gerente que irá receber o salário
     */
    public static void paymentManager(Manager manager, Manager pessoa){
        System.out.println("The manager " + manager.getName() +" paying the salary for " +pessoa.getName() +" R$" +pessoa);
        pessoa.setWallet(pessoa.getWallet() + pessoa.getSalary());
    }

}