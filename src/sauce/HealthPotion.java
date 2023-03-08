public class HealthPotion {

    private int healthRestoreAmount;

    private Sprite sprite;



    public HealthPotion(int healthRestoreAmount, Sprite sprite) {

        this.healthRestoreAmount = healthRestoreAmount;

        this.sprite = sprite;

    }



    public int getHealthRestoreAmount() {

        return healthRestoreAmount;

    }



    public Sprite getSprite() {

        return sprite;

    }



    public void setSprite(Sprite sprite) {

        this.sprite = sprite;

    }

}

