package creational.abstractfactory;

import domain.Door;
import domain.DoorNeedingSpell;
import domain.EnchantedRoom;
import domain.Room;

public class EnchantedMazeFactory extends MazeFactory {

    public final Room MakeRoom() {
        return new EnchantedRoom();
    }

    public final Door MakeDoor() {
        return new DoorNeedingSpell();
    }

    protected void CastSpell() {}
}
