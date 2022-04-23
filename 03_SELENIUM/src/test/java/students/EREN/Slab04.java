package src.test.java.students.EREN;

import java.util.concurrent.TimeUnit;

public class Slab04 {

      /*
#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish
     */

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");

    }

    @Test
    public void TC_1() throws InterruptedException {
        driver.findElement(By.name("country")).click();
        WebElement countries = driver.findElement(By.name("country"));

        Select Country = new Select(countries);
        Country.selectByVisibleText("BARBADOS");
        Thread.sleep(1000);
        Country.selectByIndex(75);
        Thread.sleep(2000);
        Country.selectByValue("SLOVAKIA");

        Thread.sleep(3000);

    }

    @AfterMethod
    public void closing(){
        driver.quit();
    }



}
