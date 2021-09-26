package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.GiftCardPage;
import pages.HomePage;
import pages.SamsungWathesPage;
import pages.WatchesPage;
import utils.CapabilityFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();// ThreadLocal позволяет нам хранить данные, которые будут доступны только конкретным потоком. Каждый поток будет иметь свой собственный экземпляр ThreadLocal
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String CANADIAN_TIRE_URL = "https://www.citrus.ua/";

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox") String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(CANADIAN_TIRE_URL);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public WatchesPage getWatchesPage(){
        return new WatchesPage(getDriver());
    }

    public GiftCardPage getGiftCardPage(){
        return new GiftCardPage(getDriver());
    }

    public SamsungWathesPage getSamsungWatchesPage(){
        return new SamsungWathesPage(getDriver());
    }

}
