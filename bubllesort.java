
package junior;

import java.util.Random;

public class bubllesort {

    public static void main(String[] args) {
       int vetor[] = new int [9];
       Random numeros = new Random();
       System.out.println("Veotor não ordenados ");
       for (int i = 0; i < vetor.length; ) {
           vetor[i] = numeros.nextInt(10);
           System.out.print(vetor[i]+" "); 
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]){
                   int aux = vetor[i];
                   vetor[i] = vetor[j];
                   vetor[j] = aux;
                }  
            }   
        }
        System.out.println(" ");
        System.out.println("Veotor ordenados");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]+" "); 
        }
    }
}
