import java.util.HashMap;


public class SetList {
    private HashMap<String, ArmorSet> sets;

    public SetList() {
        this.sets = new HashMap<>();
    }

    public void addSet(String setName, ArmorSet armorSet) {
        sets.put(setName, armorSet);
    }
    
    
    
}
