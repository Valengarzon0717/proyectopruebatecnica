package proyectopruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyectopruebatecnica.userinterface.Registeruserinterface;



public class Register implements Task {
    private String starFirtsname;
    private String strLastname;
    private String strEmail;
    private String strCity;
    private String strPostalcode;
    private String strCountry;
    private String strPassword;
    private String strConfirmPassword;
    public Register(String starFirtsname, String strLastname, String strEmail, String strCity,
                    String strPostalcode, String strCountry, String strPassword, String strConfirmPassword) {
        this.starFirtsname=starFirtsname;
        this.strLastname=strLastname;
        this.strEmail=strEmail;
        this.strCity=strCity;
        this.strPostalcode=strPostalcode;
        this.strCountry=strCountry;
        this.strPassword=strPassword;
        this.strConfirmPassword=strConfirmPassword;
    }

    public static Register theform(String starFirtsname, String strLastname, String strEmail, String strCity,
                                   String strPostalcode, String strCountry, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Register.class,starFirtsname,strLastname,strEmail,strCity,strPostalcode,strCountry,
                strPassword,strConfirmPassword);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(starFirtsname).into(Registeruserinterface.INPUT_FIRSTNAME),
                Enter.theValue(strLastname).into(Registeruserinterface.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(Registeruserinterface.INPUT_EMAIL),
                Click.on(Registeruserinterface.SELECT_MONTH),
                Click.on(Registeruserinterface.SELECT_DAY),
                Click.on(Registeruserinterface.SELECT_YEAR),
                Click.on(Registeruserinterface.ENTER_BUTTON),

                Enter.theValue(strCity).into(Registeruserinterface.INPUT_CITY),
                Enter.theValue(strPostalcode).into(Registeruserinterface.INPUT_POSTALCODE),
                Enter.theValue(strCountry).into(Registeruserinterface.COUNTRY),
                Click.on(Registeruserinterface.ENTER_BUTTON2),

                Click.on(Registeruserinterface.SELECT_COMPUTER),
                Click.on(Registeruserinterface.SELECT_COMPUTERVERSION),
                Click.on(Registeruserinterface.SELECT_COMPUTERLENGUAGE),

                Click.on(Registeruserinterface.SELECT_MOBILE),
                Click.on(Registeruserinterface.SELECT_MODEL),
                Click.on(Registeruserinterface.SELECT_OPERATING),
                Click.on(Registeruserinterface.ENTER_BUTTON3),

                Enter.theValue(strPassword).into(Registeruserinterface.PASSWORD),
                Enter.theValue(strConfirmPassword).into(Registeruserinterface.CONFIRM_PASSWORD),

                Click.on(Registeruserinterface.Check),
                Click.on(Registeruserinterface.Check2),

                Click.on(Registeruserinterface.ENTER_BUTTON4)
        );
        
    }
}
