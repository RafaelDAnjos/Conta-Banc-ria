
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
        String flag,flag2="1",nomeCliente,agencia,limite,saldo,numConta;
        
        for(;;){
           if(flag2.equalsIgnoreCase("1")){
           flag = JOptionPane.showInputDialog("Escolha o tipo de conta que deseja iniciar:/n 1-Conta-Corrente 2-Conta Poupança");
           
           if(flag.equalsIgnoreCase("1")){
               ContaCorrente novaconta;
                   nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");
                   agencia = JOptionPane.showInputDialog("Insira a agência: ");
                   numConta = JOptionPane.showInputDialog("Insira o numero da conta: ");
                   saldo = JOptionPane.showInputDialog("Insira o Saldo Inicial");
                   limite = JOptionPane.showInputDialog("Insira o limite da conta");
                   
                   novaconta = new ContaCorrente(numConta,nomeCliente,saldo,agencia,limite);
                   novaconta.imprimesaldo();
               
           }else{
               if(flag.equalsIgnoreCase("2")){
                   ContaPoupanca novaconta;
                   nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");
                   agencia = JOptionPane.showInputDialog("Insira a agência: ");
                   numConta = JOptionPane.showInputDialog("Insira o numero da conta: ");
                   saldo = JOptionPane.showInputDialog("Insira o Saldo Inicial");
                   
                   novaconta = new ContaPoupanca(numConta,nomeCliente,saldo,agencia);
                   novaconta.imprimesaldo();
               }
               
           } 
                   
           }else{
           break;
           }
           flag2= JOptionPane.showInputDialog("Deseja continuar criando contas? /n 1-Sim 2-Não");
        }
    }
    
}