//titik eksekusi

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("rahmi", 100, 10);

        Enemy enemy1 = new Enemy("hanshi", 100, 10);
        
        Boss boss1 = new Boss("Cat", 100, 10);

        player1.display();
        boss1.display();
        enemy1.display();

        enemy1.attack(boss1);
        boss1.display();
        boss1.heal(10);

        player1.display();
        enemy1.display();
        
        enemy1.attack(player1);

        player1.display();
    }
}
