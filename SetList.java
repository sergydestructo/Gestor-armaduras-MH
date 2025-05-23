import java.util.HashMap;


public class SetList {
    private HashMap<String, ArmorSet> sets;

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
        };
    }

    public void checkSet(String setName) {
        setName = sanitizeString(setName);
        if(!(sets.containsKey(setName))) {
            System.out.println("No sets exists with that name");
        } else {
            System.out.println("Current set: " + setName);
            System.out.println(sets.get(setName).toString());
        }
    }

    public void modifySet(String setName, String modifiedSlot, String modifier) {
    }

    // Class methods //

    public static String sanitizeString(String string) {
        string = string.toLowerCase();
        return string.trim();
    }

    
    
    
}
