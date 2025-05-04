package cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Cucumber
@Suite
@SelectClasspathResource("features")
public class RunCucumberTest {
}
