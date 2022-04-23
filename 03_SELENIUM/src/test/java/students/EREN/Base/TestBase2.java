package src.test.java.students.EREN.Base;

import java.util.concurrent.TimeUnit;

public class TestBase2 {

    // abstraction example
    @BeforeMethod
    public void setUp() {

        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
//      DriverUtil.closeDriver();
    }
}
