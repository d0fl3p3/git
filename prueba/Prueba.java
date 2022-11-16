package prueba;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Java");
        System.out.println("Hola Mundo Visual Studio Code");
        int a = 5;
        int b = 6;
        int resultado;
        resultado = a + b;
        System.out.println("El resultado es: " + resultado);
        System.out.print("Raiz Cuadrada de: ");
        Scanner teclado = new Scanner(System.in);
        double numero = Double.parseDouble(teclado.nextLine());
        double raiz = Math.sqrt(numero);
        System.out.println("El resultado es: " + raiz);
        teclado.close();
        //Comentario para prueba de pull
    }
}
