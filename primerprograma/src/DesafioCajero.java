import java.util.Scanner;

public class DesafioCajero {
    public static void main(String[] args) {
        double dinero = 1599.99;
        Scanner scanner = new Scanner(System.in);
        int selector;
        double retiroDeposito = 0;

        String menuPrincipal = String.format("""
                ***********************************************
                
                Nombre del cliente: Tony Stark
                Tipo de cuenta: Corriente
                Saldo disponible: %.2f $
                
                ***********************************************
                *** Escriba el número de la opción que desea ***
                1.- Consultar saldo
                2.- Retirar efectivo
                3.- Depositar
                9.- Salir
                """, dinero);

        System.out.println(menuPrincipal);

        selector = scanner.nextInt();
        while(selector!=9){
            if(selector == 1){
                menuPrincipal = String.format("""
                        Su saldo es: %.2f $
                        *** Escriba el número de la opción que desea ***
                        1.- Consultar saldo
                        2.- Retirar efectivo
                        3.- Depositar
                        9.- Salir
                        """, dinero);
                System.out.println(menuPrincipal);
            }
            else if (selector == 2) {
                System.out.println("¿Cual es la cantidad que deseas retirar?");
                retiroDeposito = scanner.nextDouble();
                if(retiroDeposito>dinero){
                    menuPrincipal =
                            """
                            El saldo es insuficiente
                            *** Escriba el número de la opción que desea ***
                            1.- Consultar saldo
                            2.- Retirar efectivo
                            3.- Depositar
                            9.- Salir
                            """;
                    System.out.println(menuPrincipal);
                }
                else {
                    dinero -= retiroDeposito;
                    menuPrincipal =
                            String.format("""
                            El saldo restante es: %.2f $
                            *** Escriba el número de la opción que desea ***
                            1.- Consultar saldo
                            2.- Retirar efectivo
                            3.- Depositar
                            9.- Salir
                            """, dinero);
                    System.out.println(menuPrincipal);
                }
            }
            else if (selector == 3) {
                System.out.println("¿Cuál es el valor que vas a depositar?");
                retiroDeposito = scanner.nextDouble();
                dinero += retiroDeposito;
                menuPrincipal = String.format(
                        """
                        El saldo actualizado es: %.2f $
                        *** Escriba el número de la opción que desea ***
                        1.- Consultar saldo
                        2.- Retirar efectivo
                        3.- Depositar
                        9.- Salir
                        """, dinero);
                System.out.println(menuPrincipal);
            }
            else {
                menuPrincipal =
                        """
                        Esa opción no es válida, por favor ingrese una opción válida del menú
                        *** Escriba el número de la opción que desea ***
                        1.- Consultar saldo
                        2.- Retirar efectivo
                        3.- Depositar
                        9.- Salir
                        """;
                System.out.println(menuPrincipal);
            }
            selector = scanner.nextInt();
        }
        System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");

    }
}
