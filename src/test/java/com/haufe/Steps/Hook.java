package com.haufe.Steps;

import com.haufe.Base.BaseUtil;
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
        String path = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        //Chrome driver
        System.setProperty("webdriver.chrome.driver", path + separator + "chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest ()
    {
        base.Driver.close();
    }
}
