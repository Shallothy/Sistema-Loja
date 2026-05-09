package shall.servicos;

import shall.domain.Cliente;
import shall.domain.Vendedor;
import java.util.Scanner;

public class FuncaoVendedor {
    public static boolean toSell(Vendedor vendedor, Cliente cliente, double valorVenda, String item, TipoPagamento tipoPagamento) {
        if(FuncaoCliente.buy(cliente, item, valorVenda, tipoPagamento)){
            System.out.println("Venda realizada com sucesso! O vendedor " +vendedor.getName()
                    +" vendeu um(a) " +item +" para o cliente " +cliente.getName() +" por R$" +valorVenda);
            vendedor.setValorTotalVenda(valorVenda +vendedor.getValorTotalVenda());

            return true;
        }

        System.out.println("Venda não realizada!");
        return false;
    }

    public static boolean offerCard(Vendedor vendedor, Cliente cliente) {
        return false;
    }

    public static void makeStoreCard(Vendedor vendedor, Cliente cliente) {
        System.out.println("O vendedor " +vendedor.getName() +" está fazendo o cartão da loja para o cliente "
                +cliente.getName());
        if(CartaoLoja.storeCard(cliente)){
            System.out.println("Cartão feito!");
            return;
        }
        System.out.println("Cartão não feito.");
    }
}
