package proyectopruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registeruserinterface {
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the firstname").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we write the month").
            located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']/SELECT[1]/OPTION[7]"));
    public static final Target SELECT_DAY = Target.the("where do we write the day").
            located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']/SELECT[1]/OPTION[24]"));
    public static final Target SELECT_YEAR = Target.the("where do we write the year").
            located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']/SELECT[1]/OPTION[7]"));
    public static   final Target ENTER_BUTTON = Target.the("button to next").
            located(By.xpath("//A[@aria-label='Next step - define your location']"));

    public static final Target INPUT_CITY = Target.the("where do we write the city").
            located(By.id("city"));
    public static final Target INPUT_POSTALCODE = Target.the("where do we write the zip").
            located(By.id("zip"));
    public static final Target COUNTRY = Target.the("where do we write the country").
            located(By.xpath("(//INPUT[@type='search'])[2]"));
    public static   final Target ENTER_BUTTON2 = Target.the("button to next").
            located(By.xpath("///A[@aria-label='Next step - select your devices']"));

    public static final Target SELECT_COMPUTER= Target.the("where do we select the your computer").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='Windows']"));
    public static final Target SELECT_COMPUTERVERSION= Target.the("where do we select the your version computer").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='10']"));
    public static final Target SELECT_COMPUTERLENGUAGE= Target.the("where do we select the lenguaje the computer").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='Spanish']"));

    public static final Target SELECT_MOBILE= Target.the("where do we select the mobile").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='Apple']"));
    public static final Target SELECT_MODEL= Target.the("where do we select model the mobile").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='iPhone']"));
    public static final Target SELECT_OPERATING= Target.the("where do we select operating system the mobile").
            located(By.xpath("//SPAN[@ng-hide='$select.isEmpty()'][text()='iOS 14.8']']"));
    public static   final Target ENTER_BUTTON3 = Target.the("button to next").
            located(By.xpath("//A[@aria-label='Next - final step']"));

    public static   final Target PASSWORD = Target.the("where do we write the password").
            located(By.id("password"));
    public static   final Target CONFIRM_PASSWORD = Target.the("where do we write the password").
            located(By.id("password"));

    public static   final Target Check = Target.the("select check").
            located(By.xpath("(//SPAN[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static   final Target Check2 = Target.the("select check").
            located(By.xpath("(//SPAN[@class='checkmark signup-consent__checkbox error'])[2]"));

    public static   final Target ENTER_BUTTON4 = Target.the("button to create user").
            located(By.xpath("//A[@id='laddaBtn']"));


}
