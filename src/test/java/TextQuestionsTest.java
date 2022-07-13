import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pageObject.PageObjectMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TextQuestionsTest {

    PageObjectMainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", PageObjectMainPage.class);

    @Test
    public void questionAboutAmountCheck() {
        mainPage.checkTextQuestionAboutAmount();
    }

    @Test
    public void questionAboutBatteryChargeCheck() {
        mainPage.checkTextQuestionAboutBatteryCharge();
    }

    @Test
    public void questionAboutBeyondMkadLocationCheck() {
        mainPage.checkTextQuestionAboutBeyondMkadLocation();
    }

    @Test
    public void questionAboutLeaseTimeCheck() {
        mainPage.checkTextQuestionAboutLeaseTime();
    }

    @Test
    public void questionAboutOrderCancellationCheck() {
        mainPage.checkTextQuestionAboutOrderCancellation();
    }

    @Test
    public void questionAboutPriceCheck() {
        mainPage.checkTextQuestionAboutPrice();
    }

    @Test
    public void questionAboutTimeChangeCheck() {
        mainPage.checkTextQuestionAboutTimeChange();
    }

    @Test
    public void questionAboutTodayOrderCheck() {
        mainPage.checkTextQuestionAboutTodayOrder();
    }

}
