package shall.servicos;

import shall.domain.Cliente;
import shall.domain.Pessoa;
import shall.domain.Vendedor;
import java.util.Scanner;

public class FuncaoCliente {
    // Funções para subclasse Cliente, somente essa subclasse

    /***
     * Método para a efetuar a compra do cliente
     * @param pessoa objeto Cliente
     * @param item uma String item a ser comprado pelo cliente (pessoa)
     * @param valor um double representando o valor do item
     * @return dependendo da quantidade de dinheiro na carteira retorna um true ou false, simbolizando a compra do item
     */
    public static boolean buy(Cliente pessoa, String item, double valor, TipoPagamento tipoPagamento) {
        boolean isPago =Pagamento.payment(tipoPagamento, pessoa, valor);

        if(isPago){
            System.out.println(item + " foi comprado!");
            return true;
        }
        return false;
    }

    /***
     * Cria um objeto Pessoa, para transformá-lo em um objeto Cliente
     * @param pessoa Objeto criado preencher seus atributos
     * @param input um Scanner para ler as entradas de dados
     * @return retorna um Cliente
     */
    public static Cliente register(Pessoa pessoa, Scanner input) {
        System.out.print("Digite o nome do cliente: ");
        pessoa.setName(input.nextLine());
        System.out.print("Digite a idade do cliente: ");
        pessoa.setAge(input.nextInt());

        return new Cliente(pessoa.getName(), pessoa.getAge());
    }

    /***
     * Registra o cliente pedindo seu nome, idade e endereço para registrar no pseudo Banco de Dados
     * @param name nome do cliente
     * @param age Idade do cliente
     * @param adress Endereço do cliente
     * @return
     */
    public static Cliente registerDataBase(String name, int age, String adress) {
        System.out.println("Registrando cliente no banco de dados...");
        System.out.println("Cliente registrado com sucesso!");

        return new Cliente(name, age ,adress);
    }

    /***
     * Adiciona mais dinheiro a carteira
     * @param cliente Objeto que terá um valor adicionado à sua carteira
     * @param input Solicita o usuário a digitar um valor de 0 até R$50_000.00
     * @return
     */
    public static boolean addWallet(Cliente cliente, Scanner input) {
        System.out.println("Digite o valor a ser adicionado na carteira virtual do cliente (limite de R$50.000,00): ");
        String valorString = input.nextLine().replace(",",".");
        double valor = Double.parseDouble(valorString);

        if (valor > 0 && valor <= 50000) {
            cliente.setWallet(cliente.getWallet()+valor);
            System.out.println("Valor adicionado com sucesso!");

            return true;
        }
        System.out.println("Valor inválido. O valor deve ser maior que 0 e menor ou igual a R$50,000.00");
        return false;
    }

    /***
     * Verifica se o objeto Cliente está registrado no pseudo Banco de Dados
     * @param pessoa um objeto Cliente para verificar se está presente no pseudo Banco de dados
     * @param input Solcita a entrada de dados do usuário
     * @return retorna um boolean true ou false, dependendo se for ou não encontrado no pseudo Banco de Dados
     */
    public static boolean login(Cliente pessoa, Scanner input) {
        System.out.println("Digite o nome do cliente: ");
        String name = input.nextLine();
        if(pessoa.getName().equalsIgnoreCase(name)){
            System.out.println("Login bem-sucedido!");

            return true;
        } System.out.println("Login falhou. Nome do cliente não encontrado.");
        return false;
    }

    public static void askStoreCard(Cliente cliente, Vendedor vendedor) {
        System.out.println("O cliente " +cliente.getName() +", pediu o cartão da loja");
    }

    //public static void editData() {}
}
