package shall.test;

import shall.domain.Cliente;
import shall.domain.Gerente;
import shall.domain.Vendedor;
import shall.servicos.FuncaoGerente;
import shall.servicos.FuncaoVendedor;
import shall.servicos.TipoPagamento;

public class PessoaTest03 {
    public static void main(String[] args) {
        Gerente gerente =new Gerente("João", 30);
        Vendedor vendedor =new Vendedor("Marchello", 25);
        Cliente cliente =new Cliente("Maria", 28, "Rua dos Clientes, 789", TipoPagamento.CREDITO);

        gerente.setOperarioAdress("Rua dos Gerentes, 123");
        vendedor.setOperarioAdress("Rua dos Vendedores, 456");
        cliente.setWallet(5000.00);

        FuncaoVendedor.toSell(vendedor, cliente, 10000, "TV SAMSUNG", cliente.getPaymentType());
        FuncaoVendedor.toSell(vendedor, cliente, 1000, "Smartphone", cliente.getPaymentType());

        System.out.println("---------------");
        FuncaoGerente.paymentSeller(vendedor, gerente);
        System.out.println("Quantidade de item vendido no mês: " +vendedor.getValorTotalVenda());
        vendedor.toPresent();
    }
}
