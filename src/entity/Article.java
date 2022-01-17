package entity;

import place.Place;

public class Article extends Entity {

    private boolean isAppeared;

    private Entity sponsor;

    public void setIsAppeared(boolean IsAppeared) {
        this.isAppeared = IsAppeared;
    }

    public boolean getIsAppeared() {
        return isAppeared;
    }


    public Article(String name, Place place) {
        super(name, place);
        appeared();
    }


    protected void appeared() {
        isAppeared = true;
        if (getPlace() != null)
            System.out.println(getName() + " появилась" + getPlace().getName());
        else
            System.out.println(getName() + " появилась");

    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!super.equals(anotherObject)) return false;
        Article another = (Article) anotherObject;
        return isAppeared == another.isAppeared;
    }

    public Entity getSponsor() {
        return sponsor;
    }

    public void setSponsor(Entity sponsor) {
        this.sponsor = sponsor;
    }
}
