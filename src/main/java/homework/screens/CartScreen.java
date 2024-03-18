package homework.screens;

import homework.GoToMainFromCartButton;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartScreen extends Tabbar {
    @AndroidFindBy(id = "cart_empty_check_this_out_button")
    MobileElement goToMainButton;

    public CartScreen(AppiumDriver<?> driver){
        super(driver);
    }

    public void setGoToMainScreen(){
        goToMainButton.click();
    }

    public void setGoToMainScreenByStrategy(GoToMainFromCartButton goToMainScreenByStrategy){
        goToMainScreenByStrategy.goToMain();


    }
}

