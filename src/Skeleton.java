public class Skeleton extends Boss{

    private int arrowsQuantity;

    public Skeleton(String name, int health, int damage, Weapon weapon, int arrowsQuantity) {
        super(name, health, damage, weapon);
        this.arrowsQuantity = arrowsQuantity;
    }

    public int getArrowsQuantity() {
        return arrowsQuantity;
    }

    public void setArrowsQuantity(int arrowsQuantity) {
        this.arrowsQuantity = arrowsQuantity;
    }

    public String printInfo() {
        return super.printInfo() + " Arrows quantity: " + this.arrowsQuantity;
    }
}
