package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest ()
    {
        System.out.println("Open browser");
        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\IdeaProjects\\Haufe_Test\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest ()
    {
        base.Driver.close();
    }
}
