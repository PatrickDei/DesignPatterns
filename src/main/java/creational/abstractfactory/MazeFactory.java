package creational.abstractfactory;

import domain.Door;
import domain.Maze;
import domain.Room;
import domain.Wall;

public class MazeFactory {

    public Maze MakeMaze() {
        return new Maze();
    }

    public Wall MakeWall() {
        return new Wall();
    }

    public Room MakeRoom() {
        return new Room();
    }

    public Door MakeDoor() {
        return new Door();
    }
}
