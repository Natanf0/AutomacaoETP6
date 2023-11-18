package runners;

import base.singleton.AutomationContext;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import web.Web;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
                "cucumber.components.StepAtf", "cucumber.components.FeatureAtf"}
        ,features="src/main/resources/features/TipoModulo/Inclusao/Incluir.feature"
        ,glue={"steps"}
)
public class ModuloRunner {
    @AfterClass
    public static void afterTestRun(){
        AutomationContext.getInstance(Web.class).dispose();
    }
}
