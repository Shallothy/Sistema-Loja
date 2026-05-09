package shall.servicos;

import shall.domain.Cliente;

public class Pagamento {
    public static boolean payment(TipoPagamento tipoPagamento, Cliente cliente, double valor){
        if (!(cliente.getWallet() >= valor)) {
            System.out.println("Pagamento não efetuado!");
            return false;
        }

        switch (tipoPagamento){
            case DINHEIRO:
                System.out.println("Dinheiro");
                paymentCash(valor);
                break;
            case DEBITO:
                System.out.println("cartão de Débito!");
                paymentDebit(valor);
                break;
            case CREDITO:
                System.out.println("Pagamento feito via cartão de Crédito!");
                paymentCredit(valor);
                break;
            default:
                System.out.println("Não foi possível encontrar a forma de pagamento!");
        }
        System.out.println("Pagamento foi efetuado!");
        cliente.setWallet(cliente.getWallet() - valor);
        return true;
    }

    private static double paymentCash(double valor){
        System.out.println("ID do pagamento: " +TipoPagamento.DINHEIRO.getId());
        System.out.println("Desconto de 25% na compra do item!");

        return TipoPagamento.DINHEIRO.calcularDesconto(valor);
    }

    private static double paymentDebit(double valor){
        System.out.println("ID do pagamento: " +TipoPagamento.DEBITO.getId());
        System.out.println("Desconto de 15% na compra do item!");

        return TipoPagamento.DINHEIRO.calcularDesconto(valor);
    }

    private static double paymentCredit(double valor){
        System.out.println("ID do pagamento: " +TipoPagamento.CREDITO.getId());
        System.out.println("Desconto de 5% na compra do item!");

        return TipoPagamento.CREDITO.calcularDesconto(valor);
    }
}