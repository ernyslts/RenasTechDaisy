package src.test.java.students.EREN;

import java.util.concurrent.TimeUnit;

public class Slab05 {

     /*
   #### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
#### Step 2) Enter Any Customer id.
#### Step 3) After entering the customer ID, Click on the “Submit” button.
#### Step 4) Reject/accept the alert.
     */

    public WebDriver driver;

    @BeforeMethod
    public void setup() {


        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void TC1() throws InterruptedException {

        WebElement cID = driver.findElement(By.name("cusid"));
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        cID.sendKeys("123456");
        submit.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closing(){
        driver.quit();
    }
}
