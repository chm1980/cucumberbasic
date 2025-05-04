package cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasspathResource;

@Cucumber
@Suite
@SelectClasspathResource("features") // Certifique-se de que a pasta 'features' esteja em src/test/resources
public class RunCucumberTest {
}
