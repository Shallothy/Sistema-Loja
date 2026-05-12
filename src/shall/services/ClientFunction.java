package shall.services;

import shall.domain.Client;
import shall.domain.Person;
import shall.domain.Seller;
import shall.domain.enums.TypePayment;

import java.util.Scanner;

public class ClientFunction {
    // Funções para subclasse Cliente, somente essa subclasse

    /***
     * Método para a efetuar a compra do cliente
     * @param pessoa objeto Cliente
     * @param item uma String item a ser comprado pelo cliente (pessoa)
     * @param valor um double representando o valor do item
     * @return dependendo da quantidade de dinheiro na carteira retorna um true ou false, simbolizando a compra do item
     */
    public static boolean buy(Client pessoa, String item, double valor, TypePayment typePayment) {
        boolean isPago = Payment.payment(typePayment, pessoa, valor);

        if(isPago) {
            try {;
                System.out.println(item + " was purscharsed!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    /***
     * Cria um objeto Pessoa, para transformá-lo em um objeto Cliente
     * @param person Objeto criado preencher seus atributos
     * @param input um Scanner para ler as entradas de dados
     * @return retorna um Cliente
     */
    public static Client register(Person person, Scanner input) {
        System.out.print("Enter the custurmer's name: ");
        person.setName(input.nextLine());
        System.out.print("Enter the custurmer's age: ");
        person.setAge(input.nextInt());

        return new Client(person.getName(), person.getAge());
    }

    /***
     * Registra o cliente pedindo seu nome, idade e endereço para registrar no pseudo Banco de Dados
     * @param name nome do cliente
     * @param age Idade do cliente
     * @param adress Endereço do cliente
     * @return
     */
    public static Client registerDataBase(String name, int age, String adress) {
        System.out.println("Registering the custumer in the database...");
        System.out.println("Custumer has been registered!");

        return new Client(name, age ,adress);
    }

    /***
     * Adiciona mais dinheiro a carteira
     * @param client Objeto que terá um valor adicionado à sua carteira
     * @param input Solicita o usuário a digitar um valor de 0 até R$50_000.00
     * @return
     */
    public static boolean addWallet(Client client, Scanner input) {
        System.out.println("Enter the amount to be added in the custumer's virtual wallet (limit de R$50.000,00): ");
        String valorString = input.nextLine().replace(",",".");
        double valor = Double.parseDouble(valorString);

        if (valor > 0 && valor <= 50000) {
            client.setWallet(client.getWallet()+valor);
            System.out.println("Money added successfully");

            return true;
        }
        System.out.println("Invalued value. The value must be greates than 0 and less than or equal R$50,000.00");
        return false;
    }

    /***
     * Verifica se o objeto Cliente está registrado no pseudo Banco de Dados
     * @param pessoa um objeto Cliente para verificar se está presente no pseudo Banco de dados
     * @param input Solcita a entrada de dados do usuário
     * @return retorna um boolean true ou false, dependendo se for ou não encontrado no pseudo Banco de Dados
     */
    public static boolean login(Client pessoa, Scanner input) {
        System.out.println("Enter the custurmer's name: ");
        String name = input.nextLine();
        if(pessoa.getName().equalsIgnoreCase(name)){
            System.out.println("sucessfully login");

            return true;
        } System.out.println("Login failed. Customer name not found.");
        return false;
    }

    public static void askStoreCard(Client client, Seller seller) {
        System.out.println("The custumer " + client.getName() +", asked for the card");
    }

    //public static void editData() {}
}
