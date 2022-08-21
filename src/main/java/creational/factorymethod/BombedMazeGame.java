package creational.factorymethod;

import domain.BombedRoom;
import domain.BombedWall;
import domain.Room;
import domain.Wall;

public class BombedMazeGame extends MazeGame {

    Room MakeRoom() {
        return new BombedRoom();
    }

    Wall MakeWall() {
        return new BombedWall();
    }
}
