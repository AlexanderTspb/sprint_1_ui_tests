package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;

public class PageObjectMainPage {
    //элементы главной страницы
    //1.кнопка заказать сверху
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement orderButtonHead;
    //2.статус заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement statusOrderButton;
    //3.окно для ввода номера заказа(появляется после нажатия пред кнопки)
    @FindBy(how = How.CSS, using = ".Input_Input__1iN_Z.Header_Input__xIoUq")
    private SelenideElement searchOrderField;
    //4.кнопка поиска номера заказа GO
    @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Header_Button__28dPO")
    private SelenideElement searchOrderButton;
    //5.кнопка заказать в середине
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    private SelenideElement orderButtonMid;

    //6.вопрос 1
    //проверка на ожидаемый текст $(byXpath(".//div[@id='accordion__panel-0']/p")).shouldHave(exactText("..."));
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement questionAboutPrice;
    // локатор для поиска текста вопроса TextQuestionAboutPrice
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-0']/p")
    private SelenideElement textQuestionAboutPrice;

    //6.клик по кнопке вопрос 1
    public void clickQuestionAboutPrice() {
        questionAboutPrice.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutPrice() {
        clickQuestionAboutPrice();
        textQuestionAboutPrice.shouldBe(visible);
        textQuestionAboutPrice.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    //7.вопрос 2
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement questionAboutAmount;
    // локатор для поиска текста вопроса TextQuestionAboutAmount
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-1']/p")
    private SelenideElement textQuestionAboutAmount;

    //7.клик по кнопке вопрос 2
    public void clickQuestionAboutAmount() {
        questionAboutAmount.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutAmount() {
        clickQuestionAboutAmount();
        textQuestionAboutAmount.shouldBe(visible);
        textQuestionAboutAmount.shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //8.вопрос 3
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement questionAboutLeaseTime;
    // локатор для поиска текста вопроса TextQuestionAboutLeaseTime
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-2']/p")
    private SelenideElement textQuestionAboutLeaseTime;

    //8.клик по кнопке вопрос 3
    public void clickQuestionAboutLeaseTime() {
        questionAboutLeaseTime.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutLeaseTime() {
        clickQuestionAboutLeaseTime();
        textQuestionAboutLeaseTime.shouldBe(visible);
        textQuestionAboutLeaseTime.shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //9.вопрос 4
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement questionAboutTodayOrder;
    // локатор для поиска текста вопроса TextQuestionAboutTodayOrder
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-3']/p")
    private SelenideElement textQuestionAboutTodayOrder;

    //9.клик по кнопке вопрос 4
    public void clickQuestionAboutTodayOrder() {
        questionAboutTodayOrder.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutTodayOrder() {
        clickQuestionAboutTodayOrder();
        textQuestionAboutTodayOrder.shouldBe(visible);
        textQuestionAboutTodayOrder.shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //10.вопрос 5
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement questionAboutTimeChange;
    // локатор для поиска текста вопроса TextQuestionAboutTimeChange
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-4']/p")
    private SelenideElement textQuestionAboutTimeChange;

    //10.клик по кнопке вопрос 5
    public void clickQuestionAboutTimeChange() {
        questionAboutTimeChange.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutTimeChange() {
        clickQuestionAboutTimeChange();
        textQuestionAboutTimeChange.shouldBe(visible);
        textQuestionAboutTimeChange.shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //11.вопрос 6
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement questionAboutBatteryCharge;
    // локатор для поиска текста вопроса TextQuestionAboutBatteryCharge
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-5']/p")
    private SelenideElement textQuestionAboutBatteryCharge;

    //11.клик по кнопке вопрос 6
    public void clickQuestionAboutBatteryCharge() {
        questionAboutBatteryCharge.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutBatteryCharge() {
        clickQuestionAboutBatteryCharge();
        textQuestionAboutBatteryCharge.shouldBe(visible);
        textQuestionAboutBatteryCharge.shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    //12.вопрос 7
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement questionAboutOrderCancellation;
    // локатор для поиска текста вопроса TextQuestionAboutOrderCancellation
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-6']/p")
    private SelenideElement textQuestionAboutOrderCancellation;

    //12.клик по кнопке вопрос 7
    public void clickQuestionAboutOrderCancellation() {
        questionAboutOrderCancellation.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutOrderCancellation() {
        clickQuestionAboutOrderCancellation();
        textQuestionAboutOrderCancellation.shouldBe(visible);
        textQuestionAboutOrderCancellation.shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    //13.вопрос 8
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement questionAboutBeyondMkadLocation;
    // локатор для поиска текста вопроса TextQuestionAboutBeyondMkadLocation
    @FindBy(how = How.XPATH, using = ".//div[@id='accordion__panel-7']/p")
    private SelenideElement textQuestionAboutBeyondMkadLocation;

    //13.клик по кнопке вопрос 8
    public void clickQuestionAboutBeyondMkadLocation() {
        questionAboutBeyondMkadLocation.scrollIntoView(true).click();
    }

    //проверка текста вопроса
    public void checkTextQuestionAboutBeyondMkadLocation() {
        clickQuestionAboutBeyondMkadLocation();
        textQuestionAboutBeyondMkadLocation.shouldBe(visible);
        textQuestionAboutBeyondMkadLocation.shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    //14.куки кнопка "да все привыкли"
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement cookieConfirmButton;
    //15.ссылка по логотипу на "яндекс"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement logoYandexLink;
    //16.ссылка по логотипу на "самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoScooterLink;

    // методы главной страницы
    //1.клик по кнопке "заказать", которая сверху

    public void clickOrderButtonHead() {
        orderButtonHead.click();
    }

    //2.клик по кнопке "статус заказа"
    public void clickStatusOrderButton() {
        statusOrderButton.click();
    }

    //3.заполнение окна для ввода номера заказа
    public void setSearchOrderField(String number) {
        searchOrderField.setValue(number);
    }

    //4.клик по кнопке поиска номера заказа "GO"
    public void clickSearchOrderButton() {
        searchOrderButton.click();
    }

    //5.клик по кнопке "заказать" в середине
    public void clickOrderButtonMid() {
        orderButtonMid.click();
    }

    //14.клик по кнопке "да все привыкли" куки
    public void clickCookieConfirmButton() {
        cookieConfirmButton.click();
    }

    //15.клик по лого "яндекса"
    public void clickLogoYandexLink() {
        logoYandexLink.click();
    }

    //16.клик по лого "самоката"
    public void clickLogoScooterLink() {
        logoScooterLink.click();
    }

    //17метод объединяющий ввод номера заказа и клика кнопки "GO"
    public void searchOrder(String number) {
        setSearchOrderField(number);
        clickSearchOrderButton();
    }
}
