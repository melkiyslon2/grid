package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SmokeTests extends BaseTest {

    private static final long DEFAULT_WAITING_TIME = 10;

    @Test
    public void checkCityAfterChoose() {
        getHomePage().cityButton();
        getHomePage().implicityWait(DEFAULT_WAITING_TIME);
        getHomePage().chooseCityFromList();
        getHomePage().smartWathcesCategory();
        getWatchesPage().chooseWatchesFromList();
        getWatchesPage().checkGetCity();
        assertEquals(getWatchesPage().checkGetCity(),"Полтава");
    }

    @Test
    public void testCardPrice(){
        getHomePage().goToGiftCardPage();
        getHomePage().implicityWait(DEFAULT_WAITING_TIME);
        getGiftCardPage().clickOnSecondCard();
        assertEquals(getGiftCardPage().addToCompare(),"1");
    }

    @Test
    public void checkAmountOfSamsungWatches(){
        getHomePage().smartWathcesCategory();
        getHomePage().implicityWait(DEFAULT_WAITING_TIME);
        getWatchesPage().chooseOnlySamsungWatches();
        assertEquals(getSamsungWatchesPage().checkAmountOfWatches(),8);
    }


}
