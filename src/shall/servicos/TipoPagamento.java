package shall.servicos;

public enum TipoPagamento {
    DINHEIRO("Dinheiro", 1){
        @Override
        public double calcularDesconto(double valor) { return valor*0.25; }
    },
    DEBITO("Débito", 2){
        @Override
        public double calcularDesconto(double valor) { return valor*0.15; }
    },
    CREDITO("Crédito", 3){
        @Override
        public double calcularDesconto(double valor) { return valor*0.05; }
    };
    String tipoPagamento;
    int id;

    TipoPagamento(String tipoPagamento, int id) {
        this.tipoPagamento = tipoPagamento;
        this.id = id;
    }

    public TipoPagamento pagamentoRelatorio(String pagamento){
        for(TipoPagamento tipoPagamento : TipoPagamento.values()){
            if(tipoPagamento.equals(pagamento)){
                return tipoPagamento;
            }
        }
        return null;
    }

    public abstract double calcularDesconto(double valor);

    public String getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getId() {
        return id;
    }
}
