package malcolm.alasdair.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import malcolm.alasdair.raindrops.Raindrops;
import org.junit.jupiter.api.Assertions;

import static java.lang.Integer.parseInt;

public class RaindropsStepDefs {

    Raindrops raindropsClass;
    String response;

    @Given("An Integer input of {int}")
    public void anIntegerInputOf(int input) {
        raindropsClass = new Raindrops();
        response = raindropsClass.raindrops(Integer.toString(input));
    }

    @Given("A Double input of {double}")
    public void aDoubleInputOf(double input) {
        raindropsClass = new Raindrops();
        response = raindropsClass.raindrops(Double.toString(input));
    }

    @Given("An input of {string}")
    public void anInputOf(String input) {
        raindropsClass = new Raindrops();
        response = raindropsClass.raindrops(input);
    }

    @Given("An empty input")
    public void anEmptyInput() {
        raindropsClass = new Raindrops();
        response = raindropsClass.raindrops("");
    }

    @Given("An null input")
    public void anNullInput() {
        raindropsClass = new Raindrops();
        response = raindropsClass.raindrops(null);
    }

    @When("The application is run")
    public void theApplicationIsRun() {
    }

    @Then("The output should be {string}")
    public void theOutputShouldBe(String output) {
        Assertions.assertEquals(output, response);
    }

    @Then("The output should be an Integer: {int}")
    public void theOutputShouldBe(int output) {
        Assertions.assertEquals(output, Integer.parseInt(response));
    }

    @Then("The output should be a Double: {double}")
    public void theOutputShouldBe(double output) {
        Assertions.assertEquals(output, Double.parseDouble(response));
    }


}
