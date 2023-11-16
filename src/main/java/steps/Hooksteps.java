package steps;

import base.singleton.AutomationContext;
import base.singleton.Config;
import base.singleton.ReportHook;
import cucumber.components.FeatureAtf;
import cucumber.components.StepAtf;
import io.cucumber.java.*;
import io.netty.util.internal.StringUtil;
import org.junit.After;
import web.Web;
import web.singleton.WebDriverManagerHook;

public class Hooksteps {
    StepAtf step = new StepAtf();
    FeatureAtf feature = new FeatureAtf();

    @BeforeAll
    public static void beforeAll() {
        AutomationContext.getInstance(Web.class).logInfo("inicio dos testes");
        WebDriverManagerHook.beforeTestRun();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @Before
    public void beforeScenario(Scenario scenarioContext) {
        ReportHook.beforeScenario(Web.class, feature, scenarioContext);
        //setExplicitWaitHelper(featureContext.getName().replaceAll("\'", ""), scenarioContext.getName());

    }

    @AfterStep
    public void afterStep(Scenario scenarioContext) {
        if (scenarioContext.isFailed()) {
            ReportHook.afterStep(Web.class, scenarioContext, step, new Exception("Erro teste"));
        } else
            ReportHook.afterStep(Web.class, scenarioContext, step);
    }

    @After
    public void afterScenario(Scenario scenarioContext) {
        ReportHook.afterScenario(Web.class, scenarioContext);
    }

    @AfterAll
    public static void afterTestRun() {
        //Dispose no atf, fechando todos os browsers
        AutomationContext.getInstance(Web.class).dispose();

        ReportHook.afterTestRun(Web.class);

        String reports = Config.getInstance().getProjectFolderPath();
        if (StringUtil.isNullOrEmpty(reports))
            reports = System.getProperty("user.dir");
    }
}
