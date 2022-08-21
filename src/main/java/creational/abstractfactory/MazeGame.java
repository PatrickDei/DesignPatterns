package creational.abstractfactory;

public class MazeGame {

    public void CreateMaze() {
        // for enchanted maze
        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();

        // for bombed maze
        MazeFactory bombedMazeFactory = new BombedMazeFactory();

        /*
        code to create rooms, walls, etc.
         */
    }
}
