package structural.composite;

import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment {

    private List<Equipment> equipment;

    protected CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public Watt Power() {
        return super.Power();
    }

    @Override
    public Currency NetPrice() {
        Iterator<Equipment> equipmentIterator = CreateIterator();
        float total = 0;

        while (equipmentIterator.hasNext()) {
            total++; // actually add NetPrice() of each equipment
            equipmentIterator.next().NetPrice();
        }

        return new Currency(); // total
    }

    @Override
    public Currency DiscountPrice() {
        return super.DiscountPrice();
    }

    @Override
    public void Add(Equipment equipment) {
        super.Add(equipment);
    }

    @Override
    public void Remove(Equipment equipment) {
        super.Remove(equipment);
    }

    @Override
    public Iterator<Equipment> CreateIterator() {
        return super.CreateIterator();
    }
}
