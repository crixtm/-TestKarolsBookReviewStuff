package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Krisztian_Barabas on 16.02.2017.
 */
public class Result {
    @FindAll({@FindBy(className = "title")})
    List<WebElement> titles;




    public List<WebElement> getTitles(WebDriver driver){
        return titles;
    }
    public WebElement getLastTitle(WebDriver driver){
        WebElement lastTitle = titles.get(titles.size()-1);
        return lastTitle;
    }
}
