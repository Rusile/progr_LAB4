package interfaces;

import entity.Article;

@FunctionalInterface
public interface ReasonForPanicInterface {
    void getReasonOfPanic(Article art);
}
