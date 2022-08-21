package creational.abstractfactory;

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

    class Maze {}
    class Wall {}
    class Room {}
    class Door {}
}
