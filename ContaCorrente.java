import java.util.ArrayList;
import java.util.Collection;

public class ContaCorrente extends Conta {

    private Double limite;

    private Collection<Integer> depositos = new ArrayList<>();


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor) {
        Debito DebTransf = new Debito (this);
        DebTransf.setValor(valor);
        this.addDebitos(DebTransf);

        Credito CredTransf = new Credito (contaDestino);
        CredTransf.setValor(valor);
        contaDestino.addCreditos(CredTransf);
    }

    public void calcularSaldo() {
        Double saldo = 0.0, ccd = 0.0, ccc = 0.0;
        for (Debito debito: getListaDebito()) {
            ccd +=debito.getValor();
        }
        for (Credito credito: getListaCredito()) {
            ccc +=credito.getValor();
        }

        saldo = (ccd - ccc) + limite;
            System.out.println("Saldo atual =" +saldo);
    }
}
