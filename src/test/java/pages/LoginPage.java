package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.BaseWebDriver;

public class LoginPage extends Parent{

    public LoginPage(){
        PageFactory.initElements(BaseWebDriver.getDriver(),this);
    }
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(css = "div[class='hot-toast-message']")
    private WebElement loginErrorMsg;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getLoginErrorMsg() {
        return loginErrorMsg;
    }
}
