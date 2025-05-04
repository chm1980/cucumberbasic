package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * Created by Karthik on 10/17/2016.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
        System.out.println("Hook class instantiated!"); // Adicione esta linha
    }

    @Before
    public void InitializeTest() {
        System.out.println("Opening the browser : MOCK");

        // Passing a dummy WebDriver instance step info
        base.StepInfo = "FirefoxDriver";
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}
