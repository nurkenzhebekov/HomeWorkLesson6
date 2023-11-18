public class Boss extends GameEntity {

    private Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss name: " + super.getName() + " Boss health: " + super.getHealth()
                + " Boss damage: " + super.getDamage() + " Boss weapon type: " + this.weapon.getWeaponType()
                .name().replace("_", " ").toLowerCase()
                + " Boss weapon name: " + this.weapon.getWeaponName();
    }
}
