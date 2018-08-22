package junior;

import java.util.Scanner;
public class Junior {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Saldo inicial");
        int saldo = tcl.nextInt();
            System.out.println("CAIXA ELETRONICO");
            System.out.println("**Caixa Eletronico**");
            System.out.println(" 1 - Para Ver Saldo");
            System.out.println(" 2 - Para Saquar");
            System.out.println(" 3 - Para Depositar");
            System.out.println(" 4 - Para Sair");  
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual ação você deseja executar? ");
        int acao = tec.nextInt();
        if(acao == 0){
            System.out.println("Qual opção você deseja?");
            System.out.println("**Caixa Eletronico**");
            System.out.println(" 1 - Para Ver Saldo");
            System.out.println(" 2 - Para Saquar");
            System.out.println(" 3 - Para Depositar");
            System.out.println(" 4 - Para Sair");
            }else{
                switch (acao) {
                    case 1: {
                        System.out.println("Seu saldo e de "+saldo);
                        break;
                    }
                    case 2: {
                        Scanner saq = new Scanner(System.in);
                        System.out.println("Digite o valor que deseja saquar!");
                        int valor = saq.nextInt();
                        saldo = saldo - valor;
                        System.out.println("Seu saldo e de "+saldo);
                        break;
                    }
                    case 3: {
                        Scanner dep = new Scanner(System.in);
                        System.out.println("Digite o quanto quer depositar!");
                        int deposito = dep.nextInt();
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo e de "+saldo);
                        break;
                    }
                    case 4: {
                        System.exit(1);
                        break;
                    }
                }
            }
        }
    }
    
        
