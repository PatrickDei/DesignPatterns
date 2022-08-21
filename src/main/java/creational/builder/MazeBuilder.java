package creational.builder;

import domain.Maze;

public abstract class MazeBuilder {

    public void BuildMaze() {}
    public void BuildRoom() {}
    public void BuildDoor() {}

    public Maze GetMaze() {
        return null;
    }
}
