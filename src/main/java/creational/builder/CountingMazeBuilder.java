package creational.builder;

public class CountingMazeBuilder extends MazeBuilder {

    private int doorCount = 0;
    private int roomCount = 0;

    public void BuildMaze() {
    }

    public void BuildRoom() {
        roomCount++;
    }

    public void BuildDoor() {
        doorCount++;
    }

    public void AddWall() {}

    int GetRoomCount() {
        return roomCount;
    }
    int GetDoorCount() {
        return doorCount;
    }
}
