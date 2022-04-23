package src.test.java.students.EREN;

public class Slab07_NewCustomerEntryPage {

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
    public void NewCustomerPage(){
        WebElement NewCustomer = driver.findElement(By.xpath("//*[contains(text(),'New Customer')]"));
        NewCustomer.click();

        WebElement verifyNewCustomer = driver.findElement(By.className("heading3"));
        String actualTitle = verifyNewCustomer.getText();
        String expectedTitle = "Welcome To Manager's Page of Guru99 Bank";
        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement customerName = driver.findElement(By.name("name"));
        customerName.sendKeys("Eren Yesiltas");

        WebElement gender = driver.findElement(By.name("rad1"));
        gender.click();

        WebElement dob = driver.findElement(By.id("dob"));
        String Dob = "03/28/1994";
        dob.sendKeys(Dob);

        WebElement addR = driver.findElement(By.name("addr"));
        addR.sendKeys("7418 5th ave 3F");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("NYC");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("NY");

        WebElement PIN = driver.findElement(By.name("pinno"));
        PIN.sendKeys("123456");

        WebElement Mnum = driver.findElement(By.name("telephoneno"));
        Mnum.sendKeys("6469736157");

        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys("erenyesiltas@hotmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("19051905");

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();
    }
}
