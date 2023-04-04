package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GenericQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}