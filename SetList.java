import java.util.HashMap;


public class SetList {
    private final HashMap<String, ArmorSet> sets;

    public SetList() {
        this.sets = new HashMap<>();
    }


    // Creation, deletion, checking and modification of stored sets //

    public void addSet(String setName, ArmorSet armorSet) {
        setName = sanitizeString(setName);
        sets.put(setName, armorSet);
        System.out.println("Set " + setName + " created!");
    }

    public void deleteSet(String setName) {
        setName = sanitizeString(setName);
        if (!(sets.containsKey(setName))) {
            System.out.println("No sets exists with that name");
        } else {
            sets.remove(setName);
            System.out.println("Set " + setName + " deleted!");
        }
    }

    public int checkSet(String setName) {
        setName = sanitizeString(setName);
        if(!(sets.containsKey(setName))) {
            System.out.println("No sets exists with that name");
            return 1;
        } else {
            System.out.println("Current set: " + setName);
            System.out.println(sets.get(setName).toString());
            return 0;
        }
    }

    public void modifySet(String setName, int modifiedSlot, String modifier) {
        ArmorSet modifiedSet = sets.get(setName);
        switch (modifiedSlot) {
            case 1 -> modifiedSet.setWeapon(modifier);
            case 2 -> modifiedSet.setHeadArmor(modifier);
            case 3 -> modifiedSet.setChestArmor(modifier);
            case 4 -> modifiedSet.setArmsArmor(modifier);
            case 5 -> modifiedSet.setWaistArmor(modifier);
            case 6 -> modifiedSet.setLegArmor(modifier);
        }
    }



    // Class methods //

    public static String sanitizeString(String string) {
        string = string.toLowerCase();
        return string.trim();
    }

    
    
    
}
