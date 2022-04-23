package src.test.java.students.EREN.ErenPages;

import CucumberHomeWork.ErenUtils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clab02 extends BrowserUtils {
    /*
    todo#### You need to create new feature file new step definition and also implement page object model for that homework.
    Scenario:VerifyAdd Tariff Plan website http://demo.guru99.com/telecom/index.html
    Given The user wants to see Guru demo site
    When The user wants to Add Tariff Plan
    Then The user wants to verify "Add Tariff Plans" headerr
    Then The user wants to Add Tariff Plan details as
    | Monthly Rental| 10|
            | Free Local Minutes| 12|
            | Free International Minutes| 13|
            | Free SMS Pack| 15|
            | Local Per Minutes Charges| 18|
            | International Per Minutes Charges| 25|
            | SMS Per Charges| 28|
    And The user wants to submit
    Then The user wants to verify message as "Congratulation you add Tariff Plan"

     */

    public Clab02(){PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement addPlan ;

    public void setAddPlan(){
        staticWait(2);
        addPlan.click();}

    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement header ;

    public void setHeader( String expectedHeader){
        Assert.assertEquals(expectedHeader,header.getText());
    }

    @FindBy (id = "rental1")
    private WebElement rental;

    @FindBy (id = "local_minutes")
    private WebElement localmin ;

    @FindBy (id = "sms_pack")
    private WebElement sms ;


    @FindBy (id = "minutes_charges")
    private WebElement localPerMin;

    @FindBy (id = "inter_charges")
    private WebElement international;

    @FindBy(id = "sms_charges")
    private WebElement smsCharge;
}
