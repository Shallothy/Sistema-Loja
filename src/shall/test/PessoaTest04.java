package shall.test;

import shall.domain.Cliente;
import shall.domain.Funcionario;
import shall.domain.Vendedor;
import shall.servicos.FuncaoCliente;
import shall.servicos.TipoPagamento;

public class PessoaTest04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rebeca", 21, TipoPagamento.DINHEIRO);
        Funcionario funcionario = new Vendedor("Gladinalbersom",35);
        funcionario.setSalary(1200);
        cliente.setWallet(10000);

        FuncaoCliente.buy(cliente, "TV SAMSUNG", 10000, cliente.getPaymentType());
        cliente.toPresent();
        funcionario.toPresent();

    }
}
