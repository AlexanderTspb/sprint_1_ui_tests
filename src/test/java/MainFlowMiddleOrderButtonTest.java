import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pageObject.PageObjectFormPage;
import pageObject.PageObjectMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainFlowMiddleOrderButtonTest {
    @Test
    public void makeOrderMiddleButtonCheck() {
        // Для запуска в браузере EDGE
        //   Configuration.browser = Browsers.EDGE;
        PageObjectMainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", PageObjectMainPage.class);
        mainPage.clickCookieConfirmButton();
        mainPage.clickOrderButtonMid();
        PageObjectFormPage formPage = page(PageObjectFormPage.class);
        formPage.makeOrder("Василий", "Васильев", "улица Пушкина д.1", "Сокольники",
                "79991112233", "10.07.2022", "сутки", "grey", "привет1");
        formPage.orderSuccessMessageIsVisible();
        //Нажатие кнопки посмотреть статус(чтобы в итоге вернуться через лого на главную страницу)
        formPage.clickSeeOrderButton();
        //Нажатие на лого
        mainPage.clickLogoScooterLink();
        //второй набор тестовых данных
        mainPage.clickOrderButtonMid();
        formPage.makeOrder("Иван", "Петров", "улица Ивановская д.1", "Черкизовская",
                "79994445566", "10.08.2022", "двое суток", "black", "привет2");
        formPage.orderSuccessMessageIsVisible();
    }
}
