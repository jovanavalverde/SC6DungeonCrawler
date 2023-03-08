/*
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Enemy {
    private ImageView enemyImage;
    private int xPos;
    private int yPos;
    private int speed;
    private boolean isAlive;

    public Enemy(ImageView enemyImage, int xPos, int yPos, int speed, boolean isAlive) {
        this.enemyImage = enemyImage;
        this.xPos = xPos;
        this.yPos = yPos;
        this.speed = speed;
        this.isAlive = isAlive;
    }

    public void move(Pane root, int xMax, int yMax) {
        // enemy moves randomly in a 2D dungeon crawl
        int randx = (int)(Math.random() * 3) - 1;
        int randy = (int)(Math.random() * 3) - 1;
        if (xPos + randx <= xMax && xPos + randx >= 0)
            this.xPos += randx;
        if (yPos + randy <= yMax && yPos + randy >= 0)
            this.yPos += randy;
        this.enemyImage.setX(this.xPos);
        this.enemyImage.setY(this.yPos);
        root.getChildren().add(this.enemyImage);
    }

    public void attack(Player p) {
        // enemy attacks the player if they are within a certain range
        int range = 10;
        if (Math.abs(this.xPos - p.getXPos()) <= range && Math.abs(this.yPos - p.getYPos()) <= range) {
            p.takeDamage(10);
            this.enemyImage.setFill(Color.RED);
            // TODO: play sound effect
        } else {
            this.enemyImage.setFill(Color.BLACK);
        }
    }

    public void takeDamage(int damage) {
        // enemy takes damage and dies if health reaches 0
        this.isAlive = false;
        this.enemyImage.setImage(new Image("dead_enemy.png"));
    }
}
/*/
//generate simple enemy behavior for a java 2d dungeon crawl using scenebuilder and javafx intellij//