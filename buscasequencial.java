
package junior;

import java.util.Random;
import java.util.Scanner;


public class buscasequencial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int vetor[] = new int[42];
        boolean acertou= false;
        for (int i = 0; i < 42; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
        System.out.println("Digite um numero ");
        int valor = tcl.nextInt();
        for (int i = 0; i < 42; i++) {
            if (valor == vetor[i]){
                System.out.println("Numero encontrado");
                acertou = true;
                break;
            }
        }
        if (acertou == false){
            System.out.println("Numero nao encontrado");
        }       
    }
}