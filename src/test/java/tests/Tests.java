package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты проверки главной страницы сайта")
@Tag("full")
public class Tests extends BaseTests {
    MainPage mainPage = new MainPage();

    @Test
    @Tag("smoke")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка наличия верхнего меню")
    void testUpperMenuNotEmpty() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие первого элемента", () -> {
            mainPage.checkUpperMenu();
        });
    }

    @Test
    @Tag("full")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка логотипа")
    void testUpperMenuQuantity() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие первого элемента", () -> {
            mainPage.checkLogo();
        });
    }

    @Test
    @Tag("smoke")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка наличия в футере соц сетей")
    void testFooterSocialList() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие первого элемента", () -> {
            mainPage.checkFooterSocialList();
        });
    }
}
