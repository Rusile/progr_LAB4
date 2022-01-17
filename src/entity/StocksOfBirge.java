package entity;

import place.Place;

//  акции
public class StocksOfBirge extends Entity {

    private static Price price;

    static {
        price = Price.NORMAL;
    }


    public StocksOfBirge(String name, Place place) {
        super(name, place);
    }

    public void checkCurrentPrice() {
        System.out.println(getName() + ":" + price.getCost() + getPlace().getName());
    }

    public static Price getPrice() {
        return price;
    }

    public static void setPrice(Price price) {
        StocksOfBirge.price = price;
    }

    // inner static class
    public enum Price {

        LOW(" цена начала снижаться"),
        NORMAL(" цена осталась неизменной"),
        HIGH(" цена резко поднялась");

        private String cost;

        Price(String cost) {
            this.cost = cost;
        }


        public void setCost(String cost) {
            this.cost = cost;
        }


        public String getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return getClass().getName() + "[price:" + cost + "]";
        }

    }
}
