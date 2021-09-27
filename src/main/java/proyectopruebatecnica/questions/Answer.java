package proyectopruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    private String  Question;
    public Answer (String question) {
        this.Question=question;

    }

    public static Answer tothe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
