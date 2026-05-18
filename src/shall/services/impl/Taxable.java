package shall.services.impl;

public interface Taxable {
    void calculateINSS();
    void calculateHealth();
    void calculateFoodVoucher(int businessDays);
}