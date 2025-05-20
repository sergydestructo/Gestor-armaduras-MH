import java.util.Scanner;

public class UI {
    private final Scanner scan;
    private SetList setList; 

    public UI(Scanner scanner, SetList setList) {
        this.scan = scanner;
        this.setList = setList;
    }

    public void start() {
        while(true) {
            System.out.println("Bienvenido al gestor de armaduras más pocho de la historia. ¿Qué deseas hacer?:");
            System.out.println("1) Añadir un set. \n2) Eliminar un set. \n3) Comprobar sets creados. \n4) Salir.");

            int action = Integer.valueOf(scan.nextLine());

            switch (action) {
                case 1:
                    // Añadir set //
                case 2:
                    // Eliminar set //
                case 3:
                    // Comprobar set //
                case 4:
                    System.out.println("¡Hasta la próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta.");
            }

        }

    }
}
