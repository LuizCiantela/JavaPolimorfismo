public abstract class InstrumentoFinanceiro {
    protected float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public abstract float calcularSaldoTotal();
}
