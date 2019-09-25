package page_object;

import business_object.user.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setup.Element;

public class HomePage extends Page {

    private static final By LOGIN_INPUT_LOCATOR = By.xpath("//input[@id='mailbox:login']");
    private static final By ENTER_PASSWORD_BUTTON = By.xpath("//input[@type = 'submit']");
    private static final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@id='mailbox:password']");
    private static final By SIGN_IN_BUTTON_LOCATOR = By.xpath("//input[@id='mailbox__auth__button']");
    private static final By ENTER_LINK_LOCATOR = By.xpath("//a[@id='PH_authLink']");

    private Element loginInput = new Element(LOGIN_INPUT_LOCATOR);
    private Element enterPasswordButton = new Element(ENTER_PASSWORD_BUTTON);
    private Element passwordInput = new Element(PASSWORD_INPUT_LOCATOR);
    private Element signInButton = new Element(SIGN_IN_BUTTON_LOCATOR);
    private Element enterLink = new Element(ENTER_LINK_LOCATOR);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public InboxPage loginToMailBox(User user) {
        loginInput.typeValue(user.getLogin());
        enterPasswordButton.click();
        passwordInput.typeValue(user.getPassword());
        enterPasswordButton.click();
        return new InboxPage(driver);
    }

    public boolean isLogoutSuccessful() {
        return enterLink.isDisplayed();
    }
}
