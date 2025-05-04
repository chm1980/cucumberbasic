package cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.CucumberOptions; // Importe a anotação CucumberOptions
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Cucumber
@Suite
@CucumberOptions(glue = "Steps") // Adicione a opção glue especificando o pacote 'Steps'
@SelectClasspathResource("features")
public class RunCucumberTest {
}
