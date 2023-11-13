import java.util.ArrayList;

class Enemy extends Entity {
    Enemy(String name,int health,int stamina,int damage,float armor,float accuracy) {
        this.name = "лузерок";
        this.health = 100;
        this.accuracy = 100;
        this.armor = 75;
        this.damage = 100;
        ArrayList<Item> inventory1 = this.inventory;
        this.stamina = 75;
    }


}
