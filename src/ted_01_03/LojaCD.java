package ted_01_03;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/* 
    
* Em uma loja de CD 's existem apenas quatro tipos de preços que estão associados a cores. 
* Assim os CD´s que ficam na loja não são marcados por preços e sim por cores. 
* Desenvolva um algoritmo que a partir da entrada da cor o software mostra o preço. 
* A loja está atualmente com a seguinte tabela de preços. 

    +------------------+
    | COR      | PREÇO |
    |----------|-------|
    | Verde    | 10,00 |
    | Azul     | 20,00 |
    | Amarelo  | 30,00 |
    | Vermelho | 40,00 |
    +------------------+

*/

public class LojaCD {

    public static void main(String[] args) {
        
        // Opening a input object.
        Scanner input = new Scanner(System.in);        

        // Creating a key value object.
        Map<String,Double> cdData = new HashMap<String, Double>();

        // Loading data into the key value object.
        cdData.put("verde", 10.00);
        cdData.put("azul", 20.00);
        cdData.put("amarelo", 30.00);
        cdData.put("vermelho", 40.00);        
        
        // Receiving a color name input.
        System.out.println("Digite a cor do cd: ");
        String color = input.nextLine();
            
        // Searching for the price.
        Double price = cdData.get(color.toLowerCase());

        if (price == null) {
            // If not found any data.
            System.out.println("Não existe preço relacionado a cor "+color);

        } else {
            // Showing color and price.
            System.out.printf("O CD com a cor '%s' custa R$%s!\n",color,price);
        }

        // Closing the input object.
        input.close();
    }
}
