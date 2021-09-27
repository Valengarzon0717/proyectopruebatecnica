package proyectopruebatecnica.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayuserinterface {
    public static final Target CLICK_BUTTON = Target.the("button showing the registration form").
            located(By.xpath("//A[@class='unauthenticated-nav-bar__sign-up'][text()='Join Today']"));

}
