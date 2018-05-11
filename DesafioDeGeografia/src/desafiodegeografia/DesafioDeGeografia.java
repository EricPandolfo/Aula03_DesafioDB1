package desafiodegeografia;

import java.util.Scanner;

/**
 *
 * @author Eric Pandolfo
 */
public class DesafioDeGeografia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Digite uma das cidades: ");
        Scanner teclado = new Scanner(System.in);
        String cidade;
        cidade = teclado.nextLine();
//Teste Estado do PR e Capital
        if (cidade.equals("Curitiba") || cidade.equals("Maringa") || cidade.equals("Londrina") || cidade.equals("Pinhais") || cidade.equals("Chapeco")) {
            System.out.print("Pertence ao PR, ");

            if (cidade.equals("Curitiba")) {
                System.out.println("É capital");
            } else {
                System.out.println("Não é capital");
            }
        }
//Teste Estado de SC e Capital 
        if (cidade.equals("Joinville") || cidade.equals("Blumenau") || cidade.equals("Florianopolis")) {
            System.out.print("Pertence a SC, ");

            if (cidade.equals("Florianopolis")) {
                System.out.println("É capital");
            } else {
                System.out.println("Não é capital");
            }
        }
//Teste Estado de RS e Capital 
        if (cidade.equals("Porto Alegre") || cidade.equals("Gramado")) {
            System.out.print("Pertence ao RS, ");

            if (cidade.equals("Porto Alegre")) {
                System.out.println("É capital");
            } else {
                System.out.println("Não é capital");
            }
        }
    }
}
