package pages;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Krisztian_Barabas on 16.02.2017.
 */
public class Result {
    @FindAll({@FindBy(className = "title")})
    private
    List<WebElement> titles;
    public Result (WebDriver driver){
        PageFactory.initElements(driver,this);
        /*WebElement wait = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("title")));*/
        Wait fluentWait = new FluentWait(driver).withTimeout(10,TimeUnit.MILLISECONDS)
                .pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
    }


    public WebElement getLastTitle(){
        WebElement lastTitle = titles.get(titles.size()-1);
        return lastTitle;
    }
}
