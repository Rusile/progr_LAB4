package entity;

public class None extends Entity {


    public None(String name) {
        super(name);
    }

    //никто

    public void dontWantorWant() {
        if (StocksOfBirge.getPrice() == StocksOfBirge.Price.LOW)
            System.out.println(getName() + " не хотел покупать акции");
        if (StocksOfBirge.getPrice() == StocksOfBirge.Price.NORMAL)
            System.out.println(getName() + " не остался в минусе");

    }
}
