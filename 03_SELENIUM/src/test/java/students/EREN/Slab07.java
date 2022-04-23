package src.test.java.students.EREN;

import java.util.concurrent.TimeUnit;

public class Slab07 {

    /*
todo POM Example TEST - Share Github Link for this
   Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
   Step 2) In Login page check text "Guru99 Bank" is present
   Step 3) Login into application  with given credentials(you need to enter your email in order to get credentials in advance)
   Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
   Step 5) Click on new customer button and verify you are in New Customer Entry Page
  Step 6) Fill the information for new customer
   Step 7) Verify new customer added sucessfully

todo   Hint-TestNG :
           //Pages : In this task you will need to create 3 pages class
           //First one for login page where you need to locate : username,password,Login and Guru99 Bank text
            //Second page is for home page and you need to locate : text Manger Id
            //Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
todo        //Configuration File
            //store username,pasword , and url
todo        //Utils
            //use our ready utils such as readingproperties,driver, browser utils
todo        //Base
            //use our ready testbase classes.
todo     //Testing
            // while testing first you will verify "Guru99 Bank" is present
            // then you need to Login into application
            // then verify Home page contains text as "Manger Id: mngr368294"
            // click on new customer tab then verify title contains New Customer Entry Page
todo fill all information to be able create a customer
            // verify the message customer registered sucessfully.
 */
    public class lab07 {

        WebDriver driver ;

        @BeforeMethod
        public void setup(){
            driver = WebDriverUtil.getDriver("chrome");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/V4/");

        }
        @Test
        public void TC1() throws InterruptedException {
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

            String verifyID = driver.findElement(By.xpath("//*[contains(text(),'Manger Id : mngr401350')]")).getText();
            String expectedID = "Manger Id : mngr401350";
            Assert.assertEquals(verifyID,expectedID);


            Thread.sleep(2000);

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


            WebElement verifyCustomerReg = driver.findElement(By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]"));
            String actualRegTitle = verifyCustomerReg.getText();
            String expectedRegTitle = "Customer Registered Successfully!!!";
            Assert.assertEquals(actualRegTitle,expectedRegTitle);

            System.out.println("Page title is : " + expectedRegTitle);

        }
}
