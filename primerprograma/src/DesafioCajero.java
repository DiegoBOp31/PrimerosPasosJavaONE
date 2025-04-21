import java.util.Scanner;

public class DesafioCajero {
    public static void main(String[] args) {
        double dinero = 1599.99;
        Scanner scanner = new Scanner(System.in);
        int selector;
        double retiroDeposito;

        System.out.println("***********************************************\n");
        System.out.println("Nombre del cliente: Tony Stark");
        System.out.println("Tipo de cuenta: Corriente");
        System.out.printf("Saldo disponible: %.2f $\n\n", dinero);
        System.out.println("***********************************************");

        String menuPrincipal = """
                *** Escriba el número de la opción que desea ***
                1.- Consultar saldo
                2.- Retirar efectivo
                3.- Depositar
                9.- Salir
                """;

        System.out.println(menuPrincipal);

        selector = scanner.nextInt();
        while(selector!=9){
            if(selector == 1){
                System.out.printf("Saldo disponible: %.2f $\n",dinero);
                System.out.println(menuPrincipal);
            }
            else if (selector == 2) {
                System.out.println("¿Cual es la cantidad que deseas retirar?");
                retiroDeposito = scanner.nextDouble();
                if(retiroDeposito>dinero){
                    System.out.println("El saldo es insuficiente");
                    System.out.println(menuPrincipal);
                }
                else {
                    System.out.printf("El saldo restante es: %.2f $%n", dinero -= retiroDeposito);
                    System.out.println(menuPrincipal);
                }
            }
            else if (selector == 3) {
                System.out.println("¿Cuál es el valor que vas a depositar?");
                retiroDeposito = scanner.nextDouble();
                System.out.printf("El saldo actualizado es: %.2f $\n",dinero += retiroDeposito);
                System.out.println(menuPrincipal);
            }
            else {
                System.out.println("Esa opción no es válida, por favor ingrese una opción válida del menú");
                System.out.println(menuPrincipal);
            }
            selector = scanner.nextInt();
        }
        System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
    }
}