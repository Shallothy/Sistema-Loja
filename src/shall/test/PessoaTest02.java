package shall.test;

import shall.domain.Cliente;
import shall.domain.Vendedor;
import shall.servicos.*;

import java.util.Scanner;

public class PessoaTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente pessoa = FuncaoCliente.registerDataBase("Rebeca", 21, "Rua das Flores, 123");
        Vendedor vendedor =new Vendedor("Marchello", 25);

        pessoa.setRegistration(1234);
        FuncaoCliente.addWallet(pessoa, input);

        pessoa.peekWallet();
        pessoa.toPresent();

    }
}
