public class entityDecorator implements entity {
    int HP;
    int maxHP;
    int[] entDamRange = new int[2];
    int spriteNum;//Just a placeholder for now.
    boolean lootCollected = false;

    @Override
    public void changeHP(int change) {
        /*Basic method that changes entity HP based on the parameter.*/
        HP = HP + change;
        if(HP < 0){
            HP = 0;
        }


    }

    @Override
    public int[] calDamage() {
        /*This method is used to calculate how much damage the entity
        will deal. Can be overridden by the enemy and boss class*/
        int[] endDam = new int[1];
        endDam[0] = Main.ranCal(entDamRange[0],entDamRange[1]);
        return(endDam);
    }


}
