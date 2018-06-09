package steps;

import PageObjects.homePage;
import PageObjects.loginPage;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import com.hp.lft.sdk.web.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.URI;

public class step_definition {


    Browser browser;

    loginPage page=new loginPage(browser);
    homePage homepage=new homePage(browser);


    @Given("^open Google Chrome and navigate to LinkedIn page$")
    public void open_Google_Chrome_and_navigate_to_LinkedIn_page() throws Throwable {
        System.out.println("This step will navigate to Gamil Page");

        page.setBrowser();
        page.PageNavigateToWebApp("https://www.linkedin.com/");
        page.syncBrowser();
    }

    @When("^User logs in using username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_logs_in_using_username_as_and_password_as(String arg1, String arg2) throws Throwable {
        System.out.println("This step fill up username and password");

        page.setUsername(arg1);
        page.setPassword(arg2);
        page.clickLoginBtn();
        page.syncBrowser();
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
        System.out.println("This step will check the login success");

        Boolean is_login_value=homepage.isLoggedIn();
        Assert.assertEquals(true,is_login_value);


    }

    @Then("^User presses Sign Out button$")
    public void user_presses_Sign_Out_button() throws Throwable {
        System.out.println("This step will press the signout button");

        homepage.clickLogoutbtn();
        page.closeDriver();
    }


}
