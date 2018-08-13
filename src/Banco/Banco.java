/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String flag,nomeCliente,agencia,limite,saldo,numConta;
      
        for(;;){
           flag = JOptionPane.showInputDialog("Escolha o tipo de conta que deseja iniciar:/n 1-Conta-Corrente 2-Conta Poupança");
           
           if(flag.equalsIgnoreCase("2")){
               ContaCorrente novaconta;
                   nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");
                   agencia = JOptionPane.showInputDialog("Insira a agência: ");
                   numConta = JOptionPane.showInputDialog("Insira o numero da conta: ");
                   saldo = JOptionPane.showInputDialog("Insira o Saldo Inicial");
                   limite = JOptionPane.showInputDialog("Insira o limite da conta");
                   
               novaconta = new ContaCorrente(numConta,nomeCliente,saldo,agencia,limite);
           }else{
               if(flag.equalsIgnoreCase("2")){
                   ContaPoupanca novaconta;
                   nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");
                   agencia = JOptionPane.showInputDialog("Insira a agência: ");
                   numConta = JOptionPane.showInputDialog("Insira o numero da conta: ");
                   saldo = JOptionPane.showInputDialog("Insira o Saldo Inicial");
                   
                   novaconta = new ContaPoupanca(numConta,nomeCliente,saldo,agencia);
               }
               
           } 
                   
            
        }
    }
    
}
