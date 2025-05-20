public class ArmorSet {
    private String weapon;
    private String headArmor;
    private String chestArmor;
    private String armsArmor;
    private String weistArmor;
    private String legArmor;

    public ArmorSet(String weapon, String headArmor, String chestArmor, String armsArmor, String weistArmor, String legArmor) {
        this.weapon = weapon;
        this.headArmor = headArmor;
        this.chestArmor = chestArmor;
        this.armsArmor = armsArmor;
        this.weistArmor = weistArmor;
        this.legArmor = legArmor;
    }



    // Getters, Setters and Overrides //

    public String getWeapon() {
        return weapon;
    }

    public String getHeadArmor() {
        return headArmor;
    }

    public String getChestArmor() {
        return chestArmor;
    }

    public String getArmsArmor() {
        return armsArmor;
    }

    public String getWeistArmor() {
        return weistArmor;
    }

    public String getLegArmor() {
        return legArmor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHeadArmor(String headArmor) {
        this.headArmor = headArmor;
    }

    public void setChestArmor(String chestArmor) {
        this.chestArmor = chestArmor;
    }

    public void setArmsArmor(String armsArmor) {
        this.armsArmor = armsArmor;
    }

    public void setWeistArmor(String weistArmor) {
        this.weistArmor = weistArmor;
    }

    public void setLegArmor(String legArmor) {
        this.legArmor = legArmor;
    }

@Override

    public String toString() {
        return "Arma: " + weapon
        + "\nCabeza: " + headArmor
        + "\nPecho: " + chestArmor
        + "\nBrazos: " + armsArmor
        + "\nCintura: " + weistArmor
        + "\nPies: " + legArmor;
    }
}    