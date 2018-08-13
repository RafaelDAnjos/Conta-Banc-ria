/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author rafael
 */
public class ContaCorrente {
   private int numero;
   private String nomeCliente;
   private double saldo;
   private int agencia;
   private double limite;
    public ContaCorrente(String numconta,String nomeCliente,String saldo, String agencia,String limite){
        this.numero = Integer.parseInt(numconta);
        this.nomeCliente = nomeCliente;
        this.agencia = Integer.parseInt(agencia);
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
     
        if(nomeCliente.length()>= 6){
        this.nomeCliente = nomeCliente;
        }
    }
    public void depositar(double valor){
        this.saldo+= valor;
    }
    public void sacar(double valor){
        if(this.saldo >= valor && this.saldo>0){
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void imprimesaldo(){
        System.out.println("O saldo na sua Conta Corrente é: "+this.saldo);
    }
}
