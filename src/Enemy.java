/*
Sprites: Several small bad guy sprites (Goblins, ghouls, slimes, etc...)
 */
public class Enemy extends EntityDecorator{


    public Enemy (int health, int damMin, int damMax){
        this.HP = health;
        this.entDamRange[0] = damMin;
        this.entDamRange[1] = damMax;
    }


}
