package homework;

import io.appium.java_client.AppiumDriver;
import homework.screens.CartScreen;

public class GoToMainFromCartButton implements GoToMainScreenStretegy {

    AppiumDriver<?> driver;

    public GoToMainFromCartButton(AppiumDriver<?> driver){
        this.driver = driver;
    }

    @Override
    public void goToMain() {
        CartScreen cartScreen = new CartScreen(driver);
        cartScreen.goToMainScreen();

    }
}
