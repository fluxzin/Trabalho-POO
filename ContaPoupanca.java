public class ContaPoupanca extends Conta {


    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
     }

    public void calcularSaldo() {
        Double saldo = 0.0, ccd = 0.0, ccc = 0.0;
        for (Debito debito: getListaDebito()) {
            ccd+=debito.getValor();
        }
        for (Credito credito: getListaCredito()) {
            ccc+=credito.getValor();
        }

        saldo = (ccd - ccc);
        System.out.println("Saldo Poupança =" + saldo);
    }
}
