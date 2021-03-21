public class Boss extends GameEntity {
    private Weapon gameWeapon;

    public Weapon getGameWeapon() {
        return gameWeapon;
    }

    public void setGameWeapon(Weapon gameWeapon) {
        this.gameWeapon = gameWeapon;
    }

    public String printInfo(){
         return "weapon - " + gameWeapon;
    }
}
