package solid.isp.exercise.refactored;

public interface Loan extends Payment {
    void initiateLoanSettlement();

    void initiateRePayment();
}