public class Enemy extends Character {

    public Enemy (String name, double health, double power){
        super(name, health, power, "Enemy");
    }

    public void attack(Character opponent){
        super.attack(opponent);
    }

}
