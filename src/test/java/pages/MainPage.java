package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            checkUpperMenu = $("[data-testid='nav-item']")
                    ;

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }
    public MainPage checkUpperMenu() {
    //    checkUpperMenu.shouldHave(text("Аренда"));
        checkUpperMenu.shouldBe(Condition.exist);
    //    check.shouldBe(Condition.exist);
        return this;
    }
}
