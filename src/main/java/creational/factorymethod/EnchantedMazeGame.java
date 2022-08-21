package creational.factorymethod;

import domain.Door;
import domain.DoorNeedingSpell;
import domain.EnchantedRoom;
import domain.Room;

public class EnchantedMazeGame extends MazeGame {

    Room MakeRoom() {
        return new EnchantedRoom();
    }

    Door MakeDoor() {
        return new DoorNeedingSpell();
    }

    protected void CastSpell() {}
}
