public class Boss extends Character {

    public Boss (String name, double health, double power){
        super(name, health, power, "Boss");
    }

    public void attack(Character opponent){
    }

    public void heal(double addHealth){
        System.out.println("\n" + getName() + " has been healed.");
        double healedHealth = getHealth()+addHealth;
        System.out.println("Cat's current health : " + healedHealth);
    }
}
