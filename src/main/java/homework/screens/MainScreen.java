package homework.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainScreen extends Tabbar {
    @AndroidFindBy(id = "mvideo_logo")
    MobileElement logotypeIcon;
    @AndroidFindBy(id = "store_main_title")
    MobileElement storeMainTitle;

    public MainScreen(AndroidDriver<?> driver) {
        super(driver);
    }

    public MobileElement getLogotypeIcon() {
        return logotypeIcon;
    }
    public String getStoreMainTitleText() {
        return  storeMainTitle.getText();

    }
}
