package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Krisztian_Barabas on 16.02.2017.
 */
public class AddReviewForm {

    @FindBy(id = "titleInput")
    WebElement titleInput;
    @FindBy(id = "descriptionArea")
    WebElement descriptionInput;
    @FindBy(id = "ratingInput")
    WebElement ratingInput;
    @FindBy(id = "submitButton")
    WebElement submitButton;

    public void submitAReview(WebDriver diver){
        submitButton.click();
    }

    public void fillTitleField(WebDriver driver, String titleOfBook){
        titleInput.sendKeys(titleOfBook);
    }
    public void fillDescriptionField(WebDriver driver, String descriptionOfBook){
        descriptionInput.sendKeys(descriptionOfBook);
    }
    public void fillRatingField(WebDriver driver, String ratingOfBook){
        ratingInput.sendKeys(ratingOfBook);
    }
}
