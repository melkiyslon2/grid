package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SamsungWathesPage extends BasePage{

    @FindBy(xpath = "//div[@class='catalog-facet']/div")
    private List<WebElement> amountOfWatchesOnThePage;

    public SamsungWathesPage(WebDriver driver) {
        super(driver);
    }

    public int checkAmountOfWatches(){
        return amountOfWatchesOnThePage.size();
    }
}
