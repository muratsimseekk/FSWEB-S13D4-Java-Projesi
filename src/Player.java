public class Player {

    private String name ;
    private int healthPercentage;
    private Weapon weapon ;

    public enum Weapon {
        SWORD ,
        AXE ,
        BOW
    }

    public void setName(String name) {
        this.name = name ;
    }

    public  void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage > 100) {
            this.healthPercentage =100;
        } else if (healthPercentage<0) {
            this.healthPercentage =0;
        }
        else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining (int healthPercentage) {
        return healthPercentage;
    }
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0){
            System.out.println(name+ " player has been knocked out of game");
            healthPercentage=0;
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage >=100){
            healthPercentage=100;
        }
    }
}
