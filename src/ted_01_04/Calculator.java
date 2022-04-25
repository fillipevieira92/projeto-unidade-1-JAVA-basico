package ted_01_04;


/* 

Crie uma classe Calculadora que dentro dela, tenha um método que recebe 3 número e faça o que foi pedido.

*/

public class Calculator {
    
    double n1;
    double n2;
    double n3;
    
    public Calculator(double n1, double n2, double n3) {

        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

    }

    public double sum(){ return this.n1+this.n2+this.n3; }

    public double subtraction() { return this.n1-this.n2-this.n3; }

    public double division() { return this.n1/this.n2/this.n3; }

    public double multiplication() { return this.n1*this.n2*this.n3; }
}
