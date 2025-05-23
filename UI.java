import java.util.Scanner;

public class UI {
    private final Scanner scan;
    private SetList setList; 

    public UI(Scanner scanner, SetList setList) {
        this.scan = scanner;
        this.setList = setList;
    }

    public void start() {
        System.out.println("Bienvenido al gestor de armaduras más pocho de la historia. ¿Qué deseas hacer?:");
        
        while(true) {
            System.out.println("1) Añadir un set. \n2) Eliminar un set. \n3) Comprobar sets creados. \n4) Modificar un set. \n5) Salir.");

            int action = Integer.valueOf(scan.nextLine());

            switch (action) {
                case 1:
                    System.out.print("WEAPON: ");
                    String weaponSlot = scan.nextLine();
                    System.out.print("HEAD: ");
                    String headSlot = scan.nextLine();
                    System.out.print("CHEST: ");
                    String chestSlot = scan.nextLine();
                    System.out.print("ARMS: ");
                    String armsSlot = scan.nextLine();
                    System.out.print("WEIST: ");
                    String weistSlot = scan.nextLine();
                    System.out.print("LEGS: ");
                    String legsSlot = scan.nextLine();

                    ArmorSet set = new ArmorSet(weaponSlot, headSlot, chestSlot, armsSlot, weistSlot, legsSlot);

                    System.out.print("Name your set: ");
                    String setName = scan.nextLine();
                    setList.addSet(setName, set);
             
                    break;
                    
                case 2:
                    System.out.print("Type set's name: ");
                    String deletedSet = scan.nextLine();
                    setList.deleteSet(deletedSet);
                    break;
                case 3:
                    // Comprobar set //
                    System.out.print("Type set's name: ");
                    String checkedSet = scan.nextLine();
                    setList.checkSet(checkedSet);
                    break;
                case 4:
                    // Modificar set //
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta.");
            }

        }

    }
}
