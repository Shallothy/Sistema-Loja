package shall.domain.enums;

public enum TypePayment {
    MONEY("Cash", 1){
        @Override
        public double calculateDiscount(double value) { return value*0.25; }
    },
    DEBIT("Debit", 2){
        @Override
        public double calculateDiscount(double value) { return value*0.15; }
    },
    CREDIT("Credit", 3){
        @Override
        public double calculateDiscount(double value) { return value*0.05; }
    };
    String paymentType;
    int id;

    TypePayment(String paymentType, int id) {
        this.paymentType = paymentType;
        this.id = id;
    }

    public TypePayment pagamentoRelatorio(String pagamento){
        for(TypePayment typePayment : TypePayment.values()){
            if(typePayment.equals(pagamento)){
                return typePayment;
            }
        }
        return null;
    }

    public abstract double calculateDiscount(double value);

    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }
}
