package homework.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfileScreen {
    @AndroidFindBy(id = "city_select_action")
    MobileElement selectCityFiled;

    public ProfileScreen(AppiumDriver<?> driver){
        super(driver);
    }


    public void chooseCity(){
        selectCityFiled.click();

    }
}
