package src.test.java.students.EREN;

import java.util.concurrent.TimeUnit;

public class Slab07_LoginPage {

    /*
   todo   //Hint TestNG
   Pages : In this task you will need to create 3 pages class
   First one for login page where you need to locate : username,password,Login and Guru99 Bank text
   Second page is for home page and you need to locate : text Manger Id
   Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
   todo  //Configuration File
   store username,pasword , and url
   todo //Utils
   use our ready utils such as readingproperties,driver, browser utils
   todo//Base
   use our ready testbase classes.

    */
    WebDriver driver;
    @Test
    public void logIn(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");

        WebElement guruCheck = driver.findElement(By.className("barone"));
        String actualText = guruCheck.getText();
        String expectedText = "Guru99 Bank";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Visible Text : " + actualText);

        String UserID = "mngr401350";
        String Password = "vutadam";


        WebElement userID = driver.findElement(By.name("uid"));
        userID.sendKeys(UserID);

        WebElement userPassword = driver.findElement(By.xpath("//input[@type='password']"));
        userPassword.sendKeys(Password);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();






    }
}
