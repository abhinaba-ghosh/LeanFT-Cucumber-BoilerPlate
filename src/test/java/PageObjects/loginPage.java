package PageObjects;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;

public class loginPage extends abstructPageLoaderDriver  {


    //Username Text Box
    EditFieldDescription txt_userName =  new EditFieldDescription.Builder().type("text")
            .tagName("INPUT").id("login-email").build();

    //Password Text Box
    EditFieldDescription txt_password =  new EditFieldDescription.Builder()
            .type("password").tagName("INPUT").id("login-password").build();

    //Sign In Button
    ButtonDescription button_SihnIn=new ButtonDescription.Builder()
            .tagName("INPUT").id("login-submit").build();




    public loginPage(Browser browser){
        super(browser);
    }




    public loginPage setUsername(String userName)  throws GeneralLeanFtException{
        EditField usernameField = browser.describe(EditField.class, txt_userName);
        usernameField.highlight();
        usernameField.setValue(userName);
        return  new loginPage(browser);
    }

    public loginPage setPassword(String password) throws GeneralLeanFtException {
        EditField passWordField = browser.describe(EditField.class, txt_password);
        passWordField.highlight();
        passWordField.setValue(password);
        return new loginPage(browser);
    }

    public loginPage clickLoginBtn() throws GeneralLeanFtException {
        Button signIn = browser.describe(Button.class, button_SihnIn);
        signIn.highlight();
        signIn.click();
        return new loginPage(browser);
    }


}
