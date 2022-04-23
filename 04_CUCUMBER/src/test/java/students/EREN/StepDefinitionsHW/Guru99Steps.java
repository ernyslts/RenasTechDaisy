package src.test.java.students.EREN.StepDefinitionsHW;

import CucumberHomeWork.ErenUtils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Guru99Steps extends BrowserUtils {

    Guru99Steps guru99Steps = new Guru99Steps();

    @Given("The user wants to see Guru demo site")
public void the_user_wants_to_see_guru_demo_site() {

    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {

    }
    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {

    }

    @Given("The user wants to see Guru demo site")
    public void The_user_wants_to_see_Guru_demo_site(){

        System.out.println("Welcome to Guru99");

    }

    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        guru99Home.setAddCustomer();

    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String ExpectedHeader) {

        guru99Home.setHeader(ExpectedHeader);

    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String Backround) {
        // staticWait(2);
        //guru99Home.setDoneButton();
        // staticWait(2);
        //guru99Home.setPendingButton();

        guru99Home.setBackgroundCheck(Backround);

    }
    @Then("The user wants to enter billing address as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billing_address_as_and_and_and_and(String a, String b, String c,String d,String e) {
        guru99Home.setFirstName();
        staticWait(1);
        guru99Home.setLastName();
        staticWait(1);
        guru99Home.setEmail();
        staticWait(1);
        guru99Home.setAddress();
        staticWait(1);
        guru99Home.setpNumber();
        staticWait(1);
        guru99Home.setSubmitButton();
        staticWait(1);
    }
    @And("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String expectedMessage) {
        guru99Home.setVerify(expectedMessage);
    }
}
