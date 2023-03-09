/*
Sprites: At least one small sprite for each player class.(Mage, Rogue, and Warrior)
 */
public class player implements entity {

    int playHP = 100;
    int playMP = 40;

    itemGearDecorator[] playerInventory = new itemGearDecorator[13];/*For organization purposes,
                                                                   playerInventory[0] will remain empty.*/

    int[] playerPotions = new int[2];//First value is amount of healing potions and second is amount of mana potions.
    itemWeapon eqItemWeapon;
    itemArmor eqItemArmor;//For now, there will only be one equipable armor piece. Rather than a "Helmet","Gauntlet","Shield" etc...
    String playClass = "mage";//Must manually set for testing, until player selection is created.
    int playerSprite;//Just a placeholder for now.

    @Override
    public void changeHP(int change) {
        /*This method will both change the player's health, and determine
        how much damage is negated from armor. Subject to balancing.*/
        double bla = change/(0.2*eqItemArmor.armorPT);
        playHP = playHP + (int)(bla);
        if (playHP < 0){
            playHP = 0;
        }
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
            int[] errorArray = new int[1];
            errorArray[0] = 555;
            return errorArray;
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
    public int[] calSwordAtk(){
        int[] endDam = new int[1];
        endDam[0] = eqItemWeapon.calItemDamage();
        return endDam;
    }
    public int[] calDaggerAtk(){
        int[] endDam = new int[2];
        endDam[0] = eqItemWeapon.calItemDamage();
        endDam[1] = eqItemWeapon.calItemDamage();
        return endDam;
    }
    public int[] calMagicAtk(){//If player MP is not sufficient, attack damage will be reduced to 40%.
        int[] endDam = new int[1];
        if (playMP >= 10){
            endDam[0] = eqItemWeapon.calItemDamage();
            playMP = playMP - 10;
        } else  {
            endDam[0] = (int)((eqItemWeapon.calItemDamage())*0.4);
        }
        return endDam;
    }
    //--------------------X--------------------



}
