import entity.*;
import exceptions.NotReceivedMoneyException;
import interfaces.ReasonForPanicInterface;
import place.Place;

public class Main {

    public static void main(String[] args) {

        Lords lords = new Lords("Владельцы гигантских акций");
        StocksOfBirge stocksOfBirge = new StocksOfBirge("Акции", Place.BARGE);
        None none = new None("Никто ");
        RichCrew bogachi = new RichCrew("Трое богачей ");
        Gadkinz gadkinz = new Gadkinz("господин Гадкинз ");
        Spruts spruts = new Spruts("Спрутс");

        Article article = new Article("Статейка", Place.NEWSPAPER);
        article.setSponsor(spruts);
        stocksOfBirge.checkCurrentPrice();
        lords.sellOrSave(article);
        stocksOfBirge.checkCurrentPrice();
        none.dontWantorWant();
        lords.printMood();
        bogachi.pay(gadkinz);

        try {
            GadkinzArticle gadkinzArticle = gadkinz.makeArticle();
            lords.sellOrSave(gadkinzArticle);
            stocksOfBirge.checkCurrentPrice();

        } catch (NotReceivedMoneyException exception) {
            System.out.println("\u001B[31m" + exception.getMessage() + "\u001B[0m");
        }

        //реализация функционального интерфейса через лямбда-выражение
        ReasonForPanicInterface reason = (art) -> {
            if (art.getIsAppeared())
                System.out.println("Причина паники: " + art.getName());
            else
                System.out.println("Причина паники не ясна...");
        };
        reason.getReasonOfPanic(article);

        /*
        аналогичная реализация через анонимный класс
        new ReasonForPanicInterface(){
            @Override
            public void getReasonOfPanic(Article art){
                if (art.getIsAppeared())
                    System.out.println("Причина паники: " + art.getName());
                else
                    System.out.println("Причина паники не ясна...");
            }
        }.getReasonOfPanic(article);
        */

        lords.checkAwareness(article);
        spruts.action(" гигантским акциям");

        String advice = "Хочется сказать всем доверчивым чудакам: не поддавайтесь панике. Уж кто-кто, а господин Спрутс своей выгоды не упустит.";
        WithAdvice authorsAdvice = System.out::println;
        authorsAdvice.showAdvice(advice);

    }

    @FunctionalInterface
    interface WithAdvice {
        void showAdvice(String a);
    }
}



