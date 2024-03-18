import homework.GoToMainFromCartButton;
import homework.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.support.PageFactory;
import homework.screens.*;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClassHW5 extends BaseTest {

@Test
     public void homeTest() {
    MainScreen mainScreen = new MainScreen(driver);
    //проверка отображения логотипа "Мвидео" на Главном экране
    mainScreen.getLogotypeIcon().isDisplayed();
    // переход на экран Списка
    Tabbar tabbar = new Tabbar(driver);
    // нажатие на кнопку "Посмотреть каталог"
    ListsScreen listsScreen = new ListsScreen(driver);
    listsScreen.showCatalog();
    //раскрытие списка "Смартфоны и гаджеты"
    CatalogScreen catalogScreen = new CatalogScreen(driver);
    catalogScreen.openSmartphonesAndGadgets();
    // проверка отображения элемента "Samsung"
    catalogScreen.getSamsungTitle().isDisplayed();
    // переход на экран Профиль
    tabbar.goToProfile();
    //переход на выбор города
    ProfileScreen profileScreen = new ProfileScreen(driver);
    profileScreen.chooseCity();
    //закрытие экрана выбора город
    ChooseCityScreen chooseCityScreen = new ChooseCityScreen();
    chooseCityScreen.back();
    //перход на экран Корзина
    tabbar.goToCart();
    //нажатие на кнопку "На главную"
    CartScreen cartScreen = new CartScreen(driver);
    cartScreen.setGoToMainScreenByStrategy(new GoToMainFromCartButton(driver));
    //проверка, что заголовок на экране содержит текст "Я в магазине"
    assertEquals("Я в магазине", mainScreen.getStoreMainTitleText());}

}