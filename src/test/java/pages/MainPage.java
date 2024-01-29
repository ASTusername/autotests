package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            upperMenu = $("li.nav-item"),
            centerTitle = $$("h2").findBy(text("Выставки")),
            upperMenuList = $$("li.nav-item").findBy(text("Выставки")),
            logo = $("div.logo"),
            footerTitle = $("div.footer__title")
            ;

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    public MainPage checkUpperMenu() {
        upperMenu.shouldBe(Condition.exist);
        return this;
    }

    public MainPage checkUpperMenuFirstElement() {
        upperMenuList.shouldBe(Condition.exist);
        return this;
    }

    public MainPage checkLogo() {
        logo.shouldBe(Condition.exist);
        return this;
    }

    public MainPage checkFooterTitle() {
        footerTitle.shouldHave(text("О музее"));
        return this;
    }

    public MainPage checkCenterTitle() {
        centerTitle.shouldBe(Condition.exist);
        return this;
    }
}
