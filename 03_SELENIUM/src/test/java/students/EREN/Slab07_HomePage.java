package src.test.java.students.EREN;

public class Slab07_HomePage {
    /*
    todo   //Hint TestNG
    Pages : In this task you will need to create 3 pages class
   todo //First one for login page where you need to locate : username,password,Login and Guru99 Bank text
    todo //Second page is for home page and you need to locate : text Manger Id
    todo //Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
    todo  //Configuration File
    store username,pasword , and url
    todo //Utils
    use our ready utils such as readingproperties,driver, browser utils
    todo//Base
    use our ready testbase classes.

     */
    WebDriver driver;
    @Test
    public void Home(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.get("http://demo.guru99.com/V4/");
        String verifyID = driver.findElement(By.xpath("//*[contains(text(),'Manger Id : mngr401350')]")).getText();
        String expectedID = "Manger Id : mngr401350";
        Assert.assertEquals(verifyID,expectedID);
    }

}
