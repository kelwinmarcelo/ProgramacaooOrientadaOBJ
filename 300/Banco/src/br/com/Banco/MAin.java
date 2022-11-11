package br.com.Banco;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Corrente corrente = new Corrente();

        System.out.println("nome Cliente : ");
        String nome = s.nextLine();
        corrente.getCliente().setNome(nome);

        // deposito
        System.out.println("deposito : ");
        Double deposito = s.nextDouble();
        corrente.deposito(deposito);
        System.out.println("Saldo Atual : " + corrente.getSaldo());

        // saque
        System.out.println("saque : ");
        Double saque = s.nextDouble();
        corrente.saque(saque);
        System.out.println("Saldo Atual : " + corrente.getSaldo());

        Poupanca poupanca = new Poupanca();

        System.out.println("nome Cliente : ");
        nome = s.nextLine();
        poupanca.getCliente().setNome(nome);

        // deposito
        System.out.println("deposito : ");
        deposito = s.nextDouble();
        poupanca.deposito(deposito);
        System.out.println("Saldo Atual : " + corrente.getSaldo());

        // saque
        System.out.println("saque : ");
        saque = s.nextDouble();
        poupanca.saque(saque);
        System.out.println("Saldo Atual : " + corrente.getSaldo());

        s.close();
    }
}
