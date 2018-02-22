package testpolinomios;
import java.util.Scanner;

public class TestPolinomio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double n;
        
        Polinomio polinomioUno = new Polinomio();
        polinomioUno.leerPolinomio();
        
        System.out.println("Ingrese el valor a evauar: ");
        n = input.nextDouble();
        polinomioUno.evaluarPolinomio(n);
        
    }
}
