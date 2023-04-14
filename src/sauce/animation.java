import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class animation {


 /*   public static void attackAnimation(Rectangle attAni){
        double startX = 400;
        for(int i = 0; i < 40; i++){
            double oldX = attAni.getTranslateX();
            double newX = oldX + 10; // increase the x position by 10 pixels
            attAni.setTranslateX(newX);
        }

        attAni.setTranslateX(startX);
    }

*/

    public static void magicAttackAnimation(Rectangle attAni) {
        double startX = 0;
        double endX = startX + 400; // move the rectangle 400 pixels to the right
        attAni.setOpacity(1);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(attAni.translateXProperty(), startX)),
                new KeyFrame(Duration.seconds(1), new KeyValue(attAni.translateXProperty(), endX)),
                new KeyFrame(Duration.seconds(2), new KeyValue(attAni.opacityProperty(), 0))
        );

        timeline.play();
    }

    public static void swordAttackAnimation(Rectangle attAni) {
        double startX = 0;
        double startY = 0;
        double endX = 200;
        double endY = 200;

        attAni.setTranslateX(startX);
        attAni.setTranslateY(startY);

        attAni.setOpacity(1);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(attAni.translateXProperty(), startX)),
                new KeyFrame(Duration.seconds(0), new KeyValue(attAni.translateYProperty(), startY)),
                new KeyFrame(Duration.seconds(.5), new KeyValue(attAni.translateXProperty(), endX)),
                new KeyFrame(Duration.seconds(.5), new KeyValue(attAni.translateYProperty(), endY)),
                new KeyFrame(Duration.seconds(1), new KeyValue(attAni.opacityProperty(), 0))
        );
        timeline.setOnFinished(event -> {
            attAni.setTranslateX(startX);
            attAni.setTranslateY(startY);
        });

        timeline.play();
    }


}
