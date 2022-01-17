package entity;

//Владельцы гигантских акций

public class Lords extends EntityWithMood {


    private boolean awareness = false;

    public boolean getAwareness() {
        return awareness;
    }

    public void setAwareness(boolean awareness) {
        this.awareness = awareness;
    }

    public Lords(String name) {
        super(name);
    }


    public void sellOrSave(Article article) {
        if (article.getIsAppeared()) {
            System.out.println(getName() + " бросились продавать акции ");
            StocksOfBirge.setPrice(StocksOfBirge.Price.LOW);

        } else {
            System.out.println(getName() + " сохранили свои акции");
            StocksOfBirge.setPrice(StocksOfBirge.Price.NORMAL);
        }
    }

    public void checkAwareness(Article article) {
        if (getAwareness())
            System.out.println(getName() + " понимали, что" + article.getName() + " спонсируется" + article.getSponsor().getName());
        else
            System.out.println(getName() + " не знали, что" + " спонсор " + article.getName() + " - " + article.getSponsor().getName());
    }

        @Override
        public void printMood(){
            if (StocksOfBirge.getPrice() == StocksOfBirge.Price.LOW) {
                setMood(" были в отчаянии");
                System.out.println(getName() + getMood());
            }
            if (StocksOfBirge.getPrice() == StocksOfBirge.Price.HIGH) {
                setMood(" чувствовали себя прекрасно");
                System.out.println(getName() + getMood());
            }
            if (StocksOfBirge.getPrice() == StocksOfBirge.Price.NORMAL) {
                setMood(" были спокойны");
                System.out.println(getName() + getMood());
            }
        }


    }
