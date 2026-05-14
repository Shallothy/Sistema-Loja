package shall.domain.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum TypePayment {
    MONEY("Cash", 1){
        @Override
        public BigDecimal calculateDiscount(BigDecimal value) {
            return value.multiply(new BigDecimal("0.25")).setScale(2, RoundingMode.HALF_UP);
        }
    },
    DEBIT("Debit", 2){
        @Override
        public BigDecimal calculateDiscount(BigDecimal value) {
            return value.multiply(new BigDecimal("0.15")).setScale(2, RoundingMode.HALF_UP);
        }
    },
    CREDIT("Credit", 3){
        @Override
        public BigDecimal calculateDiscount(BigDecimal value) {
            return value.multiply(new BigDecimal("0.05")).setScale(2, RoundingMode.HALF_UP);
        }
    };
    String paymentType;
    int id;

    TypePayment(String paymentType, int id) {
        this.paymentType = paymentType;
        this.id = id;
    }

    public static TypePayment paymentReport(String paymentName) {
        for (TypePayment typePayment : TypePayment.values()) {
            if (typePayment.getPaymentType().equalsIgnoreCase(paymentName)) {
                return typePayment;
            }
        }
        return null;
    }

    public abstract BigDecimal calculateDiscount(BigDecimal value);

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
