package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_GoogleHomepage;

/**
 * Created by pa3l91m on 5/14/20.
 */
public class MyStepdefs {
    Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

    @Given("^I launch Chrome browser$")
    public void I_launch_Chrome_browser() throws Throwable {
        googleHomepage.launchBrowser();
    }

    @When("^I open Google Homepage$")
    public void I_open_Google_Homepage() throws Throwable {
        googleHomepage.openGoogleURL();
    }

    @Then("^I verify that the page displays search text box$")
    public void I_verify_that_the_page_displays_search_text_box() throws Throwable {
        googleHomepage.checkSearchBoxIsDisplayed();
    }

    @And("^the page displays Google Search button$")
    public void the_page_displays_Google_Search_button() throws Throwable {
        googleHomepage.checkGoogleSearchButtonIsDisplayed();
    }

    @And("^the page displays Im Feeling Lucky button$")
    public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
        googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
    }

    @When("^I enter search text \"([^\"]*)\"$")
    public void iEnterSearchText(String text) throws Throwable {
        googleHomepage.enterSearchText(text);
    }

    @And("^I click Google Search button$")
    public void iClickGoogleSearchButton() {
        googleHomepage.clickGoogleSearchButton();
    }
}