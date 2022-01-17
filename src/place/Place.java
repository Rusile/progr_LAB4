package place;


public enum Place {

    BARGE(" на давилонской барже"),
    GADKINZ_NEWSPAPER(" в <<Давилонских побасенках>>"),
    NEWSPAPER(" в газете <<Давилонские юморески>>"),
    TOWN(" в городе Паноптикум");

    private final String name;

    Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[place:" + name + "]";
    }

}
