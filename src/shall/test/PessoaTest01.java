package shall.test;

import shall.domain.*;
import shall.servicos.FuncaoCliente;
import shall.servicos.TipoPagamento;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\tCliente");
        Cliente cliente = new Cliente(
        );
        cliente.setName("Marciela");
        cliente.setRegistration(1234);
        cliente.setWallet(45);
        cliente.setPaymentType(TipoPagamento.DEBITO);
        cliente.setClientAdress("Rua dos Bobos 0");
        cliente.toPresent();

        System.out.println("-------------");
        FuncaoCliente.buy(cliente, "Camiseta", 50, cliente.getPaymentType());
        System.out.println(cliente.getWallet());

    }
}
