package objects;

import com.mysql.cj.exceptions.AssertionFailedException;
import general.MainCall;
import general.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static config.ConfigProperties.testimUrl;

public class HomePage {
    public HomePage (){}

    public static By learnMore = By.xpath("//div[3]/a[@class='cvp-block-cta button button-sm button-outlined-reversed']");

    public static void arriveToHomePage()
    {
        try {
            MainCall.webDriverFactory.getInstance();
        } catch (Exception exception) {
            throw new AssertionFailedException(exception.getMessage());
        }
    }
    public static void learnMoreBtn(){
        MainCall.seleniumFunctions.scrollToElement(learnMore);
        MainCall.seleniumFunctions.ClickingOn(learnMore);
    }

    public static void verifyTestimUrl() {
        String url = WebDriverFactory.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains(testimUrl));
        WebDriverFactory.getDriver().close();
    }
}
