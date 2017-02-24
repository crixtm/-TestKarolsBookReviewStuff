/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.AddReviewForm;
import pages.Result;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.testng.Assert.*;


public class AppTest {
    //---------------------------------------------------
    private static WebDriver driver;
    private String titleOfBook;
    private String randomNumber;
    private String descriptionOfBook;
    AddReviewForm addForm;

    @DataProvider(name = "browserType") //could be factory???????
    public static Object[][] provideABrowser(){
        return new Object[][]{
                //for ()
                {Browsers.CHROME}//, {Browsers.EDGE}, {Browsers.FF}
        };
    }
    private WebDriver initWithGettingWebDriver(Browsers browserType) {
        WebDriver initializedBrowser = DriverFactory.getWebDriver(browserType);
        initializedBrowser.manage().window().maximize();
        return initializedBrowser;
    }
    @AfterMethod
    public void quitFromDriver(){
        //driver.quit();
    }
    @BeforeMethod
    public void initSomeHelperStuff(){
        randomNumber = String.valueOf((int)(Math.random()*1000));
        titleOfBook= "CheeseTheTitle" + randomNumber;
        descriptionOfBook = "CheeseDescription" + randomNumber;
    }

    @Test (dataProvider = "browserType")
    public void Test_PageOpensWithBrowsers(Browsers browserType){
        //given
        driver = initWithGettingWebDriver(browserType);
        //when
        driver.get("http://localhost:8080");
        //then
        assertEquals(driver.getTitle(),"MyBooksReview");
    }

    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitAValidReviewRefreshThePageAndCheckIsItAppears(Browsers browserType){
        //given
        driver = initWithGettingWebDriver(browserType);
        AddReviewForm addForm = PageFactory.initElements(driver, AddReviewForm.class);
        driver.get("http://localhost:8080");
        //when
        addForm.fillTitleField(driver,titleOfBook);
        addForm.fillDescriptionField(driver,descriptionOfBook);
        addForm.fillRatingField(driver,"3");
        addForm.submitAReview(driver);
        driver.navigate().refresh();
        Result resultList = PageFactory.initElements(driver,Result.class);
        //then
        assertEquals(resultList.getLastTitle(driver).getText(),titleOfBook);
    }

    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_Test_submitAValidReviewWithoutRefreshAndCheckIsItAppears(Browsers browserType){
        //given
        driver = initWithGettingWebDriver(browserType);
        AddReviewForm addForm = PageFactory.initElements(driver, AddReviewForm.class);
        driver.get("http://localhost:8080");
        //when
        addForm.fillTitleField(driver,titleOfBook);
        addForm.fillDescriptionField(driver,descriptionOfBook);
        addForm.fillRatingField(driver,"3");
        addForm.submitAReview(driver);
        Result resultList = PageFactory.initElements(driver,Result.class);
        //then
        assertEquals(resultList.getLastTitle(driver).getText(),titleOfBook);
    }

    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitAnEmptyReview(Browsers browserType){
        //given

        //when
        throw new NotImplementedException();
        //then
        //assertTrue(false);
    }
    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitOnlyTitleAddedReview(Browsers browserType){
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitOnlyDescriptionAddedReview(Browsers browserType){
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //...and so on
    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitFilledReviewButTitle(Browsers browserType){
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //...and so on
}