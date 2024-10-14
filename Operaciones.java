import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de un círculo.");
            System.out.println("2. Calcular el área de un cuadrado.");
            System.out.println("3. Calcular el área de un triángulo.");
            System.out.println("4. Calcular el factorial de un número.");
            System.out.println("5. Determinar si un número es par o impar.");
            System.out.println("6. Determinar si un número es positivo, negativo o cero.");
            System.out.println("7. Calcular la suma de todos los números desde 1 hasta un número dado.");
            System.out.println("8. Salir.");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("Área del círculo: " + (Math.PI * radio * radio));
            } else if (opcion == 2) {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área del cuadrado: " + (lado * lado));
            } else if (opcion == 3) {
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Área del triángulo: " + ((base * altura) / 2));
            } else if (opcion == 4) {
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                System.out.println("Factorial de " + numero + " es: " + factorial(numero));
            } else if (opcion == 5) {
                System.out.print("Ingrese un número: ");
                int numParImpar = scanner.nextInt();
                System.out.println("El número es " + (numParImpar % 2 == 0 ? "par." : "impar."));
            } else if (opcion == 6) {
                System.out.print("Ingrese un número: ");
                int numPosNeg = scanner.nextInt();
                if (numPosNeg > 0) {
                    System.out.println("El número es positivo.");
                } else if (numPosNeg < 0) {
                    System.out.println("El número es negativo.");
                } else {
                    System.out.println("El número es cero.");
                }
            } else if (opcion == 7) {
                System.out.print("Ingrese un número: ");
                int numSumar = scanner.nextInt();
                int suma = 0;
                for (int i = 1; i <= numSumar; i++) {
                    suma += i;
                }
                System.out.println("La suma de todos los números desde 1 hasta " + numSumar + " es: " + suma);
            } else if (opcion == 8) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
