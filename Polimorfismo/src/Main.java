import java.util.ArrayList;
import java.util.List;

 class Banco {
    private int numInstrumentos;
    private List<InstrumentoFinanceiro> instrumentos;

    public Banco() {
        instrumentos = new ArrayList<>();
    }

    public void adicionar(InstrumentoFinanceiro instrumento) {
        instrumentos.add(instrumento);
        numInstrumentos = instrumentos.size();
    }

    public float calcularSaldos() {
        float saldoTotal = 0;

        for (InstrumentoFinanceiro instrumento : instrumentos) {
            saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Acao acao = new Acao();
        acao.setSaldo(100);
        acao.setCotas(5);
        banco.adicionar(acao);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(500);
        contaCorrente.setLimite(1000);
        banco.adicionar(contaCorrente);

        FundoDeAplicacao fundo = new FundoDeAplicacao();
        fundo.setSaldo(1000);
        fundo.setRentabilidade(0.1f);  // 10% de rentabilidade
        banco.adicionar(fundo);

        System.out.println("Saldo total: " + banco.calcularSaldos());
    }
}
