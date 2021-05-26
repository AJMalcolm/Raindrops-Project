package malcolm.alasdair.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RaindropsStepDefs {
    @Given("An input of {int}")
    public void anInputOf(int input) {
    }

    @Given("An input of {double}")
    public void anInputOf(double input) {
    }

    @Given("An input of {string}")
    public void anInputOf(String input) {
    }

    @Given("An empty or null input")
    public void anEmptyOrNullInput() {
    }

    @When("The application is run")
    public void theApplicationIsRun() {
    }

    @Then("The output should be {string}")
    public void theOutputShouldBe(String output) {
    }

    @Then("The output should be {int}")
    public void theOutputShouldBe(int output) {
    }

    @Then("The output should be {double}")
    public void theOutputShouldBe(double output) {
    }
}
