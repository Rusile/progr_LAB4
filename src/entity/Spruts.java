package entity;

import place.Place;

public class Spruts extends Entity {

    Hands hands = new Hands();

    public Spruts(String name) {
        super(name);
    }

    public Spruts(String name, Place place) {
        super(name, place);
    }

    public void action(String where) {

        System.out.println(hands.stretch(where));
    }

    // inner non-static class
    private class Hands {

         final String owner = getName();
         final String hands = " Руки";

        String stretch(String where) {
            return (owner + ":" + hands + " тянутся к" + where);
        }
    }
}
