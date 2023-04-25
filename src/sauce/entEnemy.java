import javafx.scene.image.Image;

/*
Sprites: Several small bad guy sprites (Goblins, ghouls, slimes, etc...)
 */
public class entEnemy extends entityDecorator {

Image entSprite;
item[] loot = new item[4];
int potions;

    public void setStats(int health, int damMin, int damMax, Image entSprite, item[] loot,int potionNum){
        this.maxHP = health;
        this.entDamRange[0] = damMin;
        this.entDamRange[1] = damMax;
        this.entSprite = entSprite;
        this.loot = loot;
        this.HP = this.maxHP;
        this.potions = potionNum;
    }

    public void addLoot(){
        /*This method will scan the loot array and scan the player inventory then add
        the loot to the open slots of the players inventory. Skipping all null slots.*/
        if(!lootCollected) {
            Main.character.playerPotions[0]+=potions;
            Main.character.playerPotions[1]+=potions;
            for (int n = 0; n < loot.length; n++) {

                if (loot[n] != null) {

                    for (int b = 1; b <= 30; b++) {
                        if (Main.character.playerInventory[b] == null) {
                            Main.character.playerInventory[b] = (itemGearDecorator) loot[n];
                            b = 30;
                        }
                    }
                }
            }
            lootCollected = true;
        }
    }



}
/*
JON @ 02.16.23  ---- Monster class ----
------------------------------------------------------------------------------------------------------------------
In this code, we define a Monster class with properties for name, health, attack power, and defense power.
The Monster class has methods for taking damage, checking if the monster is dead, attacking, and defending.

public class Monster {
    private String name;
    private int health;
    private int attackPower;
    private int defensePower;

    public Monster(String name, int health, int attackPower, int defensePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isDead() {
        return health <= 0;
    }

    public int attack() {
        return attackPower;
    }

    public int defend() {
        return defensePower;
    }
}

The takeDamage method reduces the health of the monster object when it takes damage.
If the health falls below zero, it is set to zero to prevent negative health values.
The isDead method checks if the monster object's health is zero or less, indicating that the monster is dead.
The attack method returns the attack power of the monster object, which can be used to calculate damage when the monster attacks the player.
The defend method returns the defense power of the monster object, which can be used to calculate the amount of damage
the monster takes when it is attacked by the player.
Overall, this code allows you to define and manipulate a Monster object in a Java program, including taking damage,
attacking, and defending.
You can use this class as a starting point for creating more complex game mechanics in a Java 2D dungeon crawl game.


 */
