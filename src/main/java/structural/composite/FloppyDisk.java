package structural.composite;

/**
 * leaf class
 */
public class FloppyDisk extends Equipment {

    public FloppyDisk(String name) {
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
