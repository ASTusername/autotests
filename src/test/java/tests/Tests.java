package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты проверки главной страницы сайта")
public class Tests extends BaseTests {
    MainPage mainPage = new MainPage();

    @Test
    @Tag("full")
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
    @DisplayName("Проверка первого элемента верхнего меню")
    void testUpperMenuFirstElement() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем значение первого элемента", () -> {
            mainPage.checkUpperMenuFirstElement();
        });
    }


    @Test
    @Tag("full")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка логотипа")
    void testLogo() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие логотипа", () -> {
            mainPage.checkLogo();
        });
    }

    @Test
    @Tag("full")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка наличия в футере заголовка")
    void testFooterSocialList() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем значение заголовка", () -> {
            mainPage.checkFooterTitle();
        });
    }
}
