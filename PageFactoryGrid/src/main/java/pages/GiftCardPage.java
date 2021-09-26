package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GiftCardPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class,'df jcsb')]/button[2]")
    private List<WebElement> giftCard;

    @FindBy(xpath = "//div[contains(@class,'df aic jcc pa')]")
    private WebElement addToCompareButton;


    public GiftCardPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSecondCard(){
        giftCard.get(2).click();
    }

    public String addToCompare(){
        return addToCompareButton.getText();
    }
}
