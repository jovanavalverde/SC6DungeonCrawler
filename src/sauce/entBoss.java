import javafx.scene.image.Image;

/*
Sprites: At least one Smallish sprite that looks like a dungeon boss. (It doesn't
actually matter what it looks like just make sure it's slightly bigger than regular enemies.)
 */
public class entBoss extends entityDecorator {

    Image entSprite;
    public entBoss(int health, int damMin, int damMax, Image entSprite){
        this.HP = health;
        this.entDamRange[0] = damMin;
        this.entDamRange[1] = damMax;
        this.entSprite = entSprite;
    }

    @Override
    public int[] calDamage() {
        int[] endDam = new int[1];
        endDam[0] = Main.ranCal(entDamRange[0],entDamRange[1]);
        return(endDam);
    }}
