package PageObjects;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;

public class homePage extends abstructPageLoaderDriver {

    //profile image
    ImageDescription pro_image=new ImageDescription.Builder()
            .alt("ABHINABA GHOSH").className("lazy-image loaded feed-identity-module__member-photo profile-rail-card__member-photo EntityPhoto-circle-5").build();

    // logout btn1
    ImageDescription sign_off_pre_btn=new ImageDescription.Builder()
            .alt("ABHINABA GHOSH").className("nav-item__profile-member-photo nav-item__icon").build();

    // logout btn2
    WebElementDescription signoff_elem1=new WebElementDescription.Builder()
            .className("block ember-view").tagName("a").innerText("Sign out").build();



    public homePage(Browser browser){
        super(browser);
    }

    public Boolean isLoggedIn() throws GeneralLeanFtException {
        Image pro_image_login = browser.describe(Image.class,pro_image);
        pro_image_login.highlight();
        if (pro_image_login.exists(10)) return true;
        else return false;

    }

    public homePage clickLogoutbtn() throws GeneralLeanFtException {
        Image sign_off_pro_btn=browser.describe(Image.class,sign_off_pre_btn);
        sign_off_pro_btn.highlight();
        sign_off_pro_btn.click();

        WebElement signoff_elem=browser.describe(WebElement.class,signoff_elem1);
        signoff_elem.highlight();
        signoff_elem.click();

        return new homePage(browser);

    }



}
