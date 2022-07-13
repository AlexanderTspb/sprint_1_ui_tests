package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

public class PageObjectFormPage {
    //1.Имя поле текст div[@class='Input_InputContainer__3NykH']
    @FindBy(how = How.XPATH, using = ".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']")
    private SelenideElement firstNameField;

    public void setFirstNameField(String firstName) {
        firstNameField.setValue(firstName);
    }

    //2.Фамилия поле текст
    @FindBy(how = How.XPATH, using = ".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']")
    private SelenideElement lastNameField;

    public void setLastNameField(String lastName) {
        lastNameField.setValue(lastName);
    }

    //3.адрес поле текст
    @FindBy(how = How.XPATH, using = ".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement adressField;

    public void setAdressField(String adress) {
        adressField.setValue(adress);
    }

    //4.станция метро, сначала клик,потом выставление значения,потом выбор эл-та и клик
    @FindBy(how = How.CLASS_NAME, using = "select-search__input")
    private SelenideElement metroStationInput;

    public void setMetroStationInput(String metroStation) {
        metroStationInput.setValue(metroStation);
        pickMetroStationDropDownMenu(metroStation);
        //   metroStationSelector.click();
    }

    //селектор,открывающийся после ввода инпута
    ElementsCollection dropDownMenuMetroStation = $$(byClassName("select-search__select"));

    public void pickMetroStationDropDownMenu(String metroStation) {
        dropDownMenuMetroStation.findBy(Condition.text(metroStation)).scrollIntoView(true).shouldBe(visible).click();
    }

    //5.телефон
    @FindBy(how = How.XPATH, using = ".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement numberPhoneField;

    public void setNumberPhoneField(String number) {
        numberPhoneField.setValue(number);
    }

    //кнопка далее
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']")
    private SelenideElement nextOrderFormPageButton;

    public void clickNextOrderFormPageButton() {
        nextOrderFormPageButton.click();
    }

    //6.когда привезти выпадающий календарь
    @FindBy(how = How.XPATH, using = ".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']")
    private SelenideElement calendarField;

    public void setCalendarField(String date) {
        calendarField.setValue(date);
    }

    //7.срок аренды выпадающий список
    @FindBy(how = How.XPATH, using = ".//span[@class='Dropdown-arrow']")
    private SelenideElement leaseTimeFieldArrow;

    public void clickLeaseTimeFieldArrow() {
        leaseTimeFieldArrow.click();
    }

    ElementsCollection dropDownMenuLeaseTime = $$(byClassName("Dropdown-option"));

    public void pickLeaseTimeFieldDropDownMenu(String leaseTime) {
        dropDownMenuLeaseTime.findBy(Condition.text(leaseTime)).scrollIntoView(true).shouldBe(visible).click();
        //  leaseTimeFieldDropDownMenu.click();
    }

    //8.цвет два чек-бокса
    //для черного цвета
    @FindBy(how = How.ID, using = "black")
    private SelenideElement blackColorField;

    public void clickBlackColorField() {
        blackColorField.click();
    }

    // для серого цвета
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement greyColorField;

    public void clickGreyColorField() {
        greyColorField.click();
    }

    //метод,который кликает на определенный цвет в зависимости от условия
    public void setColorField(String color) {
        if (Objects.equals(color, "black")) {
            clickBlackColorField();
        } else {
            clickGreyColorField();
        }
    }

    //9.комментарий поле
    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentField;

    public void setCommentField(String comment) {
        commentField.setValue(comment);
    }

    //кнопка назад
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Назад']")
    private SelenideElement backButton;

    public void clickBackButton() {
        backButton.click();
    }

    //кнопка "заказать" форма заказа
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement orderButtonForm;

    public void clickOrderButtonForm() {
        orderButtonForm.click();
    }

    //всплывающее окно с кнопками "да" и  "нет"
    // кнопка да
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']")
    private SelenideElement yesFormButton;

    public void clickYesFormButton() {
        yesFormButton.click();
    }

    //кнопка нет
    // .//div[@class='Order_Buttons__1xGrp']/button[text()='Нет']
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Нет']")
    private SelenideElement noFormButton;

    public void clickNoFormButton() {
        noFormButton.click();
    }

    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Modal__YZ-d3']")
    private SelenideElement FormButton;

    //объединение всех методов по заполнению формы
    public void makeOrder(String firstName, String lastName, String adress, String metroStation, String number, String date,
                          String leaseTime, String color, String comment) {
        setFirstNameField(firstName);
        setLastNameField(lastName);
        setAdressField(adress);
        setMetroStationInput(metroStation);
        setNumberPhoneField(number);
        clickNextOrderFormPageButton();
        //2 часть формы
        setCalendarField(date);
        //клик по стрелке для ввыбора даты
        clickLeaseTimeFieldArrow();
        pickLeaseTimeFieldDropDownMenu(leaseTime);
        setColorField(color);
        setCommentField(comment);
        //кнопка сделать заказ
        clickOrderButtonForm();
        //кнопка подтверждения заказа
        clickYesFormButton();


    }

    // окно с успешно оформленным заказом
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_ModalHeader__3FDaJ']")
    //Заказ оформлен
    private SelenideElement orderSuccessMessage;

    public void orderSuccessMessageIsVisible() {
        orderSuccessMessage.shouldBe(visible);
        orderSuccessMessage.shouldHave(text("Заказ оформлен"));
    }

    //кнопка посмотреть статус при успешном заказе Order_NextButton__1_rCA
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']")
    private SelenideElement seeOrderButton;

    public void clickSeeOrderButton() {
        seeOrderButton.click();
    }

    //ссылка по логотипу на "самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoScooterLink;

    //клик по лого "самоката"
    public void clickLogoScooterLink() {
        logoScooterLink.click();
    }

}
