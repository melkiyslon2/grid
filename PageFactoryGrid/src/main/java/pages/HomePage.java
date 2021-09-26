package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='currentCity-0-2-29 link link-dashed']")
    private WebElement city;
    @FindBy(xpath = "//p[contains(text(),'Полтава')]")
    private WebElement changeCity;
    @FindBy(xpath = "//a[@href='/smart-chasy/']//div[@class='menuIcon-0-2-48 mr16']")
    private WebElement smartWatches;

    @FindBy(xpath = "//a[@href='/gift-certificates/']")
    private WebElement giftCardButton;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cityButton(){
        city.click();
    }

    public void chooseCityFromList(){
        changeCity.click();
    }

    public void smartWathcesCategory(){
        smartWatches.click();
    }

    public void goToGiftCardPage(){
        giftCardButton.click();
    }



}
