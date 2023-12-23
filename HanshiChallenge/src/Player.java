public class Player extends Character {

    public Player (String name, double health, double power){
        super(name, health, power, "Player");
        //kalo atribut udah ada isinya, ga perlu diisi parameter atribut itu ke dalam konstruktor
    }

    public void attack(Character opponent){
        super.attack(opponent);
    }

}
