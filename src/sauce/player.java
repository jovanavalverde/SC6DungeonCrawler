/*
Sprites: At least one small sprite for each player class.(Mage, Rogue, and Warrior)
 */
public class player implements entity {

    int playHP;
    int playMP = 100;
    int armorPT;
    itemGearDecorator[] playerInventory = new itemGearDecorator[13];
    int[] playerPotions = new int[2];//First value is amount of healing potions and second is amount of mana potions.
    itemWeapon eqItemWeapon;
    itemArmor eqItemArmor;//For now, there will only be one equipable armor piece. Rather than a "Helmet","Gauntlet","Shield" etc...
    String playClass = "mage";//Other Player classes are yet to be created. So this is just a placeholder.
    int playerSprite;//Just a placeholder for now as we do not yet know assigning sprites to entities will work.

    @Override
    public void changeHP(int change) {

        double bla = change/(0.2*armorPT);
        playHP = playHP + (int)(bla);
    }

    @Override
    public int[] calDamage() {

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
    public void equipArmor(itemArmor N){
        eqItemArmor = N;
    }
    public void equipWeapon(itemWeapon N){
        eqItemWeapon = N;
    }
    //--------------------Determine attack strength Methods--------------------
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
