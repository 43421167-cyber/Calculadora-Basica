import java.util.Scanner;

/**
 * Clase principal de la calculadora
 */
public class Main {

    public static void main (String[] args){
        //Creación de objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //Pedimos los datos de entrada del usuario
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        //Creamos un objeto de tipo calculadora
        Calculadora calculadora = new Calculadora();

        //Realizamos las operaciones correspondientes
        int suma = calculadora.suma(num1, num2);
        int resta = calculadora.resta(num1, num2);
        int multiplicacion = calculadora.multiplicacion(num1, num2);
        int division = calculadora.division(num1, num2);

        //Impresion de resultados
        System.out.println("El resultado de la suma es : " +suma);
        System.out.println("El resultado de la resta es : " +resta);
        System.out.println("El resultado de la multiplicacion es : " +multiplicacion);
        System.out.println("El resultado de la division es : " +division);
    }
}
