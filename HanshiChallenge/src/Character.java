public abstract class Character {

    //deklarasi atribut (private)
    private String name;
    private double health;
    private double power;
    private String type;

    //constructor atribut (penyatu atribut)
    public Character (String name, double health, double power, String type){
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
    }

    //getter untuk mengakses nilai dari atribut private
    public String getName(){
        return name;
    }

    public double getHealth (){
        return health;
    }

    public double getPower(){
        return power;
    }

    //method untuk display atribut Character
    public void display(){
        if (getHealth() > 0) {
            System.out.println("\nName\t: " + name);
            System.out.println("Health\t: " + health);
            System.out.println("Type\t: " + type);
        }
        else if (getHealth() <= 0) {
            System.out.println("\nName\t: " + name);
            System.out.println("Type\t: " + type);
            System.out.println("Status\t: Deceased");
        }
    }

    //method untuk nyerang lawan
    public void attack(Character opponent){
        System.out.println("\n" + getName() + " has attacked " + opponent.name);
        opponent.damageReceived(getPower()); //manggil method damageReceived buat ngurangin health
        //damage yg dikasi itu sama besarnya sama power yg dikasi character
    }

    //method untuk ngeliat health setelah diserang (Recent health)
    public void damageReceived (double damage){
        System.out.println(this.name + " received " + damage + " damage");
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println(this.type + " has been defeated.");
        }
        else if (this.health > 0) {
            System.out.println("\n" + this.name + "'s remaining health : " + this.health);
        }
        
        
    }
    
}
