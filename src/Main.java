public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.CLOSE_RANGE, "Axe");
        Weapon skeletonWeapon1 = new Weapon(WeaponType.LONG_RANGE, "Bow");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.MEDIUM_RANGE, "Spear");

        Boss boss = new Boss("Minotaur", 700, 70, bossWeapon);

        System.out.println("Boss name: " + boss.getName());
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon type: " + boss.getWeapon().getWeaponType().name()
                .replace("_", " ").toLowerCase());
        System.out.println("Boss weapon name: " + boss.getWeapon().getWeaponName());

        Skeleton skeleton1 = new Skeleton("Skeleton 1", 200, 20, skeletonWeapon1, 30);
        /*skeleton1.setName("Skeleton 1");
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);
        skeleton1.setWeapon(skeletonWeapon1);*/

        Skeleton skeleton2 = new Skeleton("Skeleton 2", 300, 30, skeletonWeapon2, 0);
        /*skeleton2.setName("Skeleton 2");
        skeleton2.setHealth(300);
        skeleton2.setDamage(30);
        skeleton2.setWeapon(skeletonWeapon2);*/

        System.out.println(boss.printInfo());
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());

    }
}