package BASE_PACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    protected WebDriver driver;

    public void setUp() throws Exception {
        setUpDriver();
        driver.manage().window().maximize();
    }

    private void setUpDriver() {
        String chromeDriverPath = System.getProperty("chrome.driver.path");

        if(chromeDriverPath != null) {
            driver = getChromeDriver(chromeDriverPath);
        } 
        
        else {
            driver = getChromeClasspathDriver();
        }
    }
    private WebDriver getChromeDriver(String chromeDriverPath) {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }

    private WebDriver getChromeClasspathDriver() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        return new ChromeDriver();
    }

    private String getChromeDriverPath (){
        return getClass().getClassLoader().getResource("chromedriver/chromedriver.exe").getPath();
    }

    public void tearDown() throws Exception {
        driver.quit();
    }
}
