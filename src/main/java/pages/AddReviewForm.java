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
    private WebElement titleInput;
    @FindBy(id = "descriptionArea")
    private WebElement descriptionInput;
    @FindBy(id = "ratingInput")
    private WebElement ratingInput;
    @FindBy(id = "submitButton")
    private WebElement submitButton;

    public void submitAReview(){
        submitButton.click();
    }

    public void fillTitleField(String titleOfBook){
        titleInput.sendKeys(titleOfBook);
    }
    public void fillDescriptionField(String descriptionOfBook){
        descriptionInput.sendKeys(descriptionOfBook);
    }
    public void fillRatingField(String ratingOfBook){
        ratingInput.sendKeys(ratingOfBook);
    }
}
