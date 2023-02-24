import javafx.application.Application;
public class Main {

    static player character = new player();

    public static int ranCal(int min, int max){  //This is just to easily find a random int between a min and max
        int ranDam = (int)((Math.random() * ((max+1) - min)) + min);//number without having to type it all out.
        return ranDam;
    }














    public static void main(String[] args) {

        Application.launch(appDungGame.class);























    }
}