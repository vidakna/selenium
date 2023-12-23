package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features", // Update the feature file path
    glue = "stepDefinition" // Update the package containing your step definitions
)
public class LoginRunner {
}
