package br.com.diojavabasico.ContaTerminal;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public ContaBanco(int numero, String agencia, String nomeCliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "ContaBanco{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
