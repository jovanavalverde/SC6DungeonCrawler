public class Weapon implements Item{

    int[] damRange = new int[2];//Once assigned, damRange[0] must be minimum damage and damRange[1] must be maximum.
    String weaponType;

    public Weapon(int[] damRan, String type){
        this.damRange = damRan;
        this.weaponType = type;//Can only be assigned as "sword", "daggers", "staff".

    }


    public int calItemDamage(){//Ambiguous method to find individual strike damage by calling on the ranCalculator in Main.
        int calDam = Main.ranCal(damRange[0],damRange[1]);
        return calDam;
    }
}
