package desafio_de_matematica;

import java.util.Scanner;

/**
 *
 * @author Eric Pandolfo
 */
public class Desafio_de_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt();                                              //Método para receber o valor digitado
        System.out.print("O número digitado ");
//Teste Impar ou Par
        if (n % 2 == 0) {
            System.out.print("é par, não é impar, ");
        } else {
            System.out.print("é impar, não é par, ");
        }
//Teste maior que 10   
        if (n < 10) {
            System.out.print("é menor que 10, ");
        } else if(n == 10){                                                 
            System.out.print("é igual a 10, ");
        }    
        else {
            System.out.print("é maior que 10, ");
        }
//Dobro do valor digitado
        int n1 = n * 2;
        System.out.print("o dobro de " + n + " é " + n1);

//Numero Primo
        int contador = 0;
        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println(", é primo");
        } else {
            System.out.println(", nao é primo");
        }
    }
}