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
public class ContaPoupanca {
    private int numconta;
    private String nomeCliente;
    private double saldo;
    private int agencia;
    
    public ContaPoupanca(String numconta,String nomeCliente,String saldo, String agencia){
        this.numconta = Integer.parseInt(numconta);
        this.nomeCliente = nomeCliente;
        this.agencia = Integer.parseInt(agencia);
        this.saldo = Double.parseDouble(saldo);
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        this.saldo+=valor;
        return true;
    }
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
}
