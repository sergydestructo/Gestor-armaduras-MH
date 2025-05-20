import java.util.HashMap;


public class SetList {
    private HashMap<String, ArmorSet> sets;

    public SetList() {
        this.sets = new HashMap<>();
    }


    // Creation, deletion and modification of stored sets //

    public void addSet(String setName, ArmorSet armorSet) {
        sets.put(setName, armorSet);
    }

    public void deleteSet(String setName) {
        sets.remove(setName);
    }

    public void modifySet(String setName, String modifiedSlot, String modifier) {
        ArmorSet modifiedSet = sets.get(setName);
        

        

    }

    
    
    
}
