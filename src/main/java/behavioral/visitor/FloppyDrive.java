package behavioral.visitor;

public class FloppyDrive extends Equipment{
    protected FloppyDrive(String name) {
        super(name);
    }

    // override what you need + accept

    @Override
    public void Accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.VisitFloppyDisk(this);
    }
}
