package ted_01_05;

import java.util.Scanner;


/* 

* Desenvolva um algoritmo capaz de verificar se os números inteiros, dados como entrada, são par ou ímpar.

*/

public class OddEven {

    public static void main(String[] args) {

        // Creating the input object.
        Scanner input = new Scanner(System.in);
        
        // Getting the number.
        System.out.println("Digite um número inteiro para saber se é impar ou par: ");
        int number = input.nextInt();

        // Closing the input object.
        input.close();                          

        // Response with a ternary operator.
        System.out.println(number % 2 == 0 ? "Par":"Impar");
    }
    
}
