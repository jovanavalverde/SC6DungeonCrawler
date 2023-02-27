import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

/*
Sprites: Multiple small sprites for full armor sets.(Not individual armor pieces.) And no shields.
Need to look like wizard robes, light armor, and heavy armor.
*/
public class itemArmor extends itemGearDecorator {


    int armorPT;
    String armorType;//Can only equal "robe", "light", "heavy".


/*Due to loading errors, the constructor as been turned into a method to be later called after the instances are made.*/
    public void setStats(int armorPT, String type, Image sprite) {
        /*This method takes several parameters that assigns the armor points, armor type, and sprite to the instance*/
        this.armorPT = armorPT;
        this.armorType = type;
        this.itemSprite = sprite;
    }
}

/*JON @ 02.16.23  ---- Armor class ----
------------------------------------------------------------------------------------------------------------------



    In this code, we define an Armor class with properties for name, type, defense rating, max durability,
    current durability, and image.

    The Armor class has methods for reducing durability, checking if the armor is broken, and upgrading the armor.

public class Armor {
    private String name;
    private int type;
    private int defenseRating;
    private int maxDurability;
    private int currentDurability;
    private BufferedImage image;

    public Armor(String name, int type, int defenseRating, int maxDurability, BufferedImage image) {
        this.name = name;
        this.type = type;
        this.defenseRating = defenseRating;
        this.maxDurability = maxDurability;
        this.currentDurability = maxDurability;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public int getCurrentDurability() {
        return currentDurability;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void reduceDurability(int damage) {
        currentDurability -= damage;
        if (currentDurability < 0) {
            currentDurability = 0;
        }
    }

    public boolean isBroken() {
        return currentDurability <= 0;
    }

    public void upgrade(int newDefenseRating, int newMaxDurability) {
        defenseRating = newDefenseRating;
        maxDurability = newMaxDurability;
        currentDurability = maxDurability;
    }
}


The reduceDurability method in the Armor class reduces the current durability of the armor object when the player takes damage.
If the current durability falls below zero, it is set to zero to prevent negative durability.
The isBroken method checks if the armor object's current durability is zero or less, indicating that the armor is broken and needs to be removed.
The upgrade method in the Armor class allows you to upgrade the armor by setting new defense rating and max
durability values, and resetting the current durability to the max durability.
You might call this method when the player acquires an upgrade item, defeats a boss, or completes a quest.


------------------------------------FURTHERMORE-------------------------------------------------------

We will need to define the player class to include methods to incorporate this armor class and that means this armor
class is going to be a feature that should be added later...after we get the minimum viable product.
Check it out

public class Player {
    private int baseDefense;
    private int currentDefense;
    private Armor equippedArmor;

    public Player(int baseDefense) {
        this.baseDefense = baseDefense;
        this.currentDefense = baseDefense;
    }

    public void equipArmor(Armor armor) {
        equippedArmor = armor;
        currentDefense = baseDefense + armor.getDefenseRating();
    }

    public void unequipArmor() {
        equippedArmor = null;
        currentDefense = baseDefense;
    }

    public boolean isArmorEquipped() {
        return equippedArmor != null;
    }

    public void takeDamage(int damage) {
        if (isArmorEquipped()) {
            equippedArmor.reduceDurability(damage);
            if (equippedArmor.isBroken()) {
                unequipArmor();
            }
        }
        // Apply damage to player
        // ...
    }
}

We also define a Player class with properties for base defense, current defense, and equipped armor.
The Player class has methods for equipping armor, unequipping armor, checking if armor is equipped, and taking damage.
And
The equipArmor and unequipArmor methods in the Player class handle equipping and unequipping the armor object to the player.
When the armor is equipped, the currentDefense property of the player is updated to include the defense rating of the armor.
When the armor is unequipped, the currentDefense property is set back to the baseDefense property.
The takeDamage method in the Player class reduces the durability of the equipped armor object and unequips it if it is broken.
If the player is not wearing armor, the damage is applied directly to the player.
This method is called whenever the player takes damage in the game.




*/




