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
            vkLink = $("a[href^=https://vk.com/]"),
            youtubeLink = $("[ahref^=https://youtube.com/]"),
            tripadvisorLink = $("a[href^=https://tripadvisor.com/]"),
            tmeLink = $("a[href^=https://t.me/]"),
            okLink = $("a[href^=https://ok.ru/]"),
            maveLink = $("a[href^=https://tgallery.mave.digital/]")
            ;
    private final ElementsCollection
            upperMenuList = $$("ul.nav-list"),
            footerSocialList = $$("div.footer-social__list")
            ;
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }
    public MainPage checkUpperMenu() {
        upperMenu.shouldBe(Condition.exist);
        return this;
    }
    public MainPage checkUpperMenuQuantity() {
        upperMenuList.shouldHave(size(9));
        return this;
    }
    public MainPage checkFooterSocialList() {
        vkLink.shouldBe(exist);
        youtubeLink.shouldBe(exist);
        tripadvisorLink.shouldBe(exist);
        tmeLink.shouldBe(exist);
        okLink.shouldBe(exist);
        maveLink.shouldBe(exist);
    return this;
    }
}
