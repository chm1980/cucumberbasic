package cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Cucumber
@Suite
@Cucumber.Options(glue = {"Steps"}) // Use @Cucumber.Options e especifique o pacote em um array de Strings
@SelectClasspathResource("features")
public class RunCucumberTest {
}
