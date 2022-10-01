package solid.lsp.exercise.bankaccount.refactored;

import java.math.BigDecimal;

public abstract class WithdrawalAccount extends Account {
    protected abstract void withdraw(BigDecimal amount);
}