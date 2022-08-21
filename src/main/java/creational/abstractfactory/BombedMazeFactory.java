package creational.abstractfactory;

import domain.BombedRoom;
import domain.BombedWall;
import domain.Room;
import domain.Wall;

public class BombedMazeFactory extends MazeFactory {

    public Wall MakeWall() {
        return new BombedWall();
    }

    public Room MakeRoom() {
        return new BombedRoom();
    }
}
