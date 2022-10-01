package solid.srp.demo.bank.dirty;

public class BankService {
    public long deposit(long amount, String accountNo) {
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        return 0;
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
        }
        if (loanType.equals("personalLoan")) {
        }
        if (loanType.equals("car")) {
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
        }
    }
}