package PageObjects;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

import java.net.URI;

public class abstructPageLoaderDriver {

    protected  static Browser browser;

    public abstructPageLoaderDriver(Browser browser){
        abstructPageLoaderDriver.browser=browser;
    }

    public void setBrowser() throws Exception {
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);

        browser= BrowserFactory.launch(BrowserType.CHROME);
    }

    public loginPage PageNavigateToWebApp(String url) throws GeneralLeanFtException {

        browser.navigate(url);
        return new loginPage(browser);
    }

    public void syncBrowser() throws GeneralLeanFtException {
        browser.sync();
    }

    public void closeDriver(){
        System.out.println("This step will close and cleanup the browser");
        try {
            browser.close();
        } catch (GeneralLeanFtException e) {
            System.out.println("browser is already closed");
        }
    }

}
