package proyectopruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyectopruebatecnica.userinterface.Registeruserinterface;

public class Register implements Task {
    public static Register theform() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Valentina").into(Registeruserinterface.INPUT_FIRSTNAME),
                Enter.theValue("Garzon Arismendi").into(Registeruserinterface.INPUT_LASTNAME),
                Enter.theValue("valentinagarzon1717@gmail.com").into(Registeruserinterface.INPUT_EMAIL),
                Click.on(Registeruserinterface.SELECT_MONTH),
                Click.on(Registeruserinterface.SELECT_DAY),
                Click.on(Registeruserinterface.SELECT_YEAR),
                Click.on(Registeruserinterface.ENTER_BUTTON),

                Enter.theValue("Pereira").into(Registeruserinterface.INPUT_CITY),
                Enter.theValue("606").into(Registeruserinterface.INPUT_POSTALCODE),
                Enter.theValue("Colombia").into(Registeruserinterface.COUNTRY),
                Click.on(Registeruserinterface.ENTER_BUTTON2),

                Click.on(Registeruserinterface.SELECT_COMPUTER),
                Click.on(Registeruserinterface.SELECT_COMPUTERVERSION),
                Click.on(Registeruserinterface.SELECT_COMPUTERLENGUAGE),

                Click.on(Registeruserinterface.SELECT_MOBILE),
                Click.on(Registeruserinterface.SELECT_MODEL),
                Click.on(Registeruserinterface.SELECT_OPERATING),
                Click.on(Registeruserinterface.ENTER_BUTTON3),

                Enter.theValue("VALENTINA1234").into(Registeruserinterface.PASSWORD),
                Enter.theValue("VALENTINA1234").into(Registeruserinterface.CONFIRM_PASSWORD),

                Click.on(Registeruserinterface.Check),
                Click.on(Registeruserinterface.Check2),

                Click.on(Registeruserinterface.ENTER_BUTTON4)
        );
        
    }
}
