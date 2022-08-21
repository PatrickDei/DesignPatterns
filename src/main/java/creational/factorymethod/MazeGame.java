package creational.factorymethod;

import domain.Door;
import domain.Maze;
import domain.Room;
import domain.Wall;

public class MazeGame {

    public Maze CreateMaze() {
        Maze maze = MakeMaze();

        Room firstRoom = MakeRoom();
        Room secondRoom = MakeRoom();

        Door theDoor = MakeDoor();

        /*
        code connecting the objects -> add rooms to the maze
         */

        return maze;
    }

    // factory methods
    Maze MakeMaze() {
        return new Maze();
    }

    Room MakeRoom() {
        return new Room();
    }

    Wall MakeWall() {
        return new Wall();
    }

    Door MakeDoor() {
        return new Door();
    }
}
