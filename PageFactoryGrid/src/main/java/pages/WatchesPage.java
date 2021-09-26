package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WatchesPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Смарт-часы Amazfit GTS 2 mini (Black) A2018')]")
    private WebElement smartWatch;
    @FindBy(xpath = "//button[@class='link on bd0 cup']")
    private WebElement getCity;

    @FindBy(xpath = "//li[contains(@class,'filterItem')]")
    private List<WebElement> samsungWatchesButton;

    public WatchesPage(WebDriver driver) {
        super(driver);
    }

    public void chooseWatchesFromList(){
        smartWatch.click();
    }

    public String checkGetCity(){
        return getCity.getText();
    }

    public void chooseOnlySamsungWatches(){
        samsungWatchesButton.get(1).click();
    }

}
