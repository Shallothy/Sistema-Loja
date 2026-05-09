package shall.servicos;

import shall.domain.Gerente;
import shall.domain.Vendedor;

public class FuncaoGerente {
    // Funções para subclasse Funcionário, somente essa subclasse

    public static void gerenciar(){
        System.out.println("Gerenciando a loja...");
    }

    /***
     * Efetua o pagamento de todos os vendedores
     * @param pessoa objeto Vendedor
     * @param gerente objeto Gerente
     */
    public static void paymentSeller(Vendedor pessoa, Gerente gerente){
        System.out.println("O gerente " +gerente.getName() +" Pagando o salário para " +pessoa.getName() +" R$" +pessoa.getSalary());

        if(pessoa.getValorTotalVenda() > 0){
            double salarioComissao = pessoa.valorTotalVenda *0.03;
            pessoa.setWallet(pessoa.getSalary() +salarioComissao);
            System.out.println("Salário pago com a comissão " +pessoa.getWallet());
            return;
        }
        pessoa.setWallet(pessoa.getWallet() + pessoa.getSalary());
        System.out.println("Salário pago sem a comissão " +pessoa.getWallet());
    }

    /***
     * Efetua o pagamento do gerente
     * @param gerente gerente irá efetuar o pagamento do salário
     * @param pessoa gerente que irá receber o salário
     */
    public static void paymentManager(Gerente gerente, Gerente pessoa){
        System.out.println("O gerente " +gerente.getName() +" Pagando o salário para " +pessoa.getName() +" R$" +pessoa);
        pessoa.setWallet(pessoa.getWallet() + pessoa.getSalary());
    }

}