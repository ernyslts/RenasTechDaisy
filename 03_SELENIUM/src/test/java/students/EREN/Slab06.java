package src.test.java.students.EREN;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Slab06 {

     /*
   ## Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
## Test Scenario:
####      Go to the above URL.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Locate the “Visit W3Schools.com!” link and click it.
####      Get all window handles and hold them in a list.
####      Write to total window handle number to the console. It must be 2.
####      Switch to the second window.
####      Get the current window’s handle and write to the console window. It must be a second window handle.
####      Check the upper left side logo in the second window.
####      Go back (Switch) to the first window.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Check the See Run Button Text. It must contain “Run >” text.
     */


    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

    }

    @Test
    public void TC1(){
        String window = driver.getWindowHandle();
        WebElement LinkText = driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']"));
        LinkText.click();
        System.out.println("The current windows handle is :" +driver.getWindowHandle());
        driver.switchTo().frame("iFrame");


        Set<String> WindowHandles = driver.getWindowHandles();
        List<String> WindowHandleList = new ArrayList<>(WindowHandles);
        System.out.println("Total window number : " + WindowHandleList.size());
        driver.switchTo().window(WindowHandleList.get(1));


        System.out.println("Current window Handle "+driver.getWindowHandle());
        WebElement visibleLogo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(visibleLogo.isDisplayed(),"Visible logo verification is failed");
        driver.switchTo().window(WindowHandleList.get(0));


        System.out.println("Current window Handle: "+driver.getWindowHandle());
        WebElement Button = driver.findElement(By.id("runbtn"));
        Assert.assertTrue(Button.getText().contains("Run"),"Run Button verification failed");

    }




}
