package creational.abstractfactory;

import domain.Door;
import domain.Room;

public class EnchantedMazeFactory extends MazeFactory {

    public final Room MakeRoom() {
        return new EnchantedRoom();
    }

    public final Door MakeDoor() {
        return new DoorNeedingSpell();
    }

    protected void CastSpell() {}

    class EnchantedRoom extends Room {}
    class DoorNeedingSpell extends Door {}
}
