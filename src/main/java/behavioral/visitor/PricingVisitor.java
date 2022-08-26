package behavioral.visitor;

public class PricingVisitor extends EquipmentVisitor{

    private Currency total;
    // override how you wish to

    @Override
    public void VisitFloppyDisk(FloppyDrive floppyDrive) {
        total = floppyDrive.NetPrice(); // rather +=
    }

    @Override
    public void VisitChassis(Chassis chassis) {
        total = chassis.NetPrice(); // rather +=
    }
}
