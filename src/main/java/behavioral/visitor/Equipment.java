package behavioral.visitor;

public abstract class Equipment {

    private String name;

    protected Equipment(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public Watt Power() {
        return null;
    }

    public Currency NetPrice() {
        return null;
    }


    //
    public void Accept(EquipmentVisitor equipmentVisitor) {

    }
}
