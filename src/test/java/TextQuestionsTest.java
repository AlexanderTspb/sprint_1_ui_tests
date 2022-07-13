import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pageObject.PageObjectMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class TextQuestionsTest {

    PageObjectMainPage mainPage =  open("https://qa-scooter.praktikum-services.ru/", PageObjectMainPage.class);

    @Test
    public void questionAboutAmountCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutAmount();


    }

    @Test
    public void questionAboutBatteryChargeCheck() {
     //    Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutBatteryCharge();

    }

    @Test
    public void questionAboutBeyondMkadLocationCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutBeyondMkadLocation();
    }

    @Test
    public void questionAboutLeaseTimeCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutLeaseTime();

    }

    @Test
    public void questionAboutOrderCancellationCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutOrderCancellation();

    }

    @Test
    public void questionAboutPriceCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutPrice();

    }

    @Test
    public void questionAboutTimeChangeCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutTimeChange();

    }

    @Test
    public void questionAboutTodayOrderCheck() {
     //   Configuration.browser = Browsers.EDGE;
        mainPage.checkTextQuestionAboutTodayOrder();

    }


}
