/*
Sprites: At least one small sprite for each player class.(Mage, Rogue, and Warrior)
 */
public class player implements entity {

    int playHP = 100;
    int playMaxHP = 100;
    int playMP = 100;
    int playMaxMP = 100;

    itemGearDecorator[] playerInventory = new itemGearDecorator[13];/*For organization purposes,
                                                                   playerInventory[0] will remain empty.*/

    int[] playerPotions = {0,0};//First value is amount of healing potions and second is amount of mana potions.

    itemWeapon eqItemWeapon;
    itemArmor eqItemArmor;//For now, there will only be one equipable armor piece. Rather than a "Helmet","Gauntlet","Shield" etc...
    String playClass = "default";

    @Override
    public void changeHP(int change) {
        /*This method will both change the player's health, and determine
        how much damage is negated from armor. Subject to balancing.*/
        double bla = change/(eqItemArmor.armorPT*0.1);
        playHP = playHP + (int)(bla);
        if (playHP < 0){
            playHP = 0;
        }
    }

    public void useHealthPotion(){
        playHP = playHP + 100;
        if (playHP > playMaxHP) {
            playHP = playMaxHP;
        }
        System.out.println("Drunk 100 HP potion");
        this.playerPotions[0]--;
    }

    public void useManaPotion(){
        playMP = playMP + 100;
        if (playMP > playMaxMP){
            playMP = playMaxMP;
        }
        this.playerPotions[1]--;
    }

    @Override
    public int[] calDamage() {
        /*This method is used to calculate how much damage the player will deal.
        Returns an array rather than a single int due to daggers being two attacks rather than one*/
        if (eqItemWeapon.weaponType == "sword"){
            return calSwordAtk();
        } else if (eqItemWeapon.weaponType == "daggers") {
            return calDaggerAtk();
        } else if (eqItemWeapon.weaponType == "staff") {
            return calMagicAtk();
        }else {
            return new int[]{555};
        }

    }
    //---------------------Equip Items Methods--------------------
    /*These methods will just take an armor or weapon object and assign it to the players equipped gear variable*/
    public void equipArmor(itemArmor N){
        eqItemArmor = N;
    }
    public void equipWeapon(itemWeapon N){
        eqItemWeapon = N;
    }
    //--------------------Determine attack strength Methods--------------------
    /*These methods are used in calDamage() for specific weapon type damage calculation.*/
    private int[] calSwordAtk(){
        int[] endDam = new int[1];
        endDam[0] = eqItemWeapon.calItemDamage();
        return endDam;
    }
    private int[] calDaggerAtk(){
        int[] endDam = new int[2];
        endDam[0] = eqItemWeapon.calItemDamage();
        endDam[1] = eqItemWeapon.calItemDamage();
        return endDam;
    }
    private int[] calMagicAtk(){//If player MP is not sufficient, attack damage will be reduced to 40%.
        int[] endDam = new int[1];
        if (playMP >= 10){
            endDam[0] = eqItemWeapon.calItemDamage();
            playMP = playMP - 10;
        } else  {
            endDam[0] = (int)((eqItemWeapon.calItemDamage())*0.4);
        }
        return endDam;
    }
    //--------------------Special attacks--------------------


    private int[] fireball(){
        int[] endDam = new int[1];
        if (playMP >= 50){
            endDam[0] = eqItemWeapon.calItemDamage()*2;
            playMP = playMP - 50;
        } else {
            endDam = calMagicAtk();
        }
        return endDam;
    }


    private int[] heavyswing(){
        int[] endDam = new int[1];
        if (playMP >= 50){
            endDam[0] = eqItemWeapon.calItemDamage()*2;
            playMP = playMP - 50;
        } else {
            endDam = calMagicAtk();
        }
        return endDam;
    }

    private int[] fastflurry(){
        int[] endDam = new int[1];
        if (playMP >= 50){
            endDam[0] = eqItemWeapon.calItemDamage()*2;
            playMP = playMP - 50;
        } else {
            endDam = calMagicAtk();
        }
        return endDam;
    }
}
