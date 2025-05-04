<<<<<<< HEAD
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "Steps")
public class RunCucumberTest {
}

=======
package com.yourcompany.cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasspathResource;

@Cucumber
@Suite
@SelectClasspathResource("features") // Certifique-se de que a pasta 'features' esteja em src/test/resources
public class RunCucumberTest {
}
>>>>>>> e9f961107b38dd2b9b727f3af788a588b052b97d
