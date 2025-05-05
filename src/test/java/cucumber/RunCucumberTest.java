package cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Cucumber(glue = {"Steps"}) // Correção: Use @Cucumber diretamente com a opção 'glue'
@Suite
@SelectClasspathResource("features")
public class RunCucumberTest {
}
