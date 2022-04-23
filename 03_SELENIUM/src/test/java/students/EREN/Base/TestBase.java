package src.test.java.students.EREN.Base;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
        driver.close();
    }
}
