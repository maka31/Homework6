public class Main {

    public static void main(String[] args) {

        Weapon weapon1 = new Weapon();
        weapon1.setWeaponType("firearm");
        weapon1.setWeaponName("AK-47");

        Weapon weapon2 = new Weapon();
        weapon2.setWeaponType("bow");
        weapon2.setWeaponName("Classical");

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(70);
        boss.setGameWeapon(weapon1);
        System.out.println("Boss info: " + "health - " + boss.getHealth() + ", damage - " + boss.getDamage() +
                ", weapon - " +  boss.getGameWeapon().getWeaponType() + " " + boss.getGameWeapon().getWeaponName());
        System.out.println(boss.printInfo()); // распечатывает ссылку на weapon1
        System.out.println("-----------------------------");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);
        skeleton1.setGameWeapon(weapon2);
        skeleton1.setNumberOfArrows(200);
        System.out.println("Skeleton1 info: " + "health - " + skeleton1.getHealth() + ", damage - " +
                skeleton1.getDamage() + ", weapon - " +  skeleton1.getGameWeapon().getWeaponType() + " " +
                skeleton1.getGameWeapon().getWeaponName() + ", arrowsNo. - " + skeleton1.getNumberOfArrows());
        System.out.println(skeleton1.printInfo()); // распечатывает ссылку на weapon2
        System.out.println("-----------------------------");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(220);
        skeleton2.setDamage(20);
        skeleton2.setGameWeapon(weapon2);
        skeleton2.setNumberOfArrows(220);
        System.out.println("Skeleton2 info: " + "health - " + skeleton2.getHealth() + ", damage - " +
                skeleton2.getDamage() + ", weapon - " +  skeleton2.getGameWeapon().getWeaponType() + " " +
                skeleton2.getGameWeapon().getWeaponName() + ", arrowsNo. - " + skeleton2.getNumberOfArrows());
        System.out.println(skeleton2.printInfo()); // распечатывает ссылку на weapon2

    }
}
