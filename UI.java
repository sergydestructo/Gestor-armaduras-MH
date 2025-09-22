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
                    int checkedStatus = setList.checkSet(checkedSet);
                    
                    // Opciones de modificación de Set //
                    if (checkedStatus == 0) {
                        System.out.print("1) Modify Set. \n2) Delete Set. \n3) Go Back.");
                        int nestedAction = scan.nextInt();

                    // ESTO ESTA ROTO Y NO FUNCA. Al elegir un slot de armadura (3, por ejemplo) salta al case 2, y borra completamente los datos de el slot elegido y todos los siguientes.
                        switch (nestedAction) {
                            case 1:
                                System.out.print("1) Weapon. \n2) Head. \n3) Chest. \n4) Arms. \n5) Weist. \n6) Legs.");
                                int changeSlot = scan.nextInt();
                                System.out.print("Name of the new piece?: ");
                                String newPiece = scan.nextLine();
                                setList.modifySet(checkedSet, changeSlot, newPiece);
                            case 2:
                                System.out.print("NOT IMPLEMENTED");
                            case 3:
                                break;
                        }

                    }

                    break;
                case 4:
                    // Modificar set //
                    //System.out.print("Type set's name: ");
                    //String modifiedSet = scan.nextLine();
                    
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta.");
            }

        }

    }
}
