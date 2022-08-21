package creational.builder;

import domain.Maze;

/**
 * These operations can be put in the Maze class and let the maze class build itself.
 * Making Maze smaller makes it easier to understand and modify, and the tow are easy to separate.
 * Most importantly, separating the two lets you have a variety of MazeBuilders, each using different classes for rooms, walls and doors.
 */
public class StandardMazeBuilder extends MazeBuilder {

    private Maze maze;

    public void BuildMaze() {
        maze = new Maze();
    }

    public void BuildRoom() {}

    public void BuildDoor() {}

    public Maze GetMaze() {
        return maze;
    }
}
