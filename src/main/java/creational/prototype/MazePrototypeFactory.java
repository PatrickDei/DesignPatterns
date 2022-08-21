package creational.prototype;

import creational.abstractfactory.MazeFactory;
import domain.Door;
import domain.Maze;
import domain.Room;
import domain.Wall;

public class MazePrototypeFactory extends MazeFactory {
    private Maze maze;
    private Wall wall;
    private Room room;
    private Door door;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this.maze = maze;
        this.wall = wall;
        this.room = room;
        this.door = door;
    }

    /*
    factory methods now return clones of given prototype
    e.g.
    @Override
    public Wall MakeWall() {
        return wall.Clone();
    }
     */
}
