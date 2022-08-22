package structural.composite;

public class Chassis extends CompositeEquipment {

    protected Chassis(String name) {
        super(name);
    }

    @Override
    public Watt Power() {
        return super.Power();
    }

    @Override
    public Currency NetPrice() {
        return super.NetPrice();
    }

    @Override
    public Currency DiscountPrice() {
        return super.DiscountPrice();
    }
}
