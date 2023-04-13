public class room {

public entityDecorator opponent;
public int roomNum;
public String roomType = "Default";//May be deleted.
public int[] location = new int[2];
public int[] coordinates = new int [2];
public room (entityDecorator opponent, int roomNum, int x, int y, int cX, int cY){
    this.roomNum = roomNum;
    this.opponent = opponent;
    this.location[0] = x;
    this.location[1] = y;
    this.coordinates[0] = cX-15;
    this.coordinates[1] = cY-15;
}
public room(int roomNum, int x,int y, int cX, int cY){
    this.roomNum = roomNum;
    this.location[0] = x;
    this.location[1] = y;
    this.coordinates[0] = cX-15;
    this.coordinates[1] = cY-15;
}

}
