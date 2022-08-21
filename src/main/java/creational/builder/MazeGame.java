package creational.builder;

import domain.Maze;

public class MazeGame {

    public void CreateMaze() {
        // standard builder
        MazeBuilder mazeBuilder = new StandardMazeBuilder();

        mazeBuilder.BuildMaze();
        mazeBuilder.BuildRoom();
        mazeBuilder.BuildRoom();
        mazeBuilder.BuildRoom();
        mazeBuilder.BuildDoor();

        final Maze createdMaze = mazeBuilder.GetMaze();


        // counting builder
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();

        countingMazeBuilder.BuildMaze();
        countingMazeBuilder.BuildDoor();
        countingMazeBuilder.BuildDoor();
        countingMazeBuilder.BuildDoor();
        countingMazeBuilder.BuildRoom();

        final int numberOfDoors = countingMazeBuilder.GetDoorCount();
        final int numberOfRooms = countingMazeBuilder.GetRoomCount();
    }
}
