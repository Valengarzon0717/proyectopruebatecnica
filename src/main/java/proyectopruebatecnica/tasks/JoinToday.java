package proyectopruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import proyectopruebatecnica.userinterface.JoinTodayuserinterface;

public class JoinToday implements Task {
      public static JoinToday OnthePage() {
        return Tasks.instrumented(JoinToday.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayuserinterface.CLICK_BUTTON));

    }
}
