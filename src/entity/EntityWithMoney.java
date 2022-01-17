package entity;

public abstract class EntityWithMoney extends Entity {
    private boolean isPaidMoney;
    private boolean isReceivedMoney;

    public boolean getIsReceivedMoney() {
        return isReceivedMoney;
    }

    public void setIsReceivedMoney(boolean isReceivedMoney) {
        this.isReceivedMoney = isReceivedMoney;
    }

    public boolean getIsPaidMoney() {
        return isPaidMoney;
    }

    public void setIsPaidMoney(boolean isPaidMoney) {
        this.isPaidMoney = isPaidMoney;
    }

    public EntityWithMoney(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!super.equals(anotherObject)) return false;
        EntityWithMoney another = (EntityWithMoney) anotherObject;
        return isPaidMoney == another.isPaidMoney && isReceivedMoney == another.isReceivedMoney;
    }

}
