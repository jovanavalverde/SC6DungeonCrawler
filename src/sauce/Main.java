import javafx.application.Application;
public class Main {


//This is the only player character object that will be used.
    static player character = new player();

    public static int ranCal(int min, int max){
        /*This method is just to easily find a random int between a min and max.*/
        int ranDam = (int)((Math.random() * ((max+1) - min)) + min);
        return ranDam;
    }







    public static void main(String[] args) {


//This launches the actual application in appDungGame
        Application.launch(appDungGame.class);













    }
}