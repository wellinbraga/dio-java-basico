package br.com.diojavabasico.ContaTerminal;

import java.time.Clock;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        float saldoConta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor, digite o nro da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Favor, digite a Agencia da conta");
        agenciaConta = sc.next();

        System.out.println("Favor, digite seu Nome");
        nomeCliente = sc.next();

        System.out.println("Favor, inform o seu Saldo");
        saldoConta = sc.nextFloat();


        ContaBanco conta = new ContaBanco(numeroConta, agenciaConta, nomeCliente, saldoConta);

        System.out.println(conta +  " Criado com sucesso!");

        sc.close();
    }
}