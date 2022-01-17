package entity;

import interfaces.WithStatus;
import exceptions.NotReceivedMoneyException;

//господин Гадкинз

public class Gadkinz extends EntityWithMoney implements WithStatus {


    public Gadkinz(String name) {
        super(name);
    }


    @Override
    public String showStatus() {
        return ", владелец нескольких давилонских газет, ";
    }

    public GadkinzArticle makeArticle() throws NotReceivedMoneyException{
        if (getIsReceivedMoney())
            return GadkinzArticle.newGadkinzArticle(this);
        else
            throw new NotReceivedMoneyException(getName() + "не собирается писать статью, потому что ему не заплатили.");
    }


}
