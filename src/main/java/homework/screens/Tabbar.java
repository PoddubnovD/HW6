package homework.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Tabbar extends Screen {
    @AndroidFindBy(accessibility = "Списки")
    MobileElement listsIcon;
    @AndroidFindBy(accessibility = "Профиль")
    MobileElement ProfileIcon;
    @AndroidFindBy(accessibility = "Корзина")
    MobileElement cartIcon;

    @AndroidFindBy(accessibility = "Главная")
    MobileElement mainIcon;
    
    public Tabbar(AppiumDriver<?> driver){ super(driver);}
    
    public void goToLists() { listsIcon.click(); }
    
    
    public void goToProfile() { ProfileIcon.click();}
    
    public void goToMain(){ mainIcon.click();}

    public void goToCart() {
    }
}

