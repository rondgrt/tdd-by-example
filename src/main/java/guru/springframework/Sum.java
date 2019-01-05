package guru.springframework;

public class Sum implements Expression {
    Expression augment;
    Expression addmend;

    public Sum(Expression augment, Expression addmend) {
        this.augment = augment;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = augment.reduce(bank, toCurrency).amount + addmend.reduce(bank, toCurrency).amount;

        return new Money(amount, toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augment.times(multiplier), addmend.times(multiplier));
    }
}
