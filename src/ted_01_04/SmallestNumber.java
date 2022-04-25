package ted_01_04;

import java.util.Scanner;


/*

Desenvolva um algoritmo capaz de encontrar o menor dentre 3 números inteiros quaisquer dados pelo teclado.

*/


public class SmallestNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Input object.
        double[] numberList = new double[3];    // Number list.
        double smallest = 0;                    // Smallest number.

        // Adding the numbers in number list.
        System.out.println("Digite o primeiro número: ");
        numberList[0] = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        numberList[1] = input.nextDouble();

        System.out.println("Digite o terceiro número: ");
        numberList[2] = input.nextDouble();

        // Finding and showing the smallest number.
        for (int i = 0; i<numberList.length; i++) {
            
            if (i == 0) {
                smallest = numberList[i];
            } else if (numberList[i] < smallest) { smallest = numberList[i]; }
        }
        System.out.println("Menor número: "+smallest);
        
        // Creating the calculator object and sending these numbers
        Calculator calc = new Calculator(numberList[0],numberList[1],numberList[2]);

        // Sum the numbers.
        System.out.println("Soma dos números: "+calc.sum());

        // Subtracting the numbers.
        System.out.println("Subtração dos números: "+calc.subtraction());

        // Dividing the numbers.
        System.out.println("Divisão dos números: "+calc.division());

        // Multiplying the numbers.
        System.out.println("Multiplicação dos números: "+calc.multiplication());

        // Closing the input object.
        input.close();
    }
}
