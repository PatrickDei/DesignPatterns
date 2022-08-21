package creational.prototype;

import domain.*;

public class MazeGame {

    public void CreateMaze() {
        MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());

        // different maze type
        MazePrototypeFactory bombedMazeFactory =  new MazePrototypeFactory(new Maze(), new BombedWall(), new BombedRoom(), new Door());
    }
}
