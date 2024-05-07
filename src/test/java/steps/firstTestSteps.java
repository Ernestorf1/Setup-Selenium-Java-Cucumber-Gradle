package steps;

import pages.firstTestPage;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstTestSteps {
    firstTestPage firstTP = new firstTestPage();

 @Given("^user navigate to Google$")
public void user_navigate_to_google() {
firstTP.navigateToGoogle();
}
@When("^user enter criteria$")
public void user_enter_criteria() {
firstTP.searchCriteria();
}
@Then("^user obtains match results$")
public void user_obtains_match_results() {
firstTP.matchResults();
}

}
