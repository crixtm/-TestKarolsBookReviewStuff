/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import helper.Browsers;
import helper.DriverFactory;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AddReviewForm;
import pages.Result;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;


class TestTheSubmitReviewSteps {
    //---------------------------------------------------
<<<<<<< HEAD:src/test/java/TestTheSubmitReviewSteps.java
    private WebDriver driver;
    private String titleOfBook;
    private String randomNumber;
    private String descriptionOfBook;
    private AddReviewForm addForm;
    private Result resultList;

    @Given("the Bookreview opened")
    public void testTheBookReviewOpened(){
        driver = DriverFactory.getWebDriver(Browsers.CHROME);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost:8080");
        addForm = PageFactory.initElements(driver, AddReviewForm.class);
    }
    @Given("I filled the fields with valid data")
    public void testFilledFieldsWithValidData(){
        addForm.fillTitleField  (titleOfBook);
        addForm.fillDescriptionField(descriptionOfBook);
        addForm.fillRatingField("3");
    }
    @When("I submit the review")
    public void testSubmitAValidReview() throws Exception {
        addForm.submitAReview();
        driver.navigate().refresh();


    }

    @Then("the review should appear in the review list")
    public void testReviewAppears(){
        resultList = new Result(driver);
        assertEquals(resultList.getLastTitle().getText(),titleOfBook);
    }
=======
    private static WebDriver driver;
    private String titleOfBook;
    private String randomNumber;
    private String descriptionOfBook;
    AddReviewForm addForm;
>>>>>>> 23fc95b78967f5c120c57476a6be28b5fe9d0e06:src/test/java/AppTest.java

   //////// need to substitute with some jBehave Magic
    /* @DataProvider(name = "browserType") //could be factory???????
    public static Object[][] provideABrowser(){
        return new Object[][]{
                //for ()
                {helper.Browsers.CHROME}//, {helper.Browsers.EDGE}, {helper.Browsers.FF}
        };
    }*/
    private WebDriver initWithGettingWebDriver(Browsers browserType) {
        WebDriver initializedBrowser = DriverFactory.getWebDriver(browserType);
        initializedBrowser.manage().window().maximize();
        return initializedBrowser;
    }
    @AfterStory
    public void quitFromDriver(){
        //driver.quit();
    }
    @BeforeStory
    public void initSomeHelperStuff(){
        randomNumber = String.valueOf((int)(Math.random()*1000));
        titleOfBook= "CheeseTheTitle" + randomNumber;
        descriptionOfBook = "CheeseDescription" + randomNumber;
    }
/*
    @Test (dataProvider = "browserType")
    public void Test_PageOpensWithBrowsers(helper.Browsers browserType){
        //given
        driver = initWithGettingWebDriver(browserType);
        //when
        driver.get("http://localhost:8080");
        //then
        assertEquals(driver.getTitle(),"MyBooksReview");
    }
<<<<<<< HEAD:src/test/java/TestTheSubmitReviewSteps.java
*/
    /*//---------------------------------------------------
    @Test
    public void Test_submitAValidReviewRefreshThePageAndCheckIsItAppears(helper.Browsers browserType){
=======

    //---------------------------------------------------
    @Test (dataProvider = "browserType")
    public void Test_submitAValidReviewRefreshThePageAndCheckIsItAppears(Browsers browserType){
>>>>>>> 23fc95b78967f5c120c57476a6be28b5fe9d0e06:src/test/java/AppTest.java
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
    public void Test_Test_submitAValidReviewWithoutRefreshAndCheckIsItAppears(helper.Browsers browserType){
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
    public void Test_submitAnEmptyReview(helper.Browsers browserType){
        //given

        //when
        throw new NotImplementedException();
        //then
        //assertTrue(false);
    }
    //---------------------------------------------------
<<<<<<< HEAD:src/test/java/TestTheSubmitReviewSteps.java
    @Test (dataProvider = "browsertype")
    public void Test_submitOnlyTitleAddedReview(helper.Browsers browserType){
=======
    @Test (dataProvider = "browserType")
    public void Test_submitOnlyTitleAddedReview(Browsers browserType){
>>>>>>> 23fc95b78967f5c120c57476a6be28b5fe9d0e06:src/test/java/AppTest.java
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //---------------------------------------------------
<<<<<<< HEAD:src/test/java/TestTheSubmitReviewSteps.java
    @Test (dataProvider = "browsertype")
    public void Test_submitOnlyDescriptionAddedReview(helper.Browsers browserType){
=======
    @Test (dataProvider = "browserType")
    public void Test_submitOnlyDescriptionAddedReview(Browsers browserType){
>>>>>>> 23fc95b78967f5c120c57476a6be28b5fe9d0e06:src/test/java/AppTest.java
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //...and so on
    //---------------------------------------------------
<<<<<<< HEAD:src/test/java/TestTheSubmitReviewSteps.java
    @Test (dataProvider = "browsertype")
    public void Test_submitFilledReviewButTitle(helper.Browsers browserType){
=======
    @Test (dataProvider = "browserType")
    public void Test_submitFilledReviewButTitle(Browsers browserType){
>>>>>>> 23fc95b78967f5c120c57476a6be28b5fe9d0e06:src/test/java/AppTest.java
        //given

        //when

        //then
        throw new NotImplementedException();
        //assertEquals(,);
    }
    //...and so on*/


}
