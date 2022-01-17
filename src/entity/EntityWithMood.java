package entity;

import place.Place;

import java.util.Objects;

public abstract class EntityWithMood extends Entity {
    private String mood;

    public EntityWithMood(String name) {
        super(name);
    }

    public EntityWithMood(String name, Place place) {
        super(name, place);
    }

     public void setMood(String mood){
         this.mood = mood;
     }

     public String getMood(){
        return mood;
     }

    public void printMood(){
        System.out.println(getMood());
    }

    @Override
    public boolean equals(Object anotherObject){
        if (!super.equals(anotherObject)) return false;
        EntityWithMood another = (EntityWithMood) anotherObject;
        return mood.equals(another.mood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName() + getPlace() + mood);
    }

}
