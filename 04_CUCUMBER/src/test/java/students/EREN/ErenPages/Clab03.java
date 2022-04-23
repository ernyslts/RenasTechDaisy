package src.test.java.students.EREN.ErenPages;

import src.test.java.students.EREN.StepDefinitionsHW.Guru99Steps;

public class Clab03 {

    /*
    Scenario Outline: Verify that we can add customers http://demo.guru99.com/telecom/index.html
Given The user wants to see Guru demo site
When The user wants to add a customer
Then The users wants to verify "Add Customer" header
Then The user wants to enter background check as "<bCheck>"
Then The user wants to enter billingaddress as "<fName>" and "<lName>" and "<email>" and "<address>" and "<pNumber>"
  And The wants to verify message as "Access Details to Guru99 Telecom"
  Examples:
    |bCheck |fName |lName| email           |address     |pNumber  |
    |Done   |Joe   |Dave |joedave@gmail.com|10 fake st  |123456789|
    |Pending|Jason |Dave |jason@gmail.com  |11 fake st  |789654123|
     */
    public Guru99Steps(){PageFactory.initElements(driver,this);}

    @FindBy (xpath = "//a[@href='addcustomer.php']")
    private WebElement addCustomer;
    public void setAddCustomer(){clickWithWait(addCustomer);}

    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement header;
    public void setHeader(String header1){Assert.assertEquals(header1,header.getText());}

    @FindBy (xpath = "//label[@for='done']")

    private WebElement DoneButton;
    public void setDoneButton(){DoneButton.click();}

    @FindBy (xpath = "//label[@for='pending']")
    private WebElement PendingButton;
    public void setPendingButton(){PendingButton.click();}

    public void setBackgroundCheck (String Background){
        if (Background.equalsIgnoreCase(PendingButton.getText())){

            PendingButton.click();
        } else {
            DoneButton.click();
        }
    }


    @FindBy (id = "fname")
    private WebElement FirstName;
    public void setFirstName(){FirstName.sendKeys("Joe");}


    @FindBy(id = "lname")
    private WebElement LastName;
    public void setLastName(){LastName.sendKeys("Dave");}

    @FindBy (name = "emailid")
    private WebElement Email ;
    public void setEmail(){Email.sendKeys("joedave@gmail.com");}


    @FindBy(name = "addr")
    private WebElement Address;
    public void setAddress(){Address.sendKeys("10 fake st");}

    @FindBy(id = "telephoneno")
    private WebElement pNumber;
    public void setpNumber(){pNumber.sendKeys("123456789");}

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;
    public void setSubmitButton(){submitButton.click();}

    @FindBy (xpath = "//header[@class='align-center']")
    private WebElement verify;
    public void setVerify(String verify1){Assert.assertEquals(verify1,verify.getText());}






}
