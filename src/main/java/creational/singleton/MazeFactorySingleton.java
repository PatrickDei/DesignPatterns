package creational.singleton;

/**
 * If the class is ever extended, consider using the registry approach.
 * Dynamic linking could be useful here as well - it would keep the application from having to load all the subclasses that are ot used.
 */
public class MazeFactorySingleton {

    private static MazeFactorySingleton instance = null;

    protected MazeFactorySingleton() {}

    static MazeFactorySingleton Instance() {
        if (instance == null) {
            instance = new MazeFactorySingleton();
        }

        return instance;
    }
}
