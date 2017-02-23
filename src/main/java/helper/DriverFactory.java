package helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getWebDriver(Browsers browserType) throws WebDriverException{
        switch (browserType){
            case CHROME: return new ChromeDriver();
            case EDGE: return new EdgeDriver();
            case FF: return new FirefoxDriver();

            default: throw new WebDriverException("No such driver");
        }
    }
}
