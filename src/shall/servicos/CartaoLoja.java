package shall.servicos;

import shall.domain.Cliente;
import shall.domain.Pessoa;

public class CartaoLoja {
    public static boolean storeCard(Pessoa cliente) {
        System.out.println("Qualquer um pode solicitar o cartão, porém apenas clientes podem tê-lo");
        System.out.println("Nome da pessoa que quer fazer o cartão: " + cliente.getName());
        if(!(cliente instanceof Cliente)){
            System.out.println("Não é um cliente, cartão não feito");
            return false;
        }
        System.out.println("É um cliente, cartão feito");
        return true;
    }
}
