import org.junit.Test;
import pageObject.PageObjectFormPage;
import pageObject.PageObjectMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import com.codeborne.selenide.*;

public class MainFlowTest {

    @Test
    public void makeOrderCheck() {
        //open("https://qa-scooter.praktikum-services.ru/", PageObjectMainPage.class);
        // Для запуска в браузере EDGE
        // Configuration.browser = Browsers.EDGE;
        PageObjectMainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", PageObjectMainPage.class);
        mainPage.clickOrderButtonHead();
        //mainPage.clickCookieConfirmButton();
        PageObjectFormPage formPage = page(PageObjectFormPage.class);
        formPage.makeOrder("Василий", "Васильев", "улица Пушкина д.1", "Котельники",
                "79991112233", "10.07.2022", "трое суток", "grey", "привет3");
        formPage.orderSuccessMessageIsVisible();
        //Нажатие кнопки посмотреть статус(чтобы в итоге вернуться через лого на главную страницу)
        formPage.clickSeeOrderButton();
        //Нажатие на лого
        mainPage.clickLogoScooterLink();
        //второй набор тестовых данных
        mainPage.clickOrderButtonMid();
        formPage.makeOrder("Петр", "Иванов", "улица Петровская д.3", "Черкизовская",
                "79994445566", "10.06.2022", "двое суток", "black", "привет4");
        formPage.orderSuccessMessageIsVisible();
    }
}
