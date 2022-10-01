package solid.lsp.exercise.bankaccount.refactored;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private final WithdrawalAccount withdrawalAccount;

    public BankingAppWithdrawalService(WithdrawalAccount withdrawalAccount) {
        this.withdrawalAccount = withdrawalAccount;
    }

    public void withdraw(BigDecimal amount) {
        withdrawalAccount.withdraw(amount);
    }
}