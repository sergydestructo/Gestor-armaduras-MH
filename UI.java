import java.util.Scanner;

public class UI {
    private final Scanner scan;
    private final SetList setList;

    public UI(Scanner scanner, SetList setList) {
        this.scan = scanner;
        this.setList = setList;
    }

    public void start() {
        System.out.println("Bienvenido al gestor de armaduras más pocho de la historia. ¿Qué deseas hacer?:");
        addSpace();
        
        while(true) {
            System.out.println("1) Create a New Set. \n2) Check Created Sets. \n3) Exit.");
            addSpace();

            int action = Integer.parseInt(scan.nextLine());

            switch (action) {
                case 1:
                    addSpace();
                    System.out.print("WEAPON: ");
                    String weaponSlot = scan.nextLine();
                    System.out.print("HEAD: ");
                    String headSlot = scan.nextLine();
                    System.out.print("CHEST: ");
                    String chestSlot = scan.nextLine();
                    System.out.print("ARMS: ");
                    String armsSlot = scan.nextLine();
                    System.out.print("WAIST: ");
                    String waistSlot = scan.nextLine();
                    System.out.print("LEGS: ");
                    String legsSlot = scan.nextLine();

                    ArmorSet set = new ArmorSet(weaponSlot, headSlot, chestSlot, armsSlot, waistSlot, legsSlot);

                    System.out.print("Name your set: ");
                    String setName = scan.nextLine();
                    addSpace();
                    setList.addSet(setName, set);
                    addSpace();
             
                    break;
                    
                case 2:
                    // Comprobar set //
                    System.out.print("Type set's name: ");
                    String checkedSet = scan.nextLine();
                    addSpace();
                    int checkedStatus = setList.checkSet(checkedSet);
                    addSpace();

                    // Opciones de modificación de Set //
                    if (checkedStatus == 0) {
                        System.out.println("1) Modify Set. \n2) Delete Set. \n3) Go Back.");
                        addSpace();
                        action = Integer.parseInt(scan.nextLine());

                        switch (action) {
                            // Modificar Set
                            case 1:
                                addSpace();
                                System.out.println("1) Weapon. \n2) Head. \n3) Chest. \n4) Arms. \n5) Waist. \n6) Legs.");
                                addSpace();
                                action = Integer.parseInt(scan.nextLine());
                                System.out.print("Name of the new piece?: ");
                                String newPiece = scan.nextLine();
                                setList.modifySet(checkedSet, action, newPiece);
                                addSpace();
                                System.out.println("Set modified!");
                                addSpace();
                                break;
                            // Eliminar Set    
                            case 2:
                                System.out.print("Are you sure you want to the delete the set " + checkedSet + "? (Y/n): ");
                                String confirmation = scan.nextLine();

                                if (confirmation.equals("Y") || confirmation.equals("y") || confirmation.equals("") ) {
                                    setList.deleteSet(checkedSet);
                                    addSpace();
                                }
                                break;
                                
                            // Volver al menú principal    
                            case 3:
                                break;
                        }

                    }

                    break;
                case 3:
                    System.out.println("¡Hasta la próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta.");
            }

        }

    }

    public void addSpace() {
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");

    }
}
