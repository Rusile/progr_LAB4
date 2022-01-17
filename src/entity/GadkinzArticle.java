package entity;


import exceptions.NotGadkinzException;
import place.Place;

import java.util.Random;

//Ряд статей

public class GadkinzArticle extends Article {

    private GadkinzArticle(String name, Place place) {
        super(name, place);
    }

    public static GadkinzArticle newGadkinzArticle(Object obj) {
        if (obj.getClass() == Gadkinz.class)
            return new GadkinzArticle("Статейка <<ПАНИКА НА ДАВИЛОНСКОЙ БАРЖЕ>> ", Place.GADKINZ_NEWSPAPER);
        else
            throw new NotGadkinzException("Данную статью может опубликовать только господин Гадкинз.");

    }


    @Override
    protected void appeared() {
        // local class
        class Day {

            String time;

            Day(String time) {
                this.time = time;
            }
        }
        Day thisDay = new Day("В тот же день ");
        //fixSituation();
        setIsAppeared(true);
        System.out.println(thisDay.time + getName() + "появилась" + getPlace().getName());
    }

    /*
    private void fixSituation() {
        int chance = new Random().nextInt(2);
        if (getIsAppeared() && chance == 1) {
            StocksOfBirge.setPrice(StocksOfBirge.Price.HIGH);
        }
    }
     */
}
